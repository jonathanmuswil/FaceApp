import java.util.concurrent.ThreadFactory;

final class NUa$b
  implements ZUa
{
  final int a;
  final NUa.c[] b;
  long c;
  
  NUa$b(int paramInt, ThreadFactory paramThreadFactory)
  {
    this.a = paramInt;
    this.b = new NUa.c[paramInt];
    for (int i = 0; i < paramInt; i++) {
      this.b[i] = new NUa.c(paramThreadFactory);
    }
  }
  
  public NUa.c a()
  {
    int i = this.a;
    if (i == 0) {
      return NUa.e;
    }
    NUa.c[] arrayOfc = this.b;
    long l = this.c;
    this.c = (1L + l);
    return arrayOfc[((int)(l % i))];
  }
  
  public void b()
  {
    NUa.c[] arrayOfc = this.b;
    int i = arrayOfc.length;
    for (int j = 0; j < i; j++) {
      arrayOfc[j].i();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/NUa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */