public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Конструктор для инициализации стека
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Метод для добавления элемента в стек
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " to the stack");
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    // Метод для извлечения элемента из стека
    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println("Popped " + poppedValue + " from the stack");
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop");
            return -1; // Возвращаем значение по умолчанию в случае пустого стека
        }
    }

    // Метод для получения верхнего элемента без его удаления
    public int peek() {
        if (top >= 0) {
            System.out.println("Peeked at " + stackArray[top]);
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek");
            return -1; // Возвращаем значение по умолчанию в случае пустого стека
        }
    }

    // Метод для проверки, пуст ли стек
    public boolean isEmpty() {
        return top == -1;
    }

    // Метод для проверки, полон ли стек
    public boolean isFull() {
        return top == maxSize - 1;
    }
}