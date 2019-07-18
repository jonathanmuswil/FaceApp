import java.lang.reflect.Type;

public enum zs
{
  private static final zs[] Z;
  private static final Type[] aa;
  private final Ms ca;
  private final int da;
  private final Bs ea;
  private final Class<?> fa;
  private final boolean ga;
  
  static
  {
    A = new zs("STRING_LIST", 26, 26, Bs.b, Ms.g);
    B = new zs("MESSAGE_LIST", 27, 27, Bs.b, Ms.j);
    C = new zs("BYTES_LIST", 28, 28, Bs.b, Ms.h);
    D = new zs("UINT32_LIST", 29, 29, Bs.b, Ms.b);
    E = new zs("ENUM_LIST", 30, 30, Bs.b, Ms.i);
    F = new zs("SFIXED32_LIST", 31, 31, Bs.b, Ms.b);
    G = new zs("SFIXED64_LIST", 32, 32, Bs.b, Ms.c);
    H = new zs("SINT32_LIST", 33, 33, Bs.b, Ms.b);
    I = new zs("SINT64_LIST", 34, 34, Bs.b, Ms.c);
    J = new zs("DOUBLE_LIST_PACKED", 35, 35, Bs.c, Ms.e);
    K = new zs("FLOAT_LIST_PACKED", 36, 36, Bs.c, Ms.d);
    L = new zs("INT64_LIST_PACKED", 37, 37, Bs.c, Ms.c);
    M = new zs("UINT64_LIST_PACKED", 38, 38, Bs.c, Ms.c);
    N = new zs("INT32_LIST_PACKED", 39, 39, Bs.c, Ms.b);
    O = new zs("FIXED64_LIST_PACKED", 40, 40, Bs.c, Ms.c);
    P = new zs("FIXED32_LIST_PACKED", 41, 41, Bs.c, Ms.b);
    Q = new zs("BOOL_LIST_PACKED", 42, 42, Bs.c, Ms.f);
    R = new zs("UINT32_LIST_PACKED", 43, 43, Bs.c, Ms.b);
    S = new zs("ENUM_LIST_PACKED", 44, 44, Bs.c, Ms.i);
    T = new zs("SFIXED32_LIST_PACKED", 45, 45, Bs.c, Ms.b);
    U = new zs("SFIXED64_LIST_PACKED", 46, 46, Bs.c, Ms.c);
    V = new zs("SINT32_LIST_PACKED", 47, 47, Bs.c, Ms.b);
    W = new zs("SINT64_LIST_PACKED", 48, 48, Bs.c, Ms.c);
    X = new zs("GROUP_LIST", 49, 49, Bs.b, Ms.j);
    Y = new zs("MAP", 50, 50, Bs.d, Ms.a);
    zs localzs = a;
    int i1 = 0;
    ba = new zs[] { localzs, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y };
    aa = new Type[0];
    zs[] arrayOfzs = values();
    Z = new zs[arrayOfzs.length];
    int i2 = arrayOfzs.length;
    while (i1 < i2)
    {
      localzs = arrayOfzs[i1];
      Z[localzs.da] = localzs;
      i1++;
    }
  }
  
  private zs(int paramInt, Bs paramBs, Ms paramMs)
  {
    this.da = paramInt;
    this.ea = paramBs;
    this.ca = paramMs;
    ??? = As.a[paramBs.ordinal()];
    if ((??? != 1) && (??? != 2)) {}
    for (??? = null;; ??? = paramMs.a())
    {
      this.fa = ((Class)???);
      break;
    }
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramBs == Bs.a)
    {
      ??? = As.b[paramMs.ordinal()];
      bool2 = bool1;
      if (??? != 1)
      {
        bool2 = bool1;
        if (??? != 2)
        {
          bool2 = bool1;
          if (??? != 3) {
            bool2 = true;
          }
        }
      }
    }
    this.ga = bool2;
  }
  
  public final int a()
  {
    return this.da;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */