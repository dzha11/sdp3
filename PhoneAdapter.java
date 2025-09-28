class PhoneAdapter implements NewCharger {   // адаптер, чтобы старый телефон мог заряжаться новым зарядником
    private OldPhone oldPhone; // старый телефон
    public PhoneAdapter(OldPhone oldPhone) {
        this.oldPhone = oldPhone; // сохраняем старый телефон
    }
    @Override
    public void charge() {
        oldPhone.chargeOld(); // используем старый метод через адаптер
    }
}
