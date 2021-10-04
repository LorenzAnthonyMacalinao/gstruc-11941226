package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;
    private int size = 0;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size += 1;
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null)
        {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
        System.out.println(size);

    }

    public Player removeFirstElement()
    {
        Player next = head.getPlayer();
        head = head.getNextPlayer();
        size -= 1;
        return next;
    }

    public boolean contains(Player target)
    {
        return true;
    }


}
