package SerializationConcept;

import java.io.*;

public class ExternalizationDemo implements Externalizable {

    private String s ;
    private int i;
    private int j;

    public ExternalizationDemo(){
        System.out.println("NO args constructor called");
    }
    public ExternalizationDemo(String s, int i, int j) {
        this.s = s;
        this.i = i;
        this.j = j;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
          objectOutput.writeObject(s);
          objectOutput.writeInt(i); ;

    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        s = (String) objectInput.readObject();
        i = objectInput.readInt();
    }
}
