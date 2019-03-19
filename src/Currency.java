public enum Currency {

    RUR("Российский рубль"),
    EUR("Евро"),
    USD("Доллар США");

    private String title;

    Currency(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
