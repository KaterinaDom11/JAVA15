package ru.netology.ticket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AviaSoulsTest {

    Ticket ticket1 = new Ticket("Москва", "Казань", 3000, 10_00, 14_00);
    Ticket ticket2 = new Ticket("Москва", "Казань", 2000, 12_00, 16_00);
    Ticket ticket3 = new Ticket("Москва", "Казань", 5000, 16_00, 20_00);
    Ticket ticket4 = new Ticket("Москва", "Казань", 1500, 11_00, 15_00);
    Ticket ticket5 = new Ticket("Москва", "Казань", 2000, 18_00, 22_00);

    @Test
    public void sortByPriceOne (){
        AviaSouls ticket = new AviaSouls();

        ticket.add(ticket1);
        ticket.add(ticket2);

        Assertions.assertEquals(1, ticket1.compareTo(ticket2));

    }
    @Test
    public void sortByPriceTwo(){
        AviaSouls ticket = new AviaSouls();

        ticket.add(ticket3);
        ticket.add(ticket4);

        Assertions.assertEquals(-1, ticket4.compareTo(ticket3));

    }
    @Test
    public void sortByPriceEqual(){
        AviaSouls ticket = new AviaSouls();

        ticket.add(ticket2);
        ticket.add(ticket5);

        Assertions.assertEquals(0, ticket2.compareTo(ticket5));

    }
    @Test
    public void sortByPriceUp() {
        AviaSouls ticket = new AviaSouls();

        ticket.add(ticket1);
        ticket.add(ticket2);
        ticket.add(ticket3);
        ticket.add(ticket4);
        ticket.add(ticket5);

        Ticket[] expected = {ticket4, ticket2, ticket5, ticket1, ticket3}; // Ожидаемый порядок
        Ticket[] actual = ticket.search("Москва", "Казань");

        Assertions.assertArrayEquals(expected, actual);

    }

}
