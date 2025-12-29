package designpatterns.builder;

public class Computer {
    private String ram;
    private String hdd;
    private String graphicCard;

    private Computer(ComputerBuilder computerBuilder) {
       this.graphicCard = computerBuilder.graphicCard;
       this.hdd = computerBuilder.hdd;
       this.ram = computerBuilder.ram;
    }

    static class ComputerBuilder{
        private String ram;
        private String hdd;
        private String graphicCard;

        public ComputerBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setHdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public ComputerBuilder setGraphicCard(String graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }

        public ComputerBuilder(String ram, String hdd, String graphicCard) {
            this.ram = ram;
            this.hdd = hdd;
            this.graphicCard = graphicCard;
        }

        public ComputerBuilder() {
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
