//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Создаем стек размером 5
        Stack myStack = new Stack(5);

        // Добавляем элементы в стек
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        // Извлекаем элементы из стека
        myStack.pop();
        myStack.pop();

        // Получаем верхний элемент без его удаления
        myStack.peek();

        // Проверяем, пуст ли стек
        System.out.println("Is the stack empty? " + myStack.isEmpty());

        // Проверяем, полон ли стек
        System.out.println("Is the stack full? " + myStack.isFull());
    }
}