package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.lang.StrictMath.exp;


class NeuralCell {

    private List<Double> dendrites =new ArrayList<>(20);;
    private List<Double> synapses = new ArrayList<>(20);


    public NeuralCell(List<Double> synapses   ,List<Double> den ) {
        this.synapses = synapses ;
      this.dendrites =den ;
    }

    public double dls() {
        double tmp = 0;
        for (int i = 0; i < synapses.size(); i++) {
            tmp += (synapses.get(i) * synapses.get(i));

        }
        tmp = Math.sqrt(tmp);
        //System.out.println(tmp);
return tmp;

    }
    public double dld() {
        double tmp = 0;
        for (int i = 0; i < dendrites.size(); i++) {
            tmp += (dendrites.get(i) * dendrites.get(i));

        }
        tmp = Math.sqrt(tmp);
        //System.out.println(tmp);
        return tmp;
    }

    public void normalizuj(){
    double tmp = this.dls();
        for (int i = 0; i <synapses.size() ; i++) {
            edit_synapses((synapses.get(i)/tmp) , i);
        }

    }


    public double iloczynskalarny(){
        double iloczyn= 0;
        for (int i = 0; i <dendrites.size() ; i++) {
            iloczyn += this.getInputData(i)*this.getInputWeight(i);
        }

        return iloczyn;
    }


    public double finalizeData(double membranePotential) {
        //double wynik = (2 / (1 + exp(-membranePotential)))-1;




        if(membranePotential>0)
           return 1;
        else
            return -1;
    }

    // uczenie bez współczynnikiem
    public void ucz(  double wspUczenia) {
        double waga;
        for (int i = 0; i < synapses.size() ; i++) {

            edit_synapses(this.getInputWeight(i) + wspUczenia *(this.getInputData(i) - this.getInputWeight(i) )   ,i );


        }
    }



    public int getInputSize() {
        return dendrites.size();
    }


    public void addInput(double cos) {
        dendrites.add(cos);
    }

    public void newIn(int index, double cos) {

        dendrites.add(index,cos);
    }


    public void edit_synapses(double waga, int index) {
        synapses.set(index, waga);
    }


    public void addInput(double count, double cos) {
        for (int i = 1; i <= count; i++) {

            this.addInput(cos);
            cos++;
        }

    }



    public double getInputData(int index) {
        return dendrites.get(index);
    }


    public void setInputData(int index, double value) {
        dendrites.set(index, value);
    }


    public double getInputWeight(int index) {
        return synapses.get(index);
    }


    public void setInputWeight(int index, double weight) {
        synapses.set(index, weight);
    }


    public double processCellNode(int index) {
        return (dendrites.get(index) * synapses.get(index));
    }


    public double getMembranePotential() {
        if (getInputSize() == 0)
            return -1;

        double sum = 0;
        for (int i = 0; i < getInputSize(); i++)
            sum += processCellNode(i);

        return sum;
    }


}