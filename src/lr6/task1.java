package lr6;

public class task1 {
        private char symbolField;      // символьное поле
        private String textField;      // текстовое поле

        // Перегруженный метод для присваивания с символьным аргументом
        public void setValue(char c) {
            this.symbolField = c;
        }

        // Перегруженный метод для присваивания с текстовым аргументом
        public void setValue(String s) {
            this.textField = s;
        }

        // Перегруженный метод для присваивания с символьным массивом
        public void setValue(char[] arr) {
            if (arr.length == 1) {
                // если массив из одного элемента, присваиваем символьное поле
                this.symbolField = arr[0];
            } else if (arr.length > 1) {
                // если элементов больше одного, формируем строку и присваиваем текстовое поле
                this.textField = new String(arr);
            }
        }

        // Методы для отображения текущих значений (для проверки)
        public void printValues() {
            System.out.println("Символьное поле: " + symbolField);
            System.out.println("Текстовое поле: " + textField);
        }

        public static void main(String[] args) {
            task1 obj = new task1();

            obj.setValue('A'); // присваивание символьного значения
            obj.printValues();

            obj.setValue("Hello"); // присваивание текстового значения
            obj.printValues();

            obj.setValue(new char[] {'B'}); // массив из одного элемента
            obj.printValues();

            obj.setValue(new char[] {'H', 'e', 'l', 'l', 'o'}); // массив из нескольких элементов
            obj.printValues();
        }
    }