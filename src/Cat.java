public class Cat {
    private String name;
    private String weight;
    private String color;
    private String voice;

    public void east(){}

    public void setName(String names)
    {this.name = names; }

    public String getName() {return this.name;}
    public void setVoice(String voice)
    {this.voice = voice; }
    public String getVoice() {return this.voice;}

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void all_data(String name, String weight, String color,String voice){
        setName(name); setWeight(weight); setColor(color);setVoice(voice);
    }
    public String getall_data(){
        return "Кличка  кота"+ getName()+"\nВес "+ getWeight()+ "\nЦвет "+ getColor() + "\nГолос "+ getVoice();
    }
}