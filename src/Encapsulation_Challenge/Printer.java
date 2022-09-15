package Encapsulation_Challenge;

public class Printer {


    // All Fields Declared in Private
    // All in One(Class field + methods, 정보 은닉)

    /*

    이 특성으로 객체 내부의 상태와 동작의 접근 방법을 강제.

    public - 다른 객체에서 해당 객체의 인스턴스를 생성하여 접근 가능
    protected - 해당 객체를 상속받은 객체 내부에서 접근 가능
    default - 동일한 패키지 내의 객체에서 인스턴스를 생성하여 접근할 수 있다
    private - 선언된 객체 내부에서만 사용 가능하고, 외부에선 어떠한 방법으로던 접근 불가.
     */
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // Constructor
    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
