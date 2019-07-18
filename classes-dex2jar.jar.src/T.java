import java.util.Arrays;

public class t
{
  private static int a = 1;
  private String b;
  public int c = -1;
  int d = -1;
  public int e = 0;
  public float f;
  float[] g = new float[7];
  t.a h;
  m[] i = new m[8];
  int j = 0;
  public int k = 0;
  
  public t(t.a parama, String paramString)
  {
    this.h = parama;
  }
  
  static void a()
  {
    a += 1;
  }
  
  public final void a(m paramm)
  {
    int n;
    for (int m = 0;; m++)
    {
      n = this.j;
      if (m >= n) {
        break;
      }
      if (this.i[m] == paramm) {
        return;
      }
    }
    m[] arrayOfm = this.i;
    if (n >= arrayOfm.length) {
      this.i = ((m[])Arrays.copyOf(arrayOfm, arrayOfm.length * 2));
    }
    arrayOfm = this.i;
    m = this.j;
    arrayOfm[m] = paramm;
    this.j = (m + 1);
  }
  
  public void a(t.a parama, String paramString)
  {
    this.h = parama;
  }
  
  public void b()
  {
    this.b = null;
    this.h = t.a.e;
    this.e = 0;
    this.c = -1;
    this.d = -1;
    this.f = 0.0F;
    this.j = 0;
    this.k = 0;
  }
  
  public final void b(m paramm)
  {
    int m = this.j;
    int n = 0;
    for (int i1 = 0; i1 < m; i1++) {
      if (this.i[i1] == paramm)
      {
        while (n < m - i1 - 1)
        {
          paramm = this.i;
          int i2 = i1 + n;
          paramm[i2] = paramm[(i2 + 1)];
          n++;
        }
        this.j -= 1;
        return;
      }
    }
  }
  
  public final void c(m paramm)
  {
    int m = this.j;
    for (int n = 0; n < m; n++)
    {
      m[] arrayOfm = this.i;
      arrayOfm[n].d.a(arrayOfm[n], paramm, false);
    }
    this.j = 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("");
    localStringBuilder.append(this.b);
    return localStringBuilder.toString();
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */