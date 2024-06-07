package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY = -1;
    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * klasa reprezentująca węzeł w liście dwukierukowej
     */
    private static class Node {
        /**
         * Wartość stała przechowywana w węźle
         */
        private final int value;
        /**
         * Referencja do poprzedniego węzła
         */
        private Node prev;
        /**
         * Referencja do następnego węzła
         */
        private Node next;

        /**
         * Konstruktor tworzący nowy węzeł z zadaną wartością.
         *
         * @param i wartość przypisywana do węzła
         */
        public Node(int i) {
            value = i;
        }

        /**
         * Metoda zwracająca wartość przechowywaną w węźle.
         *
         * @return wartość przechowywana w węźle
         */
        public int getValue() {
            return value;
        }

        /**
         * Metoda zwracająca referencję do poprzedniego węzła.
         *
         * @return referencja do poprzedniego węzła
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Metoda ustawiająca referencję do poprzedniego węzła.
         *
         * @param prev referencja do poprzedniego węzła
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Metoda zwracająca referencję do następnego węzła.
         *
         * @return referencja do następnego węzła
         */
        public Node getNext() {
            return next;
        }

        /**
         * Metoda ustawiająca referencję do następnego węzła.
         *
         * @param next referencja do następnego węzła
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }

}
