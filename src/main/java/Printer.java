public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets(){
        return sheets;
    }

    public int getToner(){
        return toner;
    }

    public String print(int pages, int copies){
        int paperRequired = pages * copies;
        int tonerRequired = paperRequired;
        if (paperRequired <= sheets){
                sheets -= paperRequired;
                toner -= tonerRequired;
            return "print complete!";
        }
        else {
            return "cannot print - not enough paper";
        }
    }
}
