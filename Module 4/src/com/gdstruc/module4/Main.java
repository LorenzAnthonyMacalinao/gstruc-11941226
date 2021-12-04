package com.gdstruc.module4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(7);
        Random random = new Random();

        int round = 0;

        while(round < 10)
        {
            int x = random.nextInt(7) + 1;


                queue.add(new Player(1, "aceu", 100));
                queue.add(new Player(2, "Sinatraa", 100));
                queue.add(new Player(3, "Subroza", 95));
                queue.add(new Player(4, "ploo", 98));
                queue.add(new Player(5, "TenZ", 95));
                queue.add(new Player(6, "Pokimane", 100));
                queue.add(new Player(7, "dredrenz", 87));

            System.out.println("");
            if(queue.size() >= 5)
            {
                round++;
                int counter = 0;
                while(counter < 5)
                {
                    queue.remove();
                    counter++;
                }
                System.out.println("\nRound " + round + " started.\n");
                System.out.println("");
            }
            queue.printQueue();
        }
    }
}

