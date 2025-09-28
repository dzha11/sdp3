public class Main {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone(); // создаём старый телефон
        NewCharger adapter = new PhoneAdapter(oldPhone); // оборачиваем его адаптером

        adapter.charge(); // вызываем новый метод, реально заряжается старый телефон
    }
}
