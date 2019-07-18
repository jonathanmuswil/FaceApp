import java.util.Set;

class zk
  implements pk
{
  static final Set<Fk.b> a = new yk();
  final int b;
  
  public zk(int paramInt)
  {
    this.b = paramInt;
  }
  
  public boolean a(Fk paramFk)
  {
    boolean bool1 = a.contains(paramFk.c);
    boolean bool2 = true;
    int i;
    if ((bool1) && (paramFk.a.e == null)) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (Math.abs(paramFk.a.c.hashCode() % this.b) != 0) {
      j = 1;
    } else {
      j = 0;
    }
    if ((i == 0) || (j == 0)) {
      bool2 = false;
    }
    return bool2;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */