import java.lang.reflect.Type;

public enum ox
{
  private static final ox[] Z;
  private static final Type[] aa;
  private final Dx ca;
  private final int da;
  private final qx ea;
  private final Class<?> fa;
  private final boolean ga;
  
  static
  {
    A = new ox("STRING_LIST", 26, 26, qx.b, Dx.g);
    B = new ox("MESSAGE_LIST", 27, 27, qx.b, Dx.j);
    C = new ox("BYTES_LIST", 28, 28, qx.b, Dx.h);
    D = new ox("UINT32_LIST", 29, 29, qx.b, Dx.b);
    E = new ox("ENUM_LIST", 30, 30, qx.b, Dx.i);
    F = new ox("SFIXED32_LIST", 31, 31, qx.b, Dx.b);
    G = new ox("SFIXED64_LIST", 32, 32, qx.b, Dx.c);
    H = new ox("SINT32_LIST", 33, 33, qx.b, Dx.b);
    I = new ox("SINT64_LIST", 34, 34, qx.b, Dx.c);
    J = new ox("DOUBLE_LIST_PACKED", 35, 35, qx.c, Dx.e);
    K = new ox("FLOAT_LIST_PACKED", 36, 36, qx.c, Dx.d);
    L = new ox("INT64_LIST_PACKED", 37, 37, qx.c, Dx.c);
    M = new ox("UINT64_LIST_PACKED", 38, 38, qx.c, Dx.c);
    N = new ox("INT32_LIST_PACKED", 39, 39, qx.c, Dx.b);
    O = new ox("FIXED64_LIST_PACKED", 40, 40, qx.c, Dx.c);
    P = new ox("FIXED32_LIST_PACKED", 41, 41, qx.c, Dx.b);
    Q = new ox("BOOL_LIST_PACKED", 42, 42, qx.c, Dx.f);
    R = new ox("UINT32_LIST_PACKED", 43, 43, qx.c, Dx.b);
    S = new ox("ENUM_LIST_PACKED", 44, 44, qx.c, Dx.i);
    T = new ox("SFIXED32_LIST_PACKED", 45, 45, qx.c, Dx.b);
    U = new ox("SFIXED64_LIST_PACKED", 46, 46, qx.c, Dx.c);
    V = new ox("SINT32_LIST_PACKED", 47, 47, qx.c, Dx.b);
    W = new ox("SINT64_LIST_PACKED", 48, 48, qx.c, Dx.c);
    X = new ox("GROUP_LIST", 49, 49, qx.b, Dx.j);
    Y = new ox("MAP", 50, 50, qx.d, Dx.a);
    Object localObject1 = a;
    int i1 = 0;
    ba = new ox[] { localObject1, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y };
    aa = new Type[0];
    localObject1 = values();
    Z = new ox[localObject1.length];
    int i2 = localObject1.length;
    while (i1 < i2)
    {
      Object localObject2 = localObject1[i1];
      Z[localObject2.da] = localObject2;
      i1++;
    }
  }
  
  private ox(int paramInt, qx paramqx, Dx paramDx)
  {
    this.da = paramInt;
    this.ea = paramqx;
    this.ca = paramDx;
    ??? = px.a[paramqx.ordinal()];
    if (??? != 1)
    {
      if (??? != 2) {
        this.fa = null;
      } else {
        this.fa = paramDx.a();
      }
    }
    else {
      this.fa = paramDx.a();
    }
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramqx == qx.a)
    {
      ??? = px.b[paramDx.ordinal()];
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */