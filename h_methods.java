class comp {
    public void play() {
        System.out.println("Playing");
    }

    public String getapen(int cost) {
        if (cost >= 10) {
            return "pen";
        } else {
            return "nothing";
        }
    }
}

public class h_methods {
    public static void main(String[] args) {
        comp obj = new comp();
        obj.play();
        System.out.println(obj.getapen(1));
    }
}
