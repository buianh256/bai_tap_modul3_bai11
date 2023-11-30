package model;

public class Product {
    private int codeId;
    private String name;
    private String type;
    private int money;
    private String producer;

    public Product(int codeId, String name, String type, int money, String producer) {
        this.codeId = codeId;
        this.name = name;
        this.type = type;
        this.money = money;
        this.producer = producer;
    }

    public int getCodeId() {
        return codeId;
    }

    public void setCodeId(int codeId) {
        this.codeId = codeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
