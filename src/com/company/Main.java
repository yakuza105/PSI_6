package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
     private  static List<Integer> zwyciestwa = new ArrayList<>();
    private  static List<Integer> klastyr = new ArrayList<>();
    private  static List<Integer> zmiany = new ArrayList<>();
    private static  double p = 0.05;
    private static  double lambda = 0.1;

    private static double tabA[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1};
    private static double tabB[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0};
    private static double tabC[] = {0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0};
    private static double tabD[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0};
    private static double tabE[] = {1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1};
    private static double tabF[] = {1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0};
    private static double tabG[] = {1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1};
    private static double tabH[] = {1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1};
    private static double tabI[] = {1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0};
    private static double tabJ[] = {0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0};
    private static double tabK[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1};
    private static double tabL[] = {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1};
    private static double tabM[] = {1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1};
    private static double tabN[] = {1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1};
    private static double tabO[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0};
    private static double tabP[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0};
    private static double tabQ[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1};
    private static double tabR[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1};
    private static double tabS[] = {1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1};
    private static double tabT[] = {0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0};
    // testowe
    private static double tabPP[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0};
    private static double tabAA[] = {0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0};
    private static double tabBB[] = {1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0};
    private static double tabCC[] = {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0};












    public static void main(String[] args) {
        int k = 20;
        int liczbaliter = 4;
        int lneuronów = 20;


        List<NeuralCell> neuronList = new ArrayList<>(20);
        List<Double> wagiNeuronu;
        List<Double> wejscia ;
        for (int i = 0; i < lneuronów; i++) {
            wagiNeuronu = new ArrayList<>();
            wejscia = new ArrayList<>();
            zwyciestwa.add(0);
            klastyr.add(0);
            zmiany.add(0);
            for (int j = 0; j < k; j++) {
                double losowa = ThreadLocalRandom.current().nextDouble(0.0, 0.5);
                double losowa2 = ThreadLocalRandom.current().nextDouble(-1.0, 1.0);

                wagiNeuronu.add(losowa);
                wejscia.add(losowa2);
            }
            neuronList.add(new NeuralCell(wagiNeuronu , wejscia));

        }


normalizujj(neuronList);

//wys2(neuronList);

//uczenie bez współczynika
      for (int i = 0; i <100 ; i++) {
            zmienwejscie(neuronList, tabA);
            lernmore(neuronList , p ,0);
            zmienwejscie(neuronList, tabB);
            lernmore(neuronList , p,1);
            zmienwejscie(neuronList, tabC);
            lernmore(neuronList , p,2);
            zmienwejscie(neuronList, tabD);
            lernmore(neuronList , p,3);
            zmienwejscie(neuronList, tabE);
            lernmore(neuronList , p,4);
            zmienwejscie(neuronList, tabF);
            lernmore(neuronList , p,5);
            zmienwejscie(neuronList, tabG);
            lernmore(neuronList , p,6);
            zmienwejscie(neuronList, tabH);
            lernmore(neuronList , p,7);
            zmienwejscie(neuronList, tabI);
            lernmore(neuronList , p,8);
            zmienwejscie(neuronList, tabJ);
            lernmore(neuronList , p,9);
            zmienwejscie(neuronList, tabK);
            lernmore(neuronList , p,10);
            zmienwejscie(neuronList, tabL);
            lernmore(neuronList , p,11);
            zmienwejscie(neuronList, tabM);
            lernmore(neuronList , p,12);
            zmienwejscie(neuronList, tabN);
            lernmore(neuronList , p,13);
            zmienwejscie(neuronList, tabO);
            lernmore(neuronList , p,14);
            zmienwejscie(neuronList, tabP);
            lernmore(neuronList , p,15);
            zmienwejscie(neuronList, tabQ);
            lernmore(neuronList , p,16);
            zmienwejscie(neuronList, tabR);
            lernmore(neuronList , p,17);
            zmienwejscie(neuronList, tabS);
            lernmore(neuronList , p,18);
            zmienwejscie(neuronList, tabT);
            lernmore(neuronList , p,19);
          lambda=lambda-0.001;


        }


        klastyr.add(0);
        klastyr.add(0);
        klastyr.add(0);
        klastyr.add(0);
        zmienwejscie(neuronList, tabAA);
        lernmore(neuronList , p,20);
        zmienwejscie(neuronList, tabBB);
        lernmore(neuronList , p,21);
        zmienwejscie(neuronList, tabCC);
        lernmore(neuronList , p,22);
        zmienwejscie(neuronList, tabPP);
        lernmore(neuronList , p,23);






       wystab(zwyciestwa);
     wysklastyr(klastyr);
     wyszmiany(zmiany);
       // System.out.println("po");
        //wys2(neuronList);





    }

    public static void normalizujj(List<NeuralCell> x ){
        for (int i = 0; i <x.size() ; i++) {

        x.get(i).normalizuj();


        }




    }





    public  static  void  wys2(List<NeuralCell> x){
        for (int i = 0; i < x.size(); i++) {


            for (int j = 0; j < x.get(0).getInputSize(); j++) {
                java.text.DecimalFormat dff = new java.text.DecimalFormat("0.000");
                java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
                if (x.get(i).getInputWeight(j) > 0 && x.get(i).getInputWeight(j)<10 ) {

                    System.out.print("\033[31m" + "  " + dff.format(x.get(i).getInputWeight(j)));
                }
                 else if (x.get(i).getInputWeight(j) >= 10 ) {


                     System.out.print("\033[34m" + "  " + df.format(x.get(i).getInputWeight(j)));
                 }

                else if (x.get(i).getInputWeight(j) <= -10 ) {

                    java.text.DecimalFormat dfff = new java.text.DecimalFormat("0.0");
                    System.out.print("\033[34m" + "  " + dfff.format(x.get(i).getInputWeight(j)));
                }

                else
                    System.out.print("\033[37m" + "  " + df.format(x.get(i).getInputWeight(j)));


            }
            System.out.println();
        }
    }



   // }
   public static void wystab(List<Integer> x  ) {
       System.out.println("zwyciestwa:");
       for (int i = 0; i <x.size() ; i++) {
           System.out.println("index: " + (i + 1) +"  wartosc: " + x.get(i));

       }

    }
    public static void wyszmiany(List<Integer> x  ) {
        System.out.println("zmiany jako sąsiad:");
        for (int i = 0; i <x.size() ; i++) {
            System.out.println("neuron " + (i + 1) +"  liczba zmian " + x.get(i));

        }

    }


    public static void wysklastyr(List<Integer> x  ) {
        System.out.println("dopasowanie liter do klastra");
        char znak ;
        for (int i = 0; i <x.size() ; i++) {
            if(i + 65  < 85) {
                znak = (char) (65 + i);
                System.out.println("index: " + znak + "  wartosc: " + x.get(i));
            }
            else

                System.out.println("testowa  " + (i-19) + "  wartosc: " + x.get(i));

        }

    }




    public static void zmienwejscie(List<NeuralCell> x ,double[] tab ){



        for (int j = 0; j <x.size(); j++) {
            for (int i = 0; i <x.size() ; i++) {
                x.get(j).setInputData(i,tab[i]);
            }



        }



    }




    public static double lernmore(List<NeuralCell> x ,double wsp , int ind){

        double tmp = x.get(0).iloczynskalarny();
        int index = 0;
        for (int j = 1; j <x.size() ; j++) {
            if(tmp< x.get(j).iloczynskalarny()) {
            tmp = x.get(j).iloczynskalarny();
            index = j;
            }

        }




            x.get(index).ucz(wsp);
            x.get(index).normalizuj();
            zwyciestwa.set(index , zwyciestwa.get(index) +1);
       // zmiany.set(index,zmiany.get(index)+1);
            klastyr.set(ind,index);
        for (int j = 0; j <x.size() ; j++) {
            if(tmp - x.get(j).iloczynskalarny() <= lambda) {
                x.get(j).ucz(wsp);
                x.get(j).normalizuj();
               // zwyciestwa.set(j , zwyciestwa.get(j) +1);
                zmiany.set(j,zmiany.get(j)+1);
                klastyr.set(ind,j);
            }
        }



            return tmp;
    }





}











