import java.lang.reflect.Field;
import java.util.Arrays;

final class xt
{
  private int A;
  private int B;
  private Field C;
  private Object D;
  private Object E;
  private Object F;
  private final yt a;
  private final Object[] b;
  private Class<?> c;
  private final int d;
  private final int e;
  private final int f;
  private final int g;
  private final int h;
  private final int i;
  private final int j;
  private final int k;
  private final int l;
  private final int m;
  private final int[] n;
  private int o;
  private int p;
  private int q = Integer.MAX_VALUE;
  private int r = Integer.MIN_VALUE;
  private int s = 0;
  private int t = 0;
  private int u = 0;
  private int v = 0;
  private int w = 0;
  private int x;
  private int y;
  private int z;
  
  xt(Class<?> paramClass, String paramString, Object[] paramArrayOfObject)
  {
    this.c = paramClass;
    this.a = new yt(paramString);
    this.b = paramArrayOfObject;
    this.d = this.a.b();
    this.e = this.a.b();
    int i1 = this.e;
    paramClass = null;
    if (i1 == 0)
    {
      this.f = 0;
      this.g = 0;
      this.h = 0;
      this.i = 0;
      this.j = 0;
      this.l = 0;
      this.k = 0;
      this.m = 0;
      this.n = null;
      return;
    }
    this.f = this.a.b();
    this.g = this.a.b();
    this.h = this.a.b();
    this.i = this.a.b();
    this.l = this.a.b();
    this.k = this.a.b();
    this.j = this.a.b();
    this.m = this.a.b();
    i1 = this.a.b();
    if (i1 != 0) {
      paramClass = new int[i1];
    }
    this.n = paramClass;
    this.o = ((this.f << 1) + this.g);
  }
  
  private static Field a(Class<?> paramClass, String paramString)
  {
    try
    {
      Field localField = paramClass.getDeclaredField(paramString);
      return localField;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (localObject2 : paramClass.getDeclaredFields()) {
        if (paramString.equals(((Field)localObject2).getName())) {
          return (Field)localObject2;
        }
      }
      paramClass = paramClass.getName();
      ??? = Arrays.toString((Object[])???);
      Object localObject2 = new StringBuilder(String.valueOf(paramString).length() + 40 + String.valueOf(paramClass).length() + String.valueOf(???).length());
      ((StringBuilder)localObject2).append("Field ");
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(" for ");
      ((StringBuilder)localObject2).append(paramClass);
      ((StringBuilder)localObject2).append(" not found. Known fields are ");
      ((StringBuilder)localObject2).append((String)???);
      throw new RuntimeException(((StringBuilder)localObject2).toString());
    }
  }
  
  private final Object p()
  {
    Object[] arrayOfObject = this.b;
    int i1 = this.o;
    this.o = (i1 + 1);
    return arrayOfObject[i1];
  }
  
  private final boolean q()
  {
    return (this.d & 0x1) == 1;
  }
  
  final boolean a()
  {
    boolean bool = this.a.a();
    int i1 = 0;
    if (!bool) {
      return false;
    }
    this.x = this.a.b();
    this.y = this.a.b();
    this.z = (this.y & 0xFF);
    int i2 = this.x;
    if (i2 < this.q) {
      this.q = i2;
    }
    i2 = this.x;
    if (i2 > this.r) {
      this.r = i2;
    }
    if (this.z == zs.Y.a()) {
      this.s += 1;
    } else if ((this.z >= zs.s.a()) && (this.z <= zs.X.a())) {
      this.t += 1;
    }
    this.w += 1;
    if (Bt.a(this.q, this.x, this.w))
    {
      this.v = (this.x + 1);
      i2 = this.v - this.q;
    }
    else
    {
      i2 = this.u + 1;
    }
    this.u = i2;
    if ((this.y & 0x400) != 0) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    if (i2 != 0)
    {
      localObject = this.n;
      i2 = this.p;
      this.p = (i2 + 1);
      localObject[i2] = this.x;
    }
    this.D = null;
    this.E = null;
    this.F = null;
    if (d())
    {
      this.A = this.a.b();
      if ((this.z != zs.j.a() + 51) && (this.z != zs.r.a() + 51))
      {
        if ((this.z != zs.m.a() + 51) || (!q())) {
          break label577;
        }
        this.E = p();
        break label577;
      }
    }
    label361:
    for (Object localObject = p();; localObject = this.C.getType())
    {
      this.D = localObject;
      break label577;
      this.C = a(this.c, (String)p());
      if (h()) {
        this.B = this.a.b();
      }
      if ((this.z != zs.j.a()) && (this.z != zs.r.a()))
      {
        if ((this.z == zs.B.a()) || (this.z == zs.X.a())) {
          break label361;
        }
        if ((this.z != zs.m.a()) && (this.z != zs.E.a()) && (this.z != zs.S.a()))
        {
          if (this.z != zs.Y.a()) {
            break label577;
          }
          this.F = p();
          i2 = i1;
          if ((this.y & 0x800) != 0) {
            i2 = 1;
          }
          if (i2 == 0) {
            break label577;
          }
        }
        else
        {
          if (!q()) {
            break label577;
          }
        }
        break;
      }
    }
    label577:
    return true;
  }
  
  final int b()
  {
    return this.x;
  }
  
  final int c()
  {
    return this.z;
  }
  
  final boolean d()
  {
    return this.z > zs.Y.a();
  }
  
  final Field e()
  {
    int i1 = this.A << 1;
    Object localObject = this.b[i1];
    if ((localObject instanceof Field)) {
      return (Field)localObject;
    }
    localObject = a(this.c, (String)localObject);
    this.b[i1] = localObject;
    return (Field)localObject;
  }
  
  final Field f()
  {
    int i1 = (this.A << 1) + 1;
    Object localObject = this.b[i1];
    if ((localObject instanceof Field)) {
      return (Field)localObject;
    }
    localObject = a(this.c, (String)localObject);
    this.b[i1] = localObject;
    return (Field)localObject;
  }
  
  final Field g()
  {
    return this.C;
  }
  
  final boolean h()
  {
    return (q()) && (this.z <= zs.r.a());
  }
  
  final Field i()
  {
    int i1 = (this.f << 1) + this.B / 32;
    Object localObject = this.b[i1];
    if ((localObject instanceof Field)) {
      return (Field)localObject;
    }
    localObject = a(this.c, (String)localObject);
    this.b[i1] = localObject;
    return (Field)localObject;
  }
  
  final int j()
  {
    return this.B % 32;
  }
  
  final boolean k()
  {
    return (this.y & 0x100) != 0;
  }
  
  final boolean l()
  {
    return (this.y & 0x200) != 0;
  }
  
  final Object m()
  {
    return this.D;
  }
  
  final Object n()
  {
    return this.E;
  }
  
  final Object o()
  {
    return this.F;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */