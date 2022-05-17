package Keywords;

public class WapperClass {
  private   int a=10;     // instance variable
     private  byte b=100;

     private short s=3;
    boolean bf=true;
     private char c='s';
    private float f=3.4f;
  private   long l=456;

    Integer integer = new Integer(a);   // wapper class
    Byte aByte = new Byte(b);
    Short aShort = new Short(s);
    Boolean aBoolean = new Boolean(bf);
    Character ach = new Character(c);
    Float aFloat = new Float(f);
    Long aLong = new Long(l);

    public Boolean getaBoolean() {            //  using set get method
        return bf;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = bf;
    }

    public Character getAch() {
        return c ;
    }

    public void setAch(Character ach) {
        this.ach = c;
    }

    public Float getaFloat() {
        return f;
    }

    public void setaFloat(Float aFloat) {
        this.aFloat = f;
    }

    public Long getaLong() {
        return l;
    }

    public void setaLong(Long aLong) {
        this.aLong = l;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public byte getB() {
        return b;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public short getS() {
        return s;
    }

    public void setS(short s) {
        this.s = s;
    }

    public boolean isBf() {
        return bf;
    }

    public void setBf(boolean bf) {
        this.bf = bf;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Byte getaByte() {
        return aByte;
    }

    public void setaByte(Byte aByte) {
        this.aByte = aByte;
    }

    public Short getaShort() {
        return aShort;
    }

    public void setaShort(Short aShort) {
        this.aShort = aShort;
    }
}

 /*public static void main(String[] args) {
    WapperClass a = new WapperClass();
    a.setA(10);
    Integer integer1 = new Integer(1);
    int i = integer1; // un boxing
    System.out.println(integer1);


    System.out.println(a.getA());
/*}

  */
