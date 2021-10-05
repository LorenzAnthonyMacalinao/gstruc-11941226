package com.gdstruc.midterms;

import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Main {

    public static Random rn = new Random();

    public static boolean endOfGame = false;

    public static int count(LinkedList<Card> list)
    {
        int c = 0;
        for (Card temp : list) {
            c++;
        }
        return c;
    }

    public static LinkedList<Card> deck;

    public static LinkedList<Card> hand;

    public static LinkedList<Card> discarded;

    public static void initializeDeck()
    {
        deck = new LinkedList<Card>();
        hand = new LinkedList<Card>();
        discarded = new LinkedList<Card>();
        deck.push(new Card(1, "Pikachu"));
        deck.push(new Card(2, "Bulbasaur"));
        deck.push(new Card(3, "Charmander"));
        deck.push(new Card(4, "Squirtle"));
        deck.push(new Card(5, "Caterpie"));
        deck.push(new Card(6, "Weedle"));
        deck.push(new Card(7, "Pidgey"));
        deck.push(new Card(8, "Rattata"));
        deck.push(new Card(9, "Ekans"));
        deck.push(new Card(10, "Spearow"));
        deck.push(new Card(11, "Sandshrew"));
        deck.push(new Card(12, "Nidoran"));
        deck.push(new Card(13, "Nidorina"));
        deck.push(new Card(14, "Clefairy"));
        deck.push(new Card(15, "Vulpix"));
        deck.push(new Card(16, "Jigglypuff"));
        deck.push(new Card(17, "Zubat"));
        deck.push(new Card(18, "Oddish"));
        deck.push(new Card(19, "Paras"));
        deck.push(new Card(20, "Venonat"));
        deck.push(new Card(21, "Diglett"));
        deck.push(new Card(22, "Meowth"));
        deck.push(new Card(23, "Psyduck"));
        deck.push(new Card(24, "Mankey"));
        deck.push(new Card(25, "Growlithe"));
        deck.push(new Card(26, "Poliwag"));
        deck.push(new Card(27, "Abra"));
        deck.push(new Card(28, "Machop"));
        deck.push(new Card(29, "Bellsprout"));
        deck.push(new Card(30, "Tentacool"));
    }

    public static void processOneRandomCommand()
    {
        int answer = rn.nextInt(3);
        if (answer == 0)
        {
            //Draw x cards (x can be a random value from 1 to 5)
            int x = rn.nextInt(5) + 1;

            if (x > count(deck))
            {
                x = count(deck);
            }

            System.out.println("Draw " + x + " cards.");

            for (int i = 0; i < x; i++)
            {
                Card temp = deck.pop();
                hand.push(temp);
            }
        }
        else if (answer == 1)
        {
            //Discard x cards
            int x = rn.nextInt(5) + 1;

            if (x > count(hand))
            {
                x = count(hand);
            }

            System.out.println("Discard " + x + " cards.");

            for (int i = 0; i < x; i++) {
                Card temp = hand.pop();
                discarded.push(temp);
            }
        }
        else if (answer == 2)
        {
            //Get x cards from the discarded pile
            int x = rn.nextInt(5) + 1;

            if (x > count(discarded))
            {
                x = count(discarded);
            }
            System.out.println("Get from discarded " + x + " cards.");

            for (int i = 0; i < x; i++)
            {
                Card temp = discarded.pop();
                hand.push(temp);
            }
        }
        if (count(deck) == 0)
        {
            endOfGame = true;
        }
    }

    public static void display()
    {
        //display list of cards that the player is currently holding
        System.out.println("My current hand: " + count(hand));

        for (Card temp : hand) {
            System.out.println(" > " + temp);
        }
        //display remaining cards in the player deck
        System.out.println("Remaining cards: " + count(deck));

        //display the number of cards in discarded pile
        System.out.println("Discarded cards: " + count(discarded));

    }

    public static void main(String[] args) {


        initializeDeck();

        while (!endOfGame)
        {
            processOneRandomCommand();
            display();
        }

    }

}
