package com.example.syrup.funfacts;

import java.util.Random;

/**
 * Created by EP on 11/27/2017.
 */

class FactBook {
    //Fields or Member Variables - Properties about the object
    //Create array to hold facts(strings)
    //Load Array with facts
    private String[] facts = {
              /*0*/      "Ants stretch when they wake up in the morning.",
              /*1*/      "Ostriches can run faster than horses.",
              /*2*/      "Olympic gold medals are actually made mostly of silver.",
              /*3*/      "You are born with 300 bones; by the time you are an adult you will have 206.",
              /*4*/      "It takes about 8 minutes for light from the Sun to reach Earth.",
              /*5*/      "Some bamboo plants can grow almost a meter in just one day.",
              /*6*/      "The state of Florida is bigger than England.",
              /*7*/      "Some penguins can leap 2-3 meters out of the water.",
              /*8*/      "On average, it takes 66 days to form a new habit.",
              /*9*/      "Mammoths still walked the earth when the Great Pyramid was being built.",
              /*10*/     "Monkeys open bananas from the bottom"
    };

    String getFact() {
        /*The button was clicked, so update the fact TextView with a new fact
        /*Randomly select a fact*/

        //Create random object
        Random randomGenerator = new Random();

         /* Instead of hardcoding a range of numbers it is set to the String arrays length.
        ex. int randomNumber = ...nextInt( n: 10); is now ....nextInt(facts.length);
        *
        using the property array means the right # of elements will always be passed in
        + protection from errors. (i.e delete an element, call upon non existing element, = crash)
        */
        //Create int to hold random generated number
        int randomNumber = randomGenerator.nextInt(facts.length);

        //Return random fact selected by random number used as an array index #
        return facts[randomNumber];
    }
}
