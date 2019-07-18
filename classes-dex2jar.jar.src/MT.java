import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

final class mt<T>
  implements zt<T>
{
  private static final Unsafe a = ;
  private final int[] b;
  private final Object[] c;
  private final int d;
  private final int e;
  private final int f;
  private final it g;
  private final boolean h;
  private final boolean i;
  private final boolean j;
  private final boolean k;
  private final int[] l;
  private final int[] m;
  private final int[] n;
  private final pt o;
  private final Us p;
  private final Rt<?, ?> q;
  private final rs<?> r;
  private final dt s;
  
  private mt(int[] paramArrayOfInt1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, int paramInt3, it paramit, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, pt parampt, Us paramUs, Rt<?, ?> paramRt, rs<?> paramrs, dt paramdt)
  {
    this.b = paramArrayOfInt1;
    this.c = paramArrayOfObject;
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.i = (paramit instanceof Es);
    this.j = paramBoolean1;
    if ((paramrs != null) && (paramrs.a(paramit))) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    this.h = paramBoolean1;
    this.k = false;
    this.l = paramArrayOfInt2;
    this.m = paramArrayOfInt3;
    this.n = paramArrayOfInt4;
    this.o = parampt;
    this.p = paramUs;
    this.q = paramRt;
    this.r = paramrs;
    this.g = paramit;
    this.s = paramdt;
  }
  
  private static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, Object paramObject, Wr paramWr)
    throws IOException
  {
    return Vr.a(paramInt1, paramArrayOfByte, paramInt2, paramInt3, a(paramObject), paramWr);
  }
  
  private static <UT, UB> int a(Rt<UT, UB> paramRt, T paramT)
  {
    return paramRt.b(paramRt.c(paramT));
  }
  
  private final int a(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong, int paramInt8, Wr paramWr)
    throws IOException
  {
    Unsafe localUnsafe = a;
    long l1 = this.b[(paramInt8 + 2)] & 0xFFFFF;
    long l2;
    switch (paramInt7)
    {
    default: 
      break;
    case 68: 
      if (paramInt5 != 3) {
        return paramInt1;
      }
      paramInt1 = a(a(paramInt8), paramArrayOfByte, paramInt1, paramInt2, paramInt3 & 0xFFFFFFF8 | 0x4, paramWr);
      if (localUnsafe.getInt(paramT, l1) == paramInt4) {
        paramArrayOfByte = localUnsafe.getObject(paramT, paramLong);
      } else {
        paramArrayOfByte = null;
      }
      if (paramArrayOfByte == null) {
        paramArrayOfByte = paramWr.c;
      } else {
        paramArrayOfByte = Gs.a(paramArrayOfByte, paramWr.c);
      }
      break;
    case 67: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = Vr.b(paramArrayOfByte, paramInt1, paramWr);
      l2 = is.a(paramWr.b);
      break;
    case 66: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = Vr.a(paramArrayOfByte, paramInt1, paramWr);
      paramInt2 = is.a(paramWr.a);
      break;
    case 63: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = Vr.a(paramArrayOfByte, paramInt1, paramWr);
      paramInt2 = paramWr.a;
      paramArrayOfByte = c(paramInt8);
      if ((paramArrayOfByte != null) && (paramArrayOfByte.a(paramInt2) == null))
      {
        a(paramT).a(paramInt3, Long.valueOf(paramInt2));
        return paramInt1;
      }
      localUnsafe.putObject(paramT, paramLong, Integer.valueOf(paramInt2));
      break;
    case 61: 
      if (paramInt5 != 2) {
        return paramInt1;
      }
      paramInt1 = Vr.a(paramArrayOfByte, paramInt1, paramWr);
      paramInt2 = paramWr.a;
      if (paramInt2 == 0) {
        paramArrayOfByte = _r.a;
      } else {
        localUnsafe.putObject(paramT, paramLong, _r.a(paramArrayOfByte, paramInt1, paramInt2));
      }
    case 60: 
    case 59: 
      for (;;)
      {
        paramInt1 += paramInt2;
        break label740;
        if (paramInt5 != 2) {
          return paramInt1;
        }
        paramInt1 = a(a(paramInt8), paramArrayOfByte, paramInt1, paramInt2, paramWr);
        if (localUnsafe.getInt(paramT, l1) == paramInt4) {
          paramArrayOfByte = localUnsafe.getObject(paramT, paramLong);
        } else {
          paramArrayOfByte = null;
        }
        if (paramArrayOfByte == null)
        {
          paramArrayOfByte = paramWr.c;
          break;
        }
        paramArrayOfByte = Gs.a(paramArrayOfByte, paramWr.c);
        break;
        if (paramInt5 != 2) {
          return paramInt1;
        }
        paramInt1 = Vr.a(paramArrayOfByte, paramInt1, paramWr);
        paramInt2 = paramWr.a;
        if (paramInt2 == 0)
        {
          paramArrayOfByte = "";
          break;
        }
        if (((paramInt6 & 0x20000000) != 0) && (!_t.a(paramArrayOfByte, paramInt1, paramInt1 + paramInt2))) {
          throw Ks.e();
        }
        localUnsafe.putObject(paramT, paramLong, new String(paramArrayOfByte, paramInt1, paramInt2, Gs.a));
      }
    case 58: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = Vr.b(paramArrayOfByte, paramInt1, paramWr);
      boolean bool;
      if (paramWr.b != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      paramArrayOfByte = Boolean.valueOf(bool);
      break;
    case 57: 
    case 64: 
      if (paramInt5 != 5) {
        return paramInt1;
      }
      paramArrayOfByte = Integer.valueOf(Vr.a(paramArrayOfByte, paramInt1));
      break;
    case 56: 
    case 65: 
      if (paramInt5 != 1) {
        return paramInt1;
      }
      paramArrayOfByte = Long.valueOf(Vr.b(paramArrayOfByte, paramInt1));
      break;
    case 55: 
    case 62: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = Vr.a(paramArrayOfByte, paramInt1, paramWr);
      paramInt2 = paramWr.a;
      paramArrayOfByte = Integer.valueOf(paramInt2);
      break;
    case 53: 
    case 54: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = Vr.b(paramArrayOfByte, paramInt1, paramWr);
      l2 = paramWr.b;
      paramArrayOfByte = Long.valueOf(l2);
      localUnsafe.putObject(paramT, paramLong, paramArrayOfByte);
      break;
    case 52: 
      if (paramInt5 != 5) {
        return paramInt1;
      }
      paramArrayOfByte = Float.valueOf(Vr.d(paramArrayOfByte, paramInt1));
      localUnsafe.putObject(paramT, paramLong, paramArrayOfByte);
      paramInt1 += 4;
      break;
    }
    if (paramInt5 == 1)
    {
      paramArrayOfByte = Double.valueOf(Vr.c(paramArrayOfByte, paramInt1));
      localUnsafe.putObject(paramT, paramLong, paramArrayOfByte);
      paramInt1 += 8;
      label740:
      localUnsafe.putInt(paramT, l1, paramInt4);
    }
    return paramInt1;
  }
  
  private final int a(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, int paramInt7, long paramLong2, Wr paramWr)
    throws IOException
  {
    int i1 = paramInt1;
    Object localObject1 = (Js)a.getObject(paramT, paramLong2);
    Object localObject2 = localObject1;
    if (!((Js)localObject1).la())
    {
      int i2 = ((List)localObject1).size();
      if (i2 == 0) {
        i2 = 10;
      } else {
        i2 <<= 1;
      }
      localObject2 = ((Js)localObject1).k(i2);
      a.putObject(paramT, paramLong2, localObject2);
    }
    switch (paramInt7)
    {
    default: 
      paramInt7 = i1;
      break;
    case 49: 
      paramInt7 = i1;
      if (paramInt5 != 3) {
        break label2227;
      }
      paramT = a(paramInt6);
      paramInt4 = paramInt3 & 0xFFFFFFF8 | 0x4;
      for (paramInt1 = a(paramT, paramArrayOfByte, paramInt1, paramInt2, paramInt4, paramWr);; paramInt1 = a(paramT, paramArrayOfByte, paramInt5, paramInt2, paramInt4, paramWr))
      {
        ((List)localObject2).add(paramWr.c);
        paramInt7 = paramInt1;
        if (paramInt1 >= paramInt2) {
          break;
        }
        paramInt5 = Vr.a(paramArrayOfByte, paramInt1, paramWr);
        paramInt7 = paramInt1;
        if (paramInt3 != paramWr.a) {
          break;
        }
      }
    case 34: 
    case 48: 
      if (paramInt5 == 2)
      {
        paramT = (Ys)localObject2;
        paramInt1 = Vr.a(paramArrayOfByte, i1, paramWr);
        paramInt2 = paramWr.a + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramInt1 = Vr.b(paramArrayOfByte, paramInt1, paramWr);
          paramT.a(is.a(paramWr.b));
        }
        if (paramInt1 == paramInt2) {
          return paramInt1;
        }
        throw Ks.a();
      }
      paramInt7 = i1;
      if (paramInt5 != 0) {
        break label2227;
      }
      paramT = (Ys)localObject2;
      for (;;)
      {
        paramInt4 = Vr.b(paramArrayOfByte, i1, paramWr);
        paramT.a(is.a(paramWr.b));
        paramInt1 = paramInt4;
        if (paramInt4 >= paramInt2) {
          break;
        }
        i1 = Vr.a(paramArrayOfByte, paramInt4, paramWr);
        paramInt1 = paramInt4;
        if (paramInt3 != paramWr.a) {
          break;
        }
      }
    case 33: 
    case 47: 
      if (paramInt5 == 2)
      {
        paramT = (Fs)localObject2;
        paramInt1 = Vr.a(paramArrayOfByte, i1, paramWr);
        paramInt2 = paramWr.a + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramInt1 = Vr.a(paramArrayOfByte, paramInt1, paramWr);
          paramT.p(is.a(paramWr.a));
        }
        if (paramInt1 == paramInt2) {
          return paramInt1;
        }
        throw Ks.a();
      }
      paramInt7 = i1;
      if (paramInt5 != 0) {
        break label2227;
      }
      paramT = (Fs)localObject2;
      for (;;)
      {
        paramInt4 = Vr.a(paramArrayOfByte, i1, paramWr);
        paramT.p(is.a(paramWr.a));
        paramInt1 = paramInt4;
        if (paramInt4 >= paramInt2) {
          break;
        }
        i1 = Vr.a(paramArrayOfByte, paramInt4, paramWr);
        paramInt1 = paramInt4;
        if (paramInt3 != paramWr.a) {
          break;
        }
      }
    case 30: 
    case 44: 
      if (paramInt5 == 2)
      {
        paramInt1 = Vr.a(paramArrayOfByte, i1, (Js)localObject2, paramWr);
      }
      else
      {
        paramInt7 = i1;
        if (paramInt5 != 0) {
          break label2227;
        }
        paramInt1 = Vr.a(paramInt3, paramArrayOfByte, paramInt1, paramInt2, (Js)localObject2, paramWr);
      }
      paramWr = (Es)paramT;
      paramArrayOfByte = paramWr.zzjp;
      paramT = paramArrayOfByte;
      if (paramArrayOfByte == St.b()) {
        paramT = null;
      }
      paramT = (St)Bt.a(paramInt4, (List)localObject2, c(paramInt6), paramT, this.q);
      paramInt2 = paramInt1;
      if (paramT != null) {
        paramWr.zzjp = paramT;
      }
    case 28: 
    case 27: 
    case 26: 
    case 25: 
    case 42: 
      boolean bool;
      for (paramInt2 = paramInt1;; paramInt2 = paramInt1)
      {
        return paramInt2;
        paramInt7 = i1;
        if (paramInt5 != 2) {
          break label2227;
        }
        paramInt5 = Vr.a(paramArrayOfByte, i1, paramWr);
        paramInt6 = paramWr.a;
        paramInt1 = paramInt5;
        paramInt4 = paramInt6;
        paramT = (T)localObject2;
        if (paramInt6 == 0) {}
        for (paramInt4 = paramInt5;; paramInt4 = paramInt5)
        {
          ((List)localObject2).add(_r.a);
          do
          {
            paramT.add(_r.a(paramArrayOfByte, paramInt1, paramInt4));
            paramInt4 = paramInt1 + paramInt4;
            localObject2 = paramT;
            paramInt1 = paramInt4;
            if (paramInt4 >= paramInt2) {
              break;
            }
            paramInt5 = Vr.a(paramArrayOfByte, paramInt4, paramWr);
            paramInt1 = paramInt4;
            if (paramInt3 != paramWr.a) {
              break;
            }
            paramInt5 = Vr.a(paramArrayOfByte, paramInt5, paramWr);
            paramInt6 = paramWr.a;
            paramInt1 = paramInt5;
            paramInt4 = paramInt6;
            paramT = (T)localObject2;
          } while (paramInt6 != 0);
        }
        paramInt7 = i1;
        if (paramInt5 != 2) {
          break label2227;
        }
        return a(a(paramInt6), paramInt3, paramArrayOfByte, paramInt1, paramInt2, (Js)localObject2, paramWr);
        paramInt7 = i1;
        if (paramInt5 != 2) {
          break label2227;
        }
        if ((paramLong1 & 0x20000000) == 0L)
        {
          paramInt4 = Vr.a(paramArrayOfByte, i1, paramWr);
          paramInt1 = paramWr.a;
          if (paramInt1 == 0)
          {
            paramInt1 = paramInt4;
            ((List)localObject2).add("");
          }
          else
          {
            paramT = new String(paramArrayOfByte, paramInt4, paramInt1, Gs.a);
          }
          for (;;)
          {
            ((List)localObject2).add(paramT);
            paramInt1 = paramInt4 + paramInt1;
            paramInt7 = paramInt1;
            if (paramInt1 >= paramInt2) {
              break label2227;
            }
            paramInt4 = Vr.a(paramArrayOfByte, paramInt1, paramWr);
            paramInt7 = paramInt1;
            if (paramInt3 != paramWr.a) {
              break label2227;
            }
            paramInt1 = Vr.a(paramArrayOfByte, paramInt4, paramWr);
            paramInt5 = paramWr.a;
            if (paramInt5 == 0) {
              break;
            }
            paramT = new String(paramArrayOfByte, paramInt1, paramInt5, Gs.a);
            paramInt4 = paramInt1;
            paramInt1 = paramInt5;
          }
        }
        paramInt1 = Vr.a(paramArrayOfByte, i1, paramWr);
        paramInt5 = paramWr.a;
        if (paramInt5 == 0)
        {
          paramT = (T)localObject2;
          paramT.add("");
        }
        else
        {
          paramInt4 = paramInt1 + paramInt5;
          if (!_t.a(paramArrayOfByte, paramInt1, paramInt4)) {
            break label1268;
          }
          localObject1 = new String(paramArrayOfByte, paramInt1, paramInt5, Gs.a);
          paramT = (T)localObject2;
          localObject2 = localObject1;
        }
        for (paramInt1 = paramInt4;; paramInt1 = paramInt4)
        {
          paramT.add(localObject2);
          paramInt7 = paramInt1;
          if (paramInt1 >= paramInt2) {
            break label2227;
          }
          paramInt4 = Vr.a(paramArrayOfByte, paramInt1, paramWr);
          paramInt7 = paramInt1;
          if (paramInt3 != paramWr.a) {
            break label2227;
          }
          paramInt1 = Vr.a(paramArrayOfByte, paramInt4, paramWr);
          paramInt5 = paramWr.a;
          if (paramInt5 == 0) {
            break;
          }
          paramInt4 = paramInt1 + paramInt5;
          if (!_t.a(paramArrayOfByte, paramInt1, paramInt4)) {
            break label1264;
          }
          localObject2 = new String(paramArrayOfByte, paramInt1, paramInt5, Gs.a);
        }
        throw Ks.e();
        throw Ks.e();
        if (paramInt5 != 2) {
          break label1360;
        }
        paramT = (Xr)localObject2;
        paramInt1 = Vr.a(paramArrayOfByte, i1, paramWr);
        paramInt2 = paramWr.a + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramInt1 = Vr.b(paramArrayOfByte, paramInt1, paramWr);
          if (paramWr.b != 0L) {
            bool = true;
          } else {
            bool = false;
          }
          paramT.a(bool);
        }
        if (paramInt1 != paramInt2) {
          break;
        }
      }
      throw Ks.a();
      paramInt7 = i1;
      if (paramInt5 != 0) {
        break label2227;
      }
      paramT = (Xr)localObject2;
      paramInt4 = Vr.b(paramArrayOfByte, i1, paramWr);
      paramInt1 = paramInt4;
      if (paramWr.b != 0L) {}
      for (paramInt1 = paramInt4;; paramInt1 = paramInt4)
      {
        bool = true;
        do
        {
          bool = false;
          paramT.a(bool);
          paramInt7 = paramInt1;
          if (paramInt1 >= paramInt2) {
            break;
          }
          paramInt4 = Vr.a(paramArrayOfByte, paramInt1, paramWr);
          paramInt7 = paramInt1;
          if (paramInt3 != paramWr.a) {
            break;
          }
          paramInt4 = Vr.b(paramArrayOfByte, paramInt4, paramWr);
          paramInt1 = paramInt4;
        } while (paramWr.b == 0L);
      }
    case 24: 
    case 31: 
    case 41: 
    case 45: 
      if (paramInt5 == 2)
      {
        paramT = (Fs)localObject2;
        paramInt1 = Vr.a(paramArrayOfByte, i1, paramWr);
        paramInt2 = paramWr.a + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramT.p(Vr.a(paramArrayOfByte, paramInt1));
          paramInt1 += 4;
        }
        if (paramInt1 == paramInt2) {
          return paramInt1;
        }
        throw Ks.a();
      }
      paramInt7 = i1;
      if (paramInt5 != 5) {
        break label2227;
      }
      paramT = (Fs)localObject2;
      paramT.p(Vr.a(paramArrayOfByte, paramInt1));
      for (;;)
      {
        paramInt4 = i1 + 4;
        paramInt1 = paramInt4;
        if (paramInt4 >= paramInt2) {
          break;
        }
        i1 = Vr.a(paramArrayOfByte, paramInt4, paramWr);
        paramInt1 = paramInt4;
        if (paramInt3 != paramWr.a) {
          break;
        }
        paramT.p(Vr.a(paramArrayOfByte, i1));
      }
    case 23: 
    case 32: 
    case 40: 
    case 46: 
      if (paramInt5 == 2)
      {
        paramT = (Ys)localObject2;
        paramInt1 = Vr.a(paramArrayOfByte, i1, paramWr);
        paramInt2 = paramWr.a + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramT.a(Vr.b(paramArrayOfByte, paramInt1));
          paramInt1 += 8;
        }
        if (paramInt1 == paramInt2) {
          return paramInt1;
        }
        throw Ks.a();
      }
      paramInt7 = i1;
      if (paramInt5 != 1) {
        break label2227;
      }
      paramT = (Ys)localObject2;
      paramT.a(Vr.b(paramArrayOfByte, paramInt1));
      for (;;)
      {
        paramInt4 = i1 + 8;
        paramInt1 = paramInt4;
        if (paramInt4 >= paramInt2) {
          break;
        }
        i1 = Vr.a(paramArrayOfByte, paramInt4, paramWr);
        paramInt1 = paramInt4;
        if (paramInt3 != paramWr.a) {
          break;
        }
        paramT.a(Vr.b(paramArrayOfByte, i1));
      }
    case 22: 
    case 29: 
    case 39: 
    case 43: 
      if (paramInt5 == 2)
      {
        paramInt1 = Vr.a(paramArrayOfByte, i1, (Js)localObject2, paramWr);
      }
      else
      {
        paramInt7 = i1;
        if (paramInt5 == 0) {
          paramInt1 = Vr.a(paramInt3, paramArrayOfByte, paramInt1, paramInt2, (Js)localObject2, paramWr);
        }
      }
      break;
    case 20: 
    case 21: 
    case 37: 
    case 38: 
      if (paramInt5 == 2)
      {
        paramT = (Ys)localObject2;
        paramInt1 = Vr.a(paramArrayOfByte, i1, paramWr);
        paramInt2 = paramWr.a + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramInt1 = Vr.b(paramArrayOfByte, paramInt1, paramWr);
          paramT.a(paramWr.b);
        }
        if (paramInt1 == paramInt2) {
          return paramInt1;
        }
        throw Ks.a();
      }
      paramInt7 = i1;
      if (paramInt5 != 0) {
        break label2227;
      }
      paramT = (Ys)localObject2;
      for (;;)
      {
        paramInt4 = Vr.b(paramArrayOfByte, i1, paramWr);
        paramT.a(paramWr.b);
        paramInt1 = paramInt4;
        if (paramInt4 >= paramInt2) {
          break;
        }
        i1 = Vr.a(paramArrayOfByte, paramInt4, paramWr);
        paramInt1 = paramInt4;
        if (paramInt3 != paramWr.a) {
          break;
        }
      }
    case 19: 
    case 36: 
      label1264:
      label1268:
      label1360:
      if (paramInt5 == 2)
      {
        paramT = (Cs)localObject2;
        paramInt1 = Vr.a(paramArrayOfByte, i1, paramWr);
        paramInt2 = paramWr.a + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramT.a(Vr.d(paramArrayOfByte, paramInt1));
          paramInt1 += 4;
        }
        if (paramInt1 == paramInt2) {
          return paramInt1;
        }
        throw Ks.a();
      }
      paramInt7 = i1;
      if (paramInt5 != 5) {
        break label2227;
      }
      paramT = (Cs)localObject2;
      paramT.a(Vr.d(paramArrayOfByte, paramInt1));
      for (;;)
      {
        paramInt4 = i1 + 4;
        paramInt1 = paramInt4;
        if (paramInt4 >= paramInt2) {
          break;
        }
        i1 = Vr.a(paramArrayOfByte, paramInt4, paramWr);
        paramInt1 = paramInt4;
        if (paramInt3 != paramWr.a) {
          break;
        }
        paramT.a(Vr.d(paramArrayOfByte, i1));
      }
    }
    if (paramInt5 == 2)
    {
      paramT = (os)localObject2;
      paramInt1 = Vr.a(paramArrayOfByte, i1, paramWr);
      paramInt2 = paramWr.a + paramInt1;
      while (paramInt1 < paramInt2)
      {
        paramT.a(Vr.c(paramArrayOfByte, paramInt1));
        paramInt1 += 8;
      }
      if (paramInt1 != paramInt2) {
        throw Ks.a();
      }
    }
    else
    {
      paramInt7 = i1;
      if (paramInt5 == 1)
      {
        paramT = (os)localObject2;
        paramT.a(Vr.c(paramArrayOfByte, paramInt1));
        for (;;)
        {
          paramInt4 = i1 + 8;
          paramInt1 = paramInt4;
          if (paramInt4 >= paramInt2) {
            break;
          }
          i1 = Vr.a(paramArrayOfByte, paramInt4, paramWr);
          paramInt1 = paramInt4;
          if (paramInt3 != paramWr.a) {
            break;
          }
          paramT.a(Vr.c(paramArrayOfByte, i1));
        }
      }
      label2227:
      paramInt1 = paramInt7;
    }
    return paramInt1;
  }
  
  private final <K, V> int a(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, Wr paramWr)
    throws IOException
  {
    paramArrayOfByte = a;
    Object localObject1 = b(paramInt3);
    Object localObject2 = paramArrayOfByte.getObject(paramT, paramLong);
    if (this.s.a(localObject2))
    {
      paramWr = this.s.b(localObject1);
      this.s.a(paramWr, localObject2);
      paramArrayOfByte.putObject(paramT, paramLong, paramWr);
    }
    this.s.e(localObject1);
    throw null;
  }
  
  private final int a(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, Wr paramWr)
    throws IOException
  {
    int i1 = paramInt2;
    int i2 = paramInt3;
    Object localObject1 = paramWr;
    Object localObject2 = a;
    int i3 = 0;
    int i4 = 0;
    int i5 = -1;
    Object localObject4;
    for (;;)
    {
      Object localObject3 = this;
      localObject4 = paramT;
      Object localObject5 = paramArrayOfByte;
      if (paramInt1 >= i1) {
        break;
      }
      i3 = paramInt1 + 1;
      paramInt1 = localObject5[paramInt1];
      if (paramInt1 < 0)
      {
        i3 = Vr.a(paramInt1, (byte[])localObject5, i3, (Wr)localObject1);
        paramInt1 = ((Wr)localObject1).a;
      }
      int i6 = paramInt1 >>> 3;
      i7 = paramInt1 & 0x7;
      i8 = ((mt)localObject3).f(i6);
      if (i8 != -1)
      {
        localObject1 = ((mt)localObject3).b;
        int i9 = localObject1[(i8 + 1)];
        i10 = (i9 & 0xFF00000) >>> 20;
        long l1 = i9 & 0xFFFFF;
        if (i10 <= 17)
        {
          i2 = localObject1[(i8 + 2)];
          i11 = 1 << (i2 >>> 20);
          i2 &= 0xFFFFF;
          if (i2 != i5)
          {
            if (i5 != -1) {
              ((Unsafe)localObject2).putInt(localObject4, i5, i4);
            }
            i4 = ((Unsafe)localObject2).getInt(localObject4, i2);
            i5 = i2;
            i2 = i4;
          }
          else
          {
            i2 = i4;
          }
          switch (i10)
          {
          }
          for (;;)
          {
            break label1109;
            if (i7 == 3)
            {
              i3 = a(((mt)localObject3).a(i8), paramArrayOfByte, i3, paramInt2, i6 << 3 | 0x4, paramWr);
              if ((i2 & i11) == 0) {
                localObject1 = paramWr.c;
              } else {
                localObject1 = Gs.a(((Unsafe)localObject2).getObject(localObject4, l1), paramWr.c);
              }
              ((Unsafe)localObject2).putObject(localObject4, l1, localObject1);
              i2 |= i11;
            }
            else
            {
              break label458;
              if (i7 == 0)
              {
                i1 = Vr.b(paramArrayOfByte, i3, paramWr);
                ((Unsafe)localObject2).putLong(paramT, l1, is.a(paramWr.b));
                i4 = i2 | i11;
                i3 = paramInt1;
                localObject1 = paramWr;
                paramInt1 = i1;
                i1 = paramInt2;
                break label1102;
              }
              label458:
              continue;
              localObject1 = paramWr;
              if (i7 != 0) {
                continue;
              }
              i4 = Vr.a(paramArrayOfByte, i3, (Wr)localObject1);
              ((Unsafe)localObject2).putInt(localObject4, l1, is.a(((Wr)localObject1).a));
              break label631;
              localObject1 = paramWr;
              if (i7 != 0) {
                continue;
              }
              i3 = Vr.a(paramArrayOfByte, i3, (Wr)localObject1);
              i4 = ((Wr)localObject1).a;
              localObject1 = ((mt)localObject3).c(i8);
              if ((localObject1 != null) && (((Is)localObject1).a(i4) == null))
              {
                a(paramT).a(paramInt1, Long.valueOf(i4));
              }
              else
              {
                ((Unsafe)localObject2).putInt(localObject4, l1, i4);
                i2 |= i11;
              }
            }
            i4 = i2;
            break label646;
            localObject1 = paramWr;
            if (i7 == 2)
            {
              i4 = Vr.e(paramArrayOfByte, i3, (Wr)localObject1);
              ((Unsafe)localObject2).putObject(localObject4, l1, ((Wr)localObject1).c);
              label631:
              i2 |= i11;
              i3 = i4;
              i4 = i2;
              label646:
              i1 = paramInt2;
              i2 = paramInt1;
              localObject1 = paramWr;
              paramInt1 = i3;
              i3 = i2;
              break label1102;
              localObject1 = paramWr;
              if (i7 == 2)
              {
                i4 = a(((mt)localObject3).a(i8), paramArrayOfByte, i3, paramInt2, (Wr)localObject1);
                if ((i2 & i11) == 0) {
                  localObject1 = ((Wr)localObject1).c;
                } else {
                  localObject1 = Gs.a(((Unsafe)localObject2).getObject(localObject4, l1), ((Wr)localObject1).c);
                }
              }
              else
              {
                break label927;
                localObject3 = paramWr;
                localObject1 = paramArrayOfByte;
                if (i7 != 2) {
                  break label927;
                }
                if ((i9 & 0x20000000) == 0) {
                  i4 = Vr.c((byte[])localObject1, i3, (Wr)localObject3);
                } else {
                  i4 = Vr.d((byte[])localObject1, i3, (Wr)localObject3);
                }
                localObject1 = ((Wr)localObject3).c;
              }
              ((Unsafe)localObject2).putObject(localObject4, l1, localObject1);
              break label883;
              localObject1 = paramWr;
              if (i7 == 0)
              {
                i4 = Vr.b(paramArrayOfByte, i3, (Wr)localObject1);
                boolean bool;
                if (((Wr)localObject1).b != 0L) {
                  bool = true;
                } else {
                  bool = false;
                }
                Yt.a(localObject4, l1, bool);
                if (i7 == 5)
                {
                  ((Unsafe)localObject2).putInt(localObject4, l1, Vr.a(paramArrayOfByte, i3));
                  i4 = i3 + 4;
                  label883:
                  i2 |= i11;
                  i3 = paramInt2;
                  break label1084;
                  if (i7 == 1)
                  {
                    ((Unsafe)localObject2).putLong(paramT, l1, Vr.b(paramArrayOfByte, i3));
                    i4 = i3 + 8;
                    break label1073;
                  }
                }
              }
              label927:
              break label1109;
              localObject1 = paramWr;
              if (i7 == 0)
              {
                i4 = Vr.a(paramArrayOfByte, i3, (Wr)localObject1);
                ((Unsafe)localObject2).putInt(localObject4, l1, ((Wr)localObject1).a);
                if (i7 == 0)
                {
                  i4 = Vr.b(paramArrayOfByte, i3, paramWr);
                  ((Unsafe)localObject2).putLong(paramT, l1, paramWr.b);
                  i2 |= i11;
                  i1 = paramInt2;
                  i3 = paramInt1;
                  localObject1 = paramWr;
                  paramInt1 = i4;
                  break label1098;
                  i4 = i3;
                  if (i7 == 5)
                  {
                    Yt.a(localObject4, l1, Vr.d(paramArrayOfByte, i4));
                    i4 += 4;
                    break label1073;
                    i4 = i3;
                    if (i7 == 1)
                    {
                      Yt.a(localObject4, l1, Vr.c(paramArrayOfByte, i4));
                      i4 += 8;
                      label1073:
                      i2 |= i11;
                      i3 = paramInt2;
                      label1084:
                      localObject1 = paramWr;
                      i1 = i3;
                      i3 = paramInt1;
                      paramInt1 = i4;
                      label1098:
                      i4 = i2;
                      label1102:
                      i2 = paramInt3;
                      break;
                    }
                  }
                }
              }
            }
          }
          label1109:
          i4 = paramInt1;
          paramInt1 = i5;
          i5 = i2;
          break label1467;
        }
        i2 = i5;
        if (i10 == 27)
        {
          if (i7 == 2)
          {
            localObject5 = (Js)((Unsafe)localObject2).getObject(localObject4, l1);
            localObject1 = localObject5;
            if (!((Js)localObject5).la())
            {
              i5 = ((List)localObject5).size();
              if (i5 == 0) {
                i5 = 10;
              } else {
                i5 <<= 1;
              }
              localObject1 = ((Js)localObject5).k(i5);
              ((Unsafe)localObject2).putObject(localObject4, l1, localObject1);
            }
            localObject4 = ((mt)localObject3).a(i8);
            i5 = paramInt1;
            paramInt1 = a((zt)localObject4, i5, paramArrayOfByte, i3, paramInt2, (Js)localObject1, paramWr);
            i1 = paramInt2;
            i11 = paramInt3;
            localObject1 = paramWr;
            i3 = i5;
            i5 = i2;
            i2 = i11;
            continue;
          }
        }
        else
        {
          i1 = i4;
          if (i10 <= 49)
          {
            i5 = a(paramT, paramArrayOfByte, i3, paramInt2, paramInt1, i6, i7, i8, i9, i10, l1, paramWr);
            i4 = i5;
            if (i5 == i3)
            {
              i4 = i5;
              break label1432;
            }
          }
          do
          {
            i3 = paramInt1;
            i11 = paramInt3;
            paramInt1 = i4;
            i5 = i1;
            break label1531;
            i11 = i3;
            if (i10 == 50)
            {
              if (i7 != 2) {
                break;
              }
              a(paramT, paramArrayOfByte, i11, paramInt2, i8, i6, l1, paramWr);
              throw null;
            }
            i5 = a(paramT, paramArrayOfByte, i11, paramInt2, paramInt1, i6, i7, i9, i10, l1, i8, paramWr);
            i4 = i5;
          } while (i5 != i11);
          i4 = i5;
          label1432:
          i3 = i4;
          i4 = paramInt1;
          paramInt1 = i2;
          i5 = i1;
          break label1467;
        }
      }
      i1 = i5;
      i2 = paramInt1;
      i5 = i4;
      paramInt1 = i1;
      i4 = i2;
      label1467:
      i2 = paramInt3;
      if (i4 == i2)
      {
        i8 = i3;
        i11 = i2;
        i1 = i4;
        i10 = paramInt1;
        i7 = i5;
        if (i2 != 0) {
          break label1573;
        }
      }
      i1 = a(i4, paramArrayOfByte, i3, paramInt2, paramT, paramWr);
      i11 = i2;
      i2 = paramInt1;
      i3 = i4;
      paramInt1 = i1;
      label1531:
      i1 = paramInt2;
      localObject1 = paramWr;
      i4 = i5;
      i5 = i2;
      i2 = i11;
    }
    int i7 = i4;
    int i10 = i5;
    i1 = i3;
    int i11 = i2;
    int i8 = paramInt1;
    label1573:
    if (i10 != -1) {
      ((Unsafe)localObject2).putInt(paramT, i10, i7);
    }
    paramArrayOfByte = paramT;
    paramWr = this.m;
    if (paramWr != null)
    {
      paramInt3 = paramWr.length;
      paramT = null;
      paramInt1 = 0;
      while (paramInt1 < paramInt3)
      {
        i4 = paramWr[paramInt1];
        localObject2 = this.q;
        i5 = this.b[i4];
        localObject1 = Yt.f(paramArrayOfByte, d(i4) & 0xFFFFF);
        if (localObject1 != null)
        {
          localObject4 = c(i4);
          if (localObject4 != null) {}
        }
        else
        {
          paramT = (St)paramT;
          paramInt1++;
          continue;
        }
        a(i4, i5, this.s.f(localObject1), (Is)localObject4, paramT, (Rt)localObject2);
        throw null;
      }
      if (paramT != null) {
        this.q.b(paramArrayOfByte, paramT);
      }
    }
    if (i11 == 0)
    {
      if (i8 != paramInt2) {
        throw Ks.d();
      }
    }
    else {
      if ((i8 > paramInt2) || (i1 != i11)) {
        break label1766;
      }
    }
    return i8;
    label1766:
    throw Ks.d();
  }
  
  private static int a(zt<?> paramzt, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, Js<?> paramJs, Wr paramWr)
    throws IOException
  {
    int i1;
    for (paramInt2 = a(paramzt, paramArrayOfByte, paramInt2, paramInt3, paramWr);; paramInt2 = a(paramzt, paramArrayOfByte, i1, paramInt3, paramWr))
    {
      paramJs.add(paramWr.c);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i1 = Vr.a(paramArrayOfByte, paramInt2, paramWr);
      if (paramInt1 != paramWr.a) {
        break;
      }
    }
    return paramInt2;
  }
  
  private static int a(zt paramzt, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, Wr paramWr)
    throws IOException
  {
    mt localmt = (mt)paramzt;
    paramzt = localmt.a();
    paramInt1 = localmt.a(paramzt, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramWr);
    localmt.g(paramzt);
    paramWr.c = paramzt;
    return paramInt1;
  }
  
  private static int a(zt paramzt, byte[] paramArrayOfByte, int paramInt1, int paramInt2, Wr paramWr)
    throws IOException
  {
    int i1 = paramInt1 + 1;
    int i2 = paramArrayOfByte[paramInt1];
    int i3 = i1;
    paramInt1 = i2;
    if (i2 < 0)
    {
      i3 = Vr.a(i2, paramArrayOfByte, i1, paramWr);
      paramInt1 = paramWr.a;
    }
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2 - i3))
    {
      Object localObject = paramzt.a();
      paramInt1 += i3;
      paramzt.a(localObject, paramArrayOfByte, i3, paramInt1, paramWr);
      paramzt.g(localObject);
      paramWr.c = localObject;
      return paramInt1;
    }
    throw Ks.a();
  }
  
  private static St a(Object paramObject)
  {
    Es localEs = (Es)paramObject;
    St localSt = localEs.zzjp;
    paramObject = localSt;
    if (localSt == St.b())
    {
      paramObject = St.c();
      localEs.zzjp = ((St)paramObject);
    }
    return (St)paramObject;
  }
  
  private final <K, V, UT, UB> UB a(int paramInt1, int paramInt2, Map<K, V> paramMap, Is<?> paramIs, UB paramUB, Rt<UT, UB> paramRt)
  {
    this.s.e(b(paramInt1));
    throw null;
  }
  
  private static <E> List<E> a(Object paramObject, long paramLong)
  {
    return (List)Yt.f(paramObject, paramLong);
  }
  
  static <T> mt<T> a(Class<T> paramClass, gt paramgt, pt parampt, Us paramUs, Rt<?, ?> paramRt, rs<?> paramrs, dt paramdt)
  {
    boolean bool = paramgt instanceof wt;
    xt localxt = null;
    if (bool)
    {
      wt localwt = (wt)paramgt;
      if (localwt.e() == Es.e.j) {
        bool = true;
      } else {
        bool = false;
      }
      int i1;
      int i2;
      int i3;
      if (localwt.a() == 0)
      {
        i1 = 0;
        i2 = 0;
        i3 = 0;
      }
      else
      {
        i2 = localwt.c();
        i3 = localwt.g();
        i1 = localwt.k();
      }
      int[] arrayOfInt = new int[i1 << 2];
      Object[] arrayOfObject = new Object[i1 << 1];
      if (localwt.h() > 0) {
        paramClass = new int[localwt.h()];
      } else {
        paramClass = null;
      }
      paramgt = localxt;
      if (localwt.i() > 0) {
        paramgt = new int[localwt.i()];
      }
      localxt = localwt.b();
      if (localxt.a())
      {
        int i4 = localxt.b();
        int i5 = 0;
        int i6 = 0;
        int i10;
        for (i1 = 0;; i1 = i10)
        {
          int i7;
          if ((i4 < localwt.l()) && (i5 < i4 - i2 << 2)) {
            for (i7 = 0;; i7++)
            {
              i8 = i4;
              i9 = i6;
              i10 = i1;
              if (i7 >= 4) {
                break;
              }
              arrayOfInt[(i5 + i7)] = -1;
            }
          }
          if (localxt.d()) {
            i10 = (int)Yt.a(localxt.e());
          }
          for (i4 = (int)Yt.a(localxt.f());; i4 = 0)
          {
            i9 = 0;
            break;
            i10 = (int)Yt.a(localxt.g());
            if (localxt.h())
            {
              i4 = (int)Yt.a(localxt.i());
              i9 = localxt.j();
              break;
            }
          }
          arrayOfInt[i5] = localxt.b();
          int i11 = i5 + 1;
          if (localxt.l()) {
            i8 = 536870912;
          } else {
            i8 = 0;
          }
          if (localxt.k()) {
            i7 = 268435456;
          } else {
            i7 = 0;
          }
          arrayOfInt[i11] = (i8 | i7 | localxt.c() << 20 | i10);
          arrayOfInt[(i5 + 2)] = (i4 | i9 << 20);
          if (localxt.o() != null)
          {
            i4 = i5 / 4 << 1;
            arrayOfObject[i4] = localxt.o();
            if (localxt.m() != null) {
              arrayOfObject[(i4 + 1)] = localxt.m();
            } else if (localxt.n() != null) {
              arrayOfObject[(i4 + 1)] = localxt.n();
            }
          }
          else if (localxt.m() != null)
          {
            arrayOfObject[((i5 / 4 << 1) + 1)] = localxt.m();
          }
          else if (localxt.n() != null)
          {
            arrayOfObject[((i5 / 4 << 1) + 1)] = localxt.n();
          }
          int i9 = localxt.c();
          if (i9 == zs.Y.ordinal())
          {
            paramClass[i6] = i5;
            i4 = i6 + 1;
            i10 = i1;
          }
          else
          {
            i4 = i6;
            i10 = i1;
            if (i9 >= 18)
            {
              i4 = i6;
              i10 = i1;
              if (i9 <= 49)
              {
                arrayOfInt[i11] &= 0xFFFFF;
                i10 = i1 + 1;
                i4 = i6;
              }
            }
          }
          if (!localxt.a()) {
            break;
          }
          int i8 = localxt.b();
          i9 = i4;
          i5 += 4;
          i4 = i8;
          i6 = i9;
        }
      }
      return new mt(arrayOfInt, arrayOfObject, i2, i3, localwt.l(), localwt.d(), bool, false, localwt.j(), paramClass, paramgt, parampt, paramUs, paramRt, paramrs, paramdt);
    }
    ((Mt)paramgt).e();
    throw null;
  }
  
  private final zt a(int paramInt)
  {
    paramInt = paramInt / 4 << 1;
    zt localzt = (zt)this.c[paramInt];
    if (localzt != null) {
      return localzt;
    }
    localzt = ut.a().a((Class)this.c[(paramInt + 1)]);
    this.c[paramInt] = localzt;
    return localzt;
  }
  
  private static void a(int paramInt, Object paramObject, lu paramlu)
    throws IOException
  {
    if ((paramObject instanceof String))
    {
      paramlu.a(paramInt, (String)paramObject);
      return;
    }
    paramlu.a(paramInt, (_r)paramObject);
  }
  
  private static <UT, UB> void a(Rt<UT, UB> paramRt, T paramT, lu paramlu)
    throws IOException
  {
    paramRt.a(paramRt.c(paramT), paramlu);
  }
  
  private final void a(T paramT1, T paramT2, int paramInt)
  {
    long l1 = d(paramInt) & 0xFFFFF;
    if (!a(paramT2, paramInt)) {
      return;
    }
    Object localObject = Yt.f(paramT1, l1);
    paramT2 = Yt.f(paramT2, l1);
    if ((localObject != null) && (paramT2 != null))
    {
      Yt.a(paramT1, l1, Gs.a(localObject, paramT2));
      b(paramT1, paramInt);
      return;
    }
    if (paramT2 != null)
    {
      Yt.a(paramT1, l1, paramT2);
      b(paramT1, paramInt);
    }
  }
  
  private final <K, V> void a(lu paramlu, int paramInt1, Object paramObject, int paramInt2)
    throws IOException
  {
    if (paramObject == null) {
      return;
    }
    this.s.e(b(paramInt2));
    throw null;
  }
  
  private final boolean a(T paramT, int paramInt)
  {
    if (this.j)
    {
      paramInt = d(paramInt);
      long l1 = paramInt & 0xFFFFF;
      switch ((paramInt & 0xFF00000) >>> 20)
      {
      default: 
        throw new IllegalArgumentException();
      case 17: 
        return Yt.f(paramT, l1) != null;
      case 16: 
        return Yt.b(paramT, l1) != 0L;
      case 15: 
        return Yt.a(paramT, l1) != 0;
      case 14: 
        return Yt.b(paramT, l1) != 0L;
      case 13: 
        return Yt.a(paramT, l1) != 0;
      case 12: 
        return Yt.a(paramT, l1) != 0;
      case 11: 
        return Yt.a(paramT, l1) != 0;
      case 10: 
        return !_r.a.equals(Yt.f(paramT, l1));
      case 9: 
        return Yt.f(paramT, l1) != null;
      case 8: 
        paramT = Yt.f(paramT, l1);
        if ((paramT instanceof String)) {
          return !((String)paramT).isEmpty();
        }
        if ((paramT instanceof _r)) {
          return !_r.a.equals(paramT);
        }
        throw new IllegalArgumentException();
      case 7: 
        return Yt.c(paramT, l1);
      case 6: 
        return Yt.a(paramT, l1) != 0;
      case 5: 
        return Yt.b(paramT, l1) != 0L;
      case 4: 
        return Yt.a(paramT, l1) != 0;
      case 3: 
        return Yt.b(paramT, l1) != 0L;
      case 2: 
        return Yt.b(paramT, l1) != 0L;
      case 1: 
        return Yt.d(paramT, l1) != 0.0F;
      }
      return Yt.e(paramT, l1) != 0.0D;
    }
    paramInt = e(paramInt);
    return (Yt.a(paramT, paramInt & 0xFFFFF) & 1 << (paramInt >>> 20)) != 0;
  }
  
  private final boolean a(T paramT, int paramInt1, int paramInt2)
  {
    return Yt.a(paramT, e(paramInt2) & 0xFFFFF) == paramInt1;
  }
  
  private final boolean a(T paramT, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.j) {
      return a(paramT, paramInt1);
    }
    return (paramInt2 & paramInt3) != 0;
  }
  
  private static boolean a(Object paramObject, int paramInt, zt paramzt)
  {
    return paramzt.f(Yt.f(paramObject, paramInt & 0xFFFFF));
  }
  
  private static <T> double b(T paramT, long paramLong)
  {
    return ((Double)Yt.f(paramT, paramLong)).doubleValue();
  }
  
  private final Object b(int paramInt)
  {
    return this.c[(paramInt / 4 << 1)];
  }
  
  private final void b(T paramT, int paramInt)
  {
    if (this.j) {
      return;
    }
    paramInt = e(paramInt);
    long l1 = paramInt & 0xFFFFF;
    Yt.a(paramT, l1, Yt.a(paramT, l1) | 1 << (paramInt >>> 20));
  }
  
  private final void b(T paramT, int paramInt1, int paramInt2)
  {
    Yt.a(paramT, e(paramInt2) & 0xFFFFF, paramInt1);
  }
  
  private final void b(T paramT1, T paramT2, int paramInt)
  {
    int i1 = d(paramInt);
    int i2 = this.b[paramInt];
    long l1 = i1 & 0xFFFFF;
    if (!a(paramT2, i2, paramInt)) {
      return;
    }
    Object localObject = Yt.f(paramT1, l1);
    paramT2 = Yt.f(paramT2, l1);
    if ((localObject != null) && (paramT2 != null))
    {
      Yt.a(paramT1, l1, Gs.a(localObject, paramT2));
      b(paramT1, i2, paramInt);
      return;
    }
    if (paramT2 != null)
    {
      Yt.a(paramT1, l1, paramT2);
      b(paramT1, i2, paramInt);
    }
  }
  
  private final void b(T paramT, lu paramlu)
    throws IOException
  {
    if (this.h)
    {
      localObject1 = this.r.a(paramT);
      if (!((vs)localObject1).b())
      {
        localIterator = ((vs)localObject1).e();
        localObject1 = (Map.Entry)localIterator.next();
        break label48;
      }
    }
    Iterator localIterator = null;
    Object localObject1 = null;
    label48:
    int i1 = -1;
    int i2 = this.b.length;
    Unsafe localUnsafe = a;
    int i3 = 0;
    int i4 = 0;
    while (i3 < i2)
    {
      int i5 = d(i3);
      Object localObject2 = this.b;
      int i6 = localObject2[i3];
      int i7 = (0xFF00000 & i5) >>> 20;
      int i9;
      if ((!this.j) && (i7 <= 17))
      {
        int i8 = localObject2[(i3 + 2)];
        i9 = i8 & 0xFFFFF;
        if (i9 != i1)
        {
          i4 = localUnsafe.getInt(paramT, i9);
          i1 = i9;
        }
        i9 = 1 << (i8 >>> 20);
      }
      else
      {
        i9 = 0;
      }
      while ((localObject1 != null) && (this.r.a((Map.Entry)localObject1) <= i6))
      {
        this.r.a(paramlu, (Map.Entry)localObject1);
        if (localIterator.hasNext()) {
          localObject1 = (Map.Entry)localIterator.next();
        } else {
          localObject1 = null;
        }
      }
      long l1 = i5 & 0xFFFFF;
      switch (i7)
      {
      }
      for (;;)
      {
        break;
        if (a(paramT, i6, i3))
        {
          paramlu.b(i6, localUnsafe.getObject(paramT, l1), a(i3));
          continue;
          if (a(paramT, i6, i3))
          {
            paramlu.a(i6, e(paramT, l1));
            continue;
            if (a(paramT, i6, i3))
            {
              paramlu.c(i6, d(paramT, l1));
              continue;
              if (a(paramT, i6, i3))
              {
                paramlu.d(i6, e(paramT, l1));
                continue;
                if (a(paramT, i6, i3))
                {
                  paramlu.f(i6, d(paramT, l1));
                  continue;
                  if (a(paramT, i6, i3))
                  {
                    paramlu.e(i6, d(paramT, l1));
                    continue;
                    if (a(paramT, i6, i3))
                    {
                      paramlu.b(i6, d(paramT, l1));
                      continue;
                      if (a(paramT, i6, i3))
                      {
                        paramlu.a(i6, (_r)localUnsafe.getObject(paramT, l1));
                        continue;
                        if (a(paramT, i6, i3))
                        {
                          paramlu.a(i6, localUnsafe.getObject(paramT, l1), a(i3));
                          continue;
                          if (a(paramT, i6, i3))
                          {
                            a(i6, localUnsafe.getObject(paramT, l1), paramlu);
                            continue;
                            if (a(paramT, i6, i3))
                            {
                              paramlu.a(i6, f(paramT, l1));
                              continue;
                              if (a(paramT, i6, i3))
                              {
                                paramlu.a(i6, d(paramT, l1));
                                continue;
                                if (a(paramT, i6, i3))
                                {
                                  paramlu.b(i6, e(paramT, l1));
                                  continue;
                                  if (a(paramT, i6, i3))
                                  {
                                    paramlu.d(i6, d(paramT, l1));
                                    continue;
                                    if (a(paramT, i6, i3))
                                    {
                                      paramlu.c(i6, e(paramT, l1));
                                      continue;
                                      if (a(paramT, i6, i3))
                                      {
                                        paramlu.e(i6, e(paramT, l1));
                                        continue;
                                        if (a(paramT, i6, i3))
                                        {
                                          paramlu.a(i6, c(paramT, l1));
                                          continue;
                                          if (a(paramT, i6, i3))
                                          {
                                            paramlu.a(i6, b(paramT, l1));
                                            continue;
                                            a(paramlu, i6, localUnsafe.getObject(paramT, l1), i3);
                                            continue;
                                            Bt.b(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, a(i3));
                                            continue;
                                            i9 = this.b[i3];
                                            localObject2 = (List)localUnsafe.getObject(paramT, l1);
                                            boolean bool = true;
                                            break label1465;
                                            bool = true;
                                            i9 = this.b[i3];
                                            break label1490;
                                            bool = true;
                                            i9 = this.b[i3];
                                            break label1524;
                                            bool = true;
                                            i9 = this.b[i3];
                                            break label1558;
                                            bool = true;
                                            i9 = this.b[i3];
                                            break label1592;
                                            bool = true;
                                            i9 = this.b[i3];
                                            break label1626;
                                            Bt.n(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, true);
                                            continue;
                                            Bt.k(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, true);
                                            continue;
                                            Bt.f(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, true);
                                            continue;
                                            Bt.h(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, true);
                                            continue;
                                            Bt.d(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, true);
                                            continue;
                                            Bt.c(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, true);
                                            continue;
                                            Bt.b(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, true);
                                            continue;
                                            Bt.a(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, true);
                                            continue;
                                            i9 = this.b[i3];
                                            localObject2 = (List)localUnsafe.getObject(paramT, l1);
                                            bool = false;
                                            label1465:
                                            Bt.e(i9, (List)localObject2, paramlu, bool);
                                            continue;
                                            bool = false;
                                            i9 = this.b[i3];
                                            label1490:
                                            Bt.j(i9, (List)localUnsafe.getObject(paramT, l1), paramlu, bool);
                                            continue;
                                            bool = false;
                                            i9 = this.b[i3];
                                            label1524:
                                            Bt.g(i9, (List)localUnsafe.getObject(paramT, l1), paramlu, bool);
                                            continue;
                                            bool = false;
                                            i9 = this.b[i3];
                                            label1558:
                                            Bt.l(i9, (List)localUnsafe.getObject(paramT, l1), paramlu, bool);
                                            continue;
                                            bool = false;
                                            i9 = this.b[i3];
                                            label1592:
                                            Bt.m(i9, (List)localUnsafe.getObject(paramT, l1), paramlu, bool);
                                            continue;
                                            bool = false;
                                            i9 = this.b[i3];
                                            label1626:
                                            Bt.i(i9, (List)localUnsafe.getObject(paramT, l1), paramlu, bool);
                                            continue;
                                            Bt.b(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu);
                                            continue;
                                            Bt.a(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, a(i3));
                                            continue;
                                            Bt.a(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu);
                                            continue;
                                            Bt.n(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, false);
                                            break;
                                            Bt.k(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, false);
                                            break;
                                            Bt.f(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, false);
                                            break;
                                            Bt.h(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, false);
                                            break;
                                            Bt.d(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, false);
                                            break;
                                            Bt.c(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, false);
                                            break;
                                            Bt.b(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, false);
                                            break;
                                            Bt.a(this.b[i3], (List)localUnsafe.getObject(paramT, l1), paramlu, false);
                                            break;
                                            if ((i4 & i9) != 0)
                                            {
                                              paramlu.b(i6, localUnsafe.getObject(paramT, l1), a(i3));
                                              break;
                                              if ((i4 & i9) != 0)
                                              {
                                                paramlu.a(i6, localUnsafe.getLong(paramT, l1));
                                                break;
                                                if ((i4 & i9) != 0)
                                                {
                                                  paramlu.c(i6, localUnsafe.getInt(paramT, l1));
                                                  break;
                                                  if ((i4 & i9) != 0)
                                                  {
                                                    paramlu.d(i6, localUnsafe.getLong(paramT, l1));
                                                    break;
                                                    if ((i4 & i9) != 0)
                                                    {
                                                      paramlu.f(i6, localUnsafe.getInt(paramT, l1));
                                                      break;
                                                      if ((i4 & i9) != 0)
                                                      {
                                                        paramlu.e(i6, localUnsafe.getInt(paramT, l1));
                                                        break;
                                                        if ((i4 & i9) != 0)
                                                        {
                                                          paramlu.b(i6, localUnsafe.getInt(paramT, l1));
                                                          break;
                                                          if ((i4 & i9) != 0)
                                                          {
                                                            paramlu.a(i6, (_r)localUnsafe.getObject(paramT, l1));
                                                            break;
                                                            if ((i4 & i9) != 0)
                                                            {
                                                              paramlu.a(i6, localUnsafe.getObject(paramT, l1), a(i3));
                                                              break;
                                                              if ((i4 & i9) != 0)
                                                              {
                                                                a(i6, localUnsafe.getObject(paramT, l1), paramlu);
                                                                break;
                                                                if ((i4 & i9) != 0)
                                                                {
                                                                  paramlu.a(i6, Yt.c(paramT, l1));
                                                                  break;
                                                                  if ((i4 & i9) != 0)
                                                                  {
                                                                    paramlu.a(i6, localUnsafe.getInt(paramT, l1));
                                                                    break;
                                                                    if ((i4 & i9) != 0)
                                                                    {
                                                                      paramlu.b(i6, localUnsafe.getLong(paramT, l1));
                                                                      break;
                                                                      if ((i4 & i9) != 0)
                                                                      {
                                                                        paramlu.d(i6, localUnsafe.getInt(paramT, l1));
                                                                        break;
                                                                        if ((i4 & i9) != 0)
                                                                        {
                                                                          paramlu.c(i6, localUnsafe.getLong(paramT, l1));
                                                                          break;
                                                                          if ((i4 & i9) != 0)
                                                                          {
                                                                            paramlu.e(i6, localUnsafe.getLong(paramT, l1));
                                                                            break;
                                                                            if ((i4 & i9) != 0)
                                                                            {
                                                                              paramlu.a(i6, Yt.d(paramT, l1));
                                                                              break;
                                                                              if ((i4 & i9) != 0) {
                                                                                paramlu.a(i6, Yt.e(paramT, l1));
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      i3 += 4;
    }
    while (localObject1 != null)
    {
      this.r.a(paramlu, (Map.Entry)localObject1);
      if (localIterator.hasNext()) {
        localObject1 = (Map.Entry)localIterator.next();
      } else {
        localObject1 = null;
      }
    }
    a(this.q, paramT, paramlu);
  }
  
  private static <T> float c(T paramT, long paramLong)
  {
    return ((Float)Yt.f(paramT, paramLong)).floatValue();
  }
  
  private final Is<?> c(int paramInt)
  {
    return (Is)this.c[((paramInt / 4 << 1) + 1)];
  }
  
  private final boolean c(T paramT1, T paramT2, int paramInt)
  {
    return a(paramT1, paramInt) == a(paramT2, paramInt);
  }
  
  private final int d(int paramInt)
  {
    return this.b[(paramInt + 1)];
  }
  
  private static <T> int d(T paramT, long paramLong)
  {
    return ((Integer)Yt.f(paramT, paramLong)).intValue();
  }
  
  private final int e(int paramInt)
  {
    return this.b[(paramInt + 2)];
  }
  
  private static <T> long e(T paramT, long paramLong)
  {
    return ((Long)Yt.f(paramT, paramLong)).longValue();
  }
  
  private final int f(int paramInt)
  {
    int i1 = this.d;
    if (paramInt >= i1)
    {
      int i2 = this.f;
      if (paramInt < i2)
      {
        i2 = paramInt - i1 << 2;
        if (this.b[i2] == paramInt) {
          return i2;
        }
        return -1;
      }
      if (paramInt <= this.e)
      {
        i2 -= i1;
        i1 = this.b.length / 4 - 1;
        while (i2 <= i1)
        {
          int i3 = i1 + i2 >>> 1;
          int i4 = i3 << 2;
          int i5 = this.b[i4];
          if (paramInt == i5) {
            return i4;
          }
          if (paramInt < i5) {
            i1 = i3 - 1;
          } else {
            i2 = i3 + 1;
          }
        }
      }
    }
    return -1;
  }
  
  private static <T> boolean f(T paramT, long paramLong)
  {
    return ((Boolean)Yt.f(paramT, paramLong)).booleanValue();
  }
  
  public final T a()
  {
    return (T)this.o.a(this.g);
  }
  
  public final void a(T paramT, lu paramlu)
    throws IOException
  {
    Object localObject1;
    Iterator localIterator;
    label70:
    int i1;
    Object localObject2;
    int i2;
    int i3;
    long l1;
    boolean bool;
    float f1;
    double d1;
    if (paramlu.a() == Es.e.m)
    {
      a(this.q, paramT, paramlu);
      if (this.h)
      {
        localObject1 = this.r.a(paramT);
        if (!((vs)localObject1).b())
        {
          localIterator = ((vs)localObject1).a();
          localObject1 = (Map.Entry)localIterator.next();
          break label70;
        }
      }
      localIterator = null;
      localObject1 = localIterator;
      for (i1 = this.b.length - 4;; i1 -= 4)
      {
        localObject2 = localObject1;
        if (i1 < 0) {
          break;
        }
        i2 = d(i1);
        i3 = this.b[i1];
        while ((localObject1 != null) && (this.r.a((Map.Entry)localObject1) > i3))
        {
          this.r.a(paramlu, (Map.Entry)localObject1);
          if (localIterator.hasNext()) {
            localObject1 = (Map.Entry)localIterator.next();
          } else {
            localObject1 = null;
          }
        }
        switch ((i2 & 0xFF00000) >>> 20)
        {
        default: 
          break;
        case 68: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          break;
        case 67: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          l1 = e(paramT, i2 & 0xFFFFF);
          break;
        case 66: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          i2 = d(paramT, i2 & 0xFFFFF);
          break;
        case 65: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          l1 = e(paramT, i2 & 0xFFFFF);
          break;
        case 64: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          i2 = d(paramT, i2 & 0xFFFFF);
          break;
        case 63: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          i2 = d(paramT, i2 & 0xFFFFF);
          break;
        case 62: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          i2 = d(paramT, i2 & 0xFFFFF);
          break;
        case 61: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          break;
        case 60: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          break;
        case 59: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          break;
        case 58: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          bool = f(paramT, i2 & 0xFFFFF);
          break;
        case 57: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          i2 = d(paramT, i2 & 0xFFFFF);
          break;
        case 56: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          l1 = e(paramT, i2 & 0xFFFFF);
          break;
        case 55: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          i2 = d(paramT, i2 & 0xFFFFF);
          break;
        case 54: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          l1 = e(paramT, i2 & 0xFFFFF);
          break;
        case 53: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          l1 = e(paramT, i2 & 0xFFFFF);
          break;
        case 52: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          f1 = c(paramT, i2 & 0xFFFFF);
          break;
        case 51: 
          if (!a(paramT, i3, i1)) {
            continue;
          }
          d1 = b(paramT, i2 & 0xFFFFF);
          break;
        case 50: 
          a(paramlu, i3, Yt.f(paramT, i2 & 0xFFFFF), i1);
          break;
        case 49: 
          Bt.b(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, a(i1));
          break;
        case 48: 
          Bt.e(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 47: 
          Bt.j(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 46: 
          Bt.g(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 45: 
          Bt.l(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 44: 
          Bt.m(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 43: 
          Bt.i(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 42: 
          Bt.n(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 41: 
          Bt.k(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 40: 
          Bt.f(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 39: 
          Bt.h(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 38: 
          Bt.d(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 37: 
          Bt.c(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 36: 
          Bt.b(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 35: 
          Bt.a(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 34: 
          Bt.e(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 33: 
          Bt.j(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 32: 
          Bt.g(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 31: 
          Bt.l(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 30: 
          Bt.m(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 29: 
          Bt.i(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 28: 
          Bt.b(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu);
          break;
        case 27: 
          Bt.a(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, a(i1));
          break;
        case 26: 
          Bt.a(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu);
          break;
        case 25: 
          Bt.n(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 24: 
          Bt.k(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 23: 
          Bt.f(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 22: 
          Bt.h(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 21: 
          Bt.d(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 20: 
          Bt.c(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 19: 
          Bt.b(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 18: 
          Bt.a(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 17: 
          if (!a(paramT, i1)) {
            continue;
          }
          paramlu.b(i3, Yt.f(paramT, i2 & 0xFFFFF), a(i1));
          break;
        case 16: 
          if (!a(paramT, i1)) {
            continue;
          }
          l1 = Yt.b(paramT, i2 & 0xFFFFF);
          paramlu.a(i3, l1);
          break;
        case 15: 
          if (!a(paramT, i1)) {
            continue;
          }
          i2 = Yt.a(paramT, i2 & 0xFFFFF);
          paramlu.c(i3, i2);
          break;
        case 14: 
          if (!a(paramT, i1)) {
            continue;
          }
          l1 = Yt.b(paramT, i2 & 0xFFFFF);
          paramlu.d(i3, l1);
          break;
        case 13: 
          if (!a(paramT, i1)) {
            continue;
          }
          i2 = Yt.a(paramT, i2 & 0xFFFFF);
          paramlu.f(i3, i2);
          break;
        case 12: 
          if (!a(paramT, i1)) {
            continue;
          }
          i2 = Yt.a(paramT, i2 & 0xFFFFF);
          paramlu.e(i3, i2);
          break;
        case 11: 
          if (!a(paramT, i1)) {
            continue;
          }
          i2 = Yt.a(paramT, i2 & 0xFFFFF);
          paramlu.b(i3, i2);
          break;
        case 10: 
          if (!a(paramT, i1)) {
            continue;
          }
          paramlu.a(i3, (_r)Yt.f(paramT, i2 & 0xFFFFF));
          break;
        case 9: 
          if (!a(paramT, i1)) {
            continue;
          }
          paramlu.a(i3, Yt.f(paramT, i2 & 0xFFFFF), a(i1));
          break;
        case 8: 
          if (!a(paramT, i1)) {
            continue;
          }
          a(i3, Yt.f(paramT, i2 & 0xFFFFF), paramlu);
          break;
        case 7: 
          if (!a(paramT, i1)) {
            continue;
          }
          bool = Yt.c(paramT, i2 & 0xFFFFF);
          paramlu.a(i3, bool);
          break;
        case 6: 
          if (!a(paramT, i1)) {
            continue;
          }
          i2 = Yt.a(paramT, i2 & 0xFFFFF);
          paramlu.a(i3, i2);
          break;
        case 5: 
          if (!a(paramT, i1)) {
            continue;
          }
          l1 = Yt.b(paramT, i2 & 0xFFFFF);
          paramlu.b(i3, l1);
          break;
        case 4: 
          if (!a(paramT, i1)) {
            continue;
          }
          i2 = Yt.a(paramT, i2 & 0xFFFFF);
          paramlu.d(i3, i2);
          break;
        case 3: 
          if (!a(paramT, i1)) {
            continue;
          }
          l1 = Yt.b(paramT, i2 & 0xFFFFF);
          paramlu.c(i3, l1);
          break;
        case 2: 
          if (!a(paramT, i1)) {
            continue;
          }
          l1 = Yt.b(paramT, i2 & 0xFFFFF);
          paramlu.e(i3, l1);
          break;
        case 1: 
          if (!a(paramT, i1)) {
            continue;
          }
          f1 = Yt.d(paramT, i2 & 0xFFFFF);
          paramlu.a(i3, f1);
          break;
        }
        if (a(paramT, i1))
        {
          d1 = Yt.e(paramT, i2 & 0xFFFFF);
          paramlu.a(i3, d1);
        }
      }
      while (localObject2 != null)
      {
        this.r.a(paramlu, (Map.Entry)localObject2);
        if (localIterator.hasNext()) {
          localObject2 = (Map.Entry)localIterator.next();
        } else {
          localObject2 = null;
        }
      }
      return;
    }
    if (this.j)
    {
      if (this.h)
      {
        localObject1 = this.r.a(paramT);
        if (!((vs)localObject1).b())
        {
          localIterator = ((vs)localObject1).e();
          localObject1 = (Map.Entry)localIterator.next();
          break label2560;
        }
      }
      localIterator = null;
      localObject1 = localIterator;
      label2560:
      i3 = this.b.length;
      i1 = 0;
      localObject2 = localObject1;
      for (;;)
      {
        localObject1 = localObject2;
        if (i1 >= i3) {
          break;
        }
        i2 = d(i1);
        int i4 = this.b[i1];
        while ((localObject2 != null) && (this.r.a((Map.Entry)localObject2) <= i4))
        {
          this.r.a(paramlu, (Map.Entry)localObject2);
          if (localIterator.hasNext()) {
            localObject2 = (Map.Entry)localIterator.next();
          } else {
            localObject2 = null;
          }
        }
        switch ((i2 & 0xFF00000) >>> 20)
        {
        default: 
          break;
        case 68: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          break;
        case 67: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          l1 = e(paramT, i2 & 0xFFFFF);
          break;
        case 66: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          i2 = d(paramT, i2 & 0xFFFFF);
          break;
        case 65: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          l1 = e(paramT, i2 & 0xFFFFF);
          break;
        case 64: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          i2 = d(paramT, i2 & 0xFFFFF);
          break;
        case 63: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          i2 = d(paramT, i2 & 0xFFFFF);
          break;
        case 62: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          i2 = d(paramT, i2 & 0xFFFFF);
          break;
        case 61: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          break;
        case 60: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          break;
        case 59: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          break;
        case 58: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          bool = f(paramT, i2 & 0xFFFFF);
          break;
        case 57: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          i2 = d(paramT, i2 & 0xFFFFF);
          break;
        case 56: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          l1 = e(paramT, i2 & 0xFFFFF);
          break;
        case 55: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          i2 = d(paramT, i2 & 0xFFFFF);
          break;
        case 54: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          l1 = e(paramT, i2 & 0xFFFFF);
          break;
        case 53: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          l1 = e(paramT, i2 & 0xFFFFF);
          break;
        case 52: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          f1 = c(paramT, i2 & 0xFFFFF);
          break;
        case 51: 
          if (!a(paramT, i4, i1)) {
            break label4951;
          }
          d1 = b(paramT, i2 & 0xFFFFF);
          break;
        case 50: 
          a(paramlu, i4, Yt.f(paramT, i2 & 0xFFFFF), i1);
          break;
        case 49: 
          Bt.b(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, a(i1));
          break;
        case 48: 
          Bt.e(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 47: 
          Bt.j(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 46: 
          Bt.g(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 45: 
          Bt.l(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 44: 
          Bt.m(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 43: 
          Bt.i(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 42: 
          Bt.n(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 41: 
          Bt.k(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 40: 
          Bt.f(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 39: 
          Bt.h(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 38: 
          Bt.d(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 37: 
          Bt.c(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 36: 
          Bt.b(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 35: 
          Bt.a(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, true);
          break;
        case 34: 
          Bt.e(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 33: 
          Bt.j(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 32: 
          Bt.g(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 31: 
          Bt.l(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 30: 
          Bt.m(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 29: 
          Bt.i(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 28: 
          Bt.b(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu);
          break;
        case 27: 
          Bt.a(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, a(i1));
          break;
        case 26: 
          Bt.a(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu);
          break;
        case 25: 
          Bt.n(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 24: 
          Bt.k(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 23: 
          Bt.f(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 22: 
          Bt.h(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 21: 
          Bt.d(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 20: 
          Bt.c(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 19: 
          Bt.b(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 18: 
          Bt.a(this.b[i1], (List)Yt.f(paramT, i2 & 0xFFFFF), paramlu, false);
          break;
        case 17: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          paramlu.b(i4, Yt.f(paramT, i2 & 0xFFFFF), a(i1));
          break;
        case 16: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          l1 = Yt.b(paramT, i2 & 0xFFFFF);
          paramlu.a(i4, l1);
          break;
        case 15: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          i2 = Yt.a(paramT, i2 & 0xFFFFF);
          paramlu.c(i4, i2);
          break;
        case 14: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          l1 = Yt.b(paramT, i2 & 0xFFFFF);
          paramlu.d(i4, l1);
          break;
        case 13: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          i2 = Yt.a(paramT, i2 & 0xFFFFF);
          paramlu.f(i4, i2);
          break;
        case 12: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          i2 = Yt.a(paramT, i2 & 0xFFFFF);
          paramlu.e(i4, i2);
          break;
        case 11: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          i2 = Yt.a(paramT, i2 & 0xFFFFF);
          paramlu.b(i4, i2);
          break;
        case 10: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          paramlu.a(i4, (_r)Yt.f(paramT, i2 & 0xFFFFF));
          break;
        case 9: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          paramlu.a(i4, Yt.f(paramT, i2 & 0xFFFFF), a(i1));
          break;
        case 8: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          a(i4, Yt.f(paramT, i2 & 0xFFFFF), paramlu);
          break;
        case 7: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          bool = Yt.c(paramT, i2 & 0xFFFFF);
          paramlu.a(i4, bool);
          break;
        case 6: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          i2 = Yt.a(paramT, i2 & 0xFFFFF);
          paramlu.a(i4, i2);
          break;
        case 5: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          l1 = Yt.b(paramT, i2 & 0xFFFFF);
          paramlu.b(i4, l1);
          break;
        case 4: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          i2 = Yt.a(paramT, i2 & 0xFFFFF);
          paramlu.d(i4, i2);
          break;
        case 3: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          l1 = Yt.b(paramT, i2 & 0xFFFFF);
          paramlu.c(i4, l1);
          break;
        case 2: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          l1 = Yt.b(paramT, i2 & 0xFFFFF);
          paramlu.e(i4, l1);
          break;
        case 1: 
          if (!a(paramT, i1)) {
            break label4951;
          }
          f1 = Yt.d(paramT, i2 & 0xFFFFF);
          paramlu.a(i4, f1);
          break;
        }
        if (a(paramT, i1))
        {
          d1 = Yt.e(paramT, i2 & 0xFFFFF);
          paramlu.a(i4, d1);
        }
        label4951:
        i1 += 4;
      }
      while (localObject1 != null)
      {
        this.r.a(paramlu, (Map.Entry)localObject1);
        if (localIterator.hasNext()) {
          localObject1 = (Map.Entry)localIterator.next();
        } else {
          localObject1 = null;
        }
      }
      a(this.q, paramT, paramlu);
      return;
    }
    b(paramT, paramlu);
  }
  
  public final void a(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, Wr paramWr)
    throws IOException
  {
    if (this.j)
    {
      Unsafe localUnsafe = a;
      int i1;
      for (;;)
      {
        Object localObject1 = this;
        T ? = paramT;
        i1 = paramInt2;
        Object localObject2 = paramArrayOfByte;
        Object localObject3 = paramWr;
        if (paramInt1 >= i1) {
          break;
        }
        int i2 = paramInt1 + 1;
        int i3 = localObject2[paramInt1];
        if (i3 < 0)
        {
          paramInt1 = Vr.a(i3, (byte[])localObject2, i2, (Wr)localObject3);
          i3 = ((Wr)localObject3).a;
        }
        else
        {
          paramInt1 = i2;
        }
        int i4 = i3 >>> 3;
        int i5 = i3 & 0x7;
        int i6 = ((mt)localObject1).f(i4);
        if (i6 >= 0)
        {
          int i7 = localObject1.b[(i6 + 1)];
          int i8 = (0xFF00000 & i7) >>> 20;
          long l1 = 0xFFFFF & i7;
          if (i8 <= 17)
          {
            boolean bool = true;
            long l2;
            switch (i8)
            {
            default: 
              break;
            case 16: 
              if (i5 != 0) {
                break label877;
              }
              paramInt1 = Vr.b((byte[])localObject2, paramInt1, (Wr)localObject3);
              l2 = is.a(((Wr)localObject3).b);
              break;
            case 15: 
              if (i5 != 0) {
                break label877;
              }
              paramInt1 = Vr.a((byte[])localObject2, paramInt1, (Wr)localObject3);
              i1 = is.a(((Wr)localObject3).a);
              break;
            case 12: 
              if (i5 != 0) {
                break label877;
              }
              break;
            case 10: 
              if (i5 != 2) {
                break label877;
              }
              paramInt1 = Vr.e((byte[])localObject2, paramInt1, (Wr)localObject3);
            case 9: 
            case 8: 
              for (;;)
              {
                for (localObject3 = ((Wr)localObject3).c;; localObject3 = Gs.a(localObject1, ((Wr)localObject3).c))
                {
                  localUnsafe.putObject(?, l1, localObject3);
                  break;
                  if (i5 != 2) {
                    break label877;
                  }
                  paramInt1 = a(((mt)localObject1).a(i6), (byte[])localObject2, paramInt1, i1, (Wr)localObject3);
                  localObject1 = localUnsafe.getObject(?, l1);
                  if (localObject1 == null) {
                    break label308;
                  }
                }
                if (i5 != 2) {
                  break label877;
                }
                if ((0x20000000 & i7) == 0) {
                  paramInt1 = Vr.c((byte[])localObject2, paramInt1, (Wr)localObject3);
                } else {
                  paramInt1 = Vr.d((byte[])localObject2, paramInt1, (Wr)localObject3);
                }
              }
            case 7: 
              if (i5 != 0) {
                break label877;
              }
              paramInt1 = Vr.b((byte[])localObject2, paramInt1, (Wr)localObject3);
              if (((Wr)localObject3).b == 0L) {
                bool = false;
              }
              Yt.a(?, l1, bool);
              break;
            case 6: 
            case 13: 
              if (i5 != 5) {
                break label877;
              }
              localUnsafe.putInt(?, l1, Vr.a((byte[])localObject2, paramInt1));
              break;
            case 5: 
            case 14: 
              if (i5 != 1) {
                break label877;
              }
              localUnsafe.putLong(paramT, l1, Vr.b((byte[])localObject2, paramInt1));
              break;
            case 4: 
            case 11: 
              if (i5 != 0) {
                break label877;
              }
              paramInt1 = Vr.a((byte[])localObject2, paramInt1, (Wr)localObject3);
              i1 = ((Wr)localObject3).a;
              localUnsafe.putInt(?, l1, i1);
              break;
            case 2: 
            case 3: 
              if (i5 != 0) {
                break label877;
              }
              paramInt1 = Vr.b((byte[])localObject2, paramInt1, (Wr)localObject3);
              l2 = ((Wr)localObject3).b;
              localUnsafe.putLong(paramT, l1, l2);
              break;
            case 1: 
              if (i5 != 5) {
                break label877;
              }
              Yt.a(?, l1, Vr.d((byte[])localObject2, paramInt1));
              paramInt1 += 4;
              break;
            case 0: 
              label308:
              if (i5 != 1) {
                break label877;
              }
              Yt.a(?, l1, Vr.c((byte[])localObject2, paramInt1));
              paramInt1 += 8;
              break;
            }
          }
          if (i8 == 27)
          {
            if (i5 == 2)
            {
              localObject2 = (Js)localUnsafe.getObject(?, l1);
              localObject3 = localObject2;
              if (!((Js)localObject2).la())
              {
                i1 = ((List)localObject2).size();
                if (i1 == 0) {
                  i1 = 10;
                } else {
                  i1 <<= 1;
                }
                localObject3 = ((Js)localObject2).k(i1);
                localUnsafe.putObject(?, l1, localObject3);
              }
              paramInt1 = a(((mt)localObject1).a(i6), i3, paramArrayOfByte, paramInt1, paramInt2, (Js)localObject3, paramWr);
            }
          }
          else if (i8 <= 49)
          {
            i2 = a(paramT, paramArrayOfByte, paramInt1, paramInt2, i3, i4, i5, i6, i7, i8, l1, paramWr);
            i1 = i2;
            if (i2 != paramInt1) {
              break label891;
            }
            paramInt1 = i2;
          }
          else
          {
            i2 = paramInt1;
            if (i8 == 50)
            {
              if (i5 == 2)
              {
                a(paramT, paramArrayOfByte, i2, paramInt2, i6, i4, l1, paramWr);
                throw null;
              }
            }
            else
            {
              paramInt1 = a(paramT, paramArrayOfByte, i2, paramInt2, i3, i4, i5, i7, i8, l1, i6, paramWr);
              i1 = paramInt1;
              if (paramInt1 != i2) {
                break label891;
              }
            }
          }
        }
        label877:
        i1 = a(i3, paramArrayOfByte, paramInt1, paramInt2, paramT, paramWr);
        label891:
        paramInt1 = i1;
      }
      if (paramInt1 == i1) {
        return;
      }
      throw Ks.d();
    }
    a(paramT, paramArrayOfByte, paramInt1, paramInt2, 0, paramWr);
  }
  
  public final boolean a(T paramT1, T paramT2)
  {
    int i1 = this.b.length;
    for (int i2 = 0;; i2 += 4)
    {
      boolean bool = true;
      if (i2 >= i1) {
        break;
      }
      int i3 = d(i2);
      long l1 = i3 & 0xFFFFF;
      switch ((i3 & 0xFF00000) >>> 20)
      {
      default: 
        break;
      case 51: 
      case 52: 
      case 53: 
      case 54: 
      case 55: 
      case 56: 
      case 57: 
      case 58: 
      case 59: 
      case 60: 
      case 61: 
      case 62: 
      case 63: 
      case 64: 
      case 65: 
      case 66: 
      case 67: 
      case 68: 
        long l2 = e(i2) & 0xFFFFF;
        if (Yt.a(paramT1, l2) != Yt.a(paramT2, l2)) {
          break;
        }
        if (Bt.a(Yt.f(paramT1, l1), Yt.f(paramT2, l1))) {
          break label943;
        }
        break;
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
      case 28: 
      case 29: 
      case 30: 
      case 31: 
      case 32: 
      case 33: 
      case 34: 
      case 35: 
      case 36: 
      case 37: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 43: 
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
      case 50: 
        bool = Bt.a(Yt.f(paramT1, l1), Yt.f(paramT2, l1));
        break;
      case 17: 
        if (!c(paramT1, paramT2, i2)) {
          break;
        }
        if (Bt.a(Yt.f(paramT1, l1), Yt.f(paramT2, l1))) {
          break label943;
        }
      case 16: 
        if ((goto 940) || (!c(paramT1, paramT2, i2))) {
          break;
        }
        if (Yt.b(paramT1, l1) == Yt.b(paramT2, l1)) {
          break label943;
        }
        break;
      case 15: 
        if (!c(paramT1, paramT2, i2)) {
          break;
        }
        if (Yt.a(paramT1, l1) == Yt.a(paramT2, l1)) {
          break label943;
        }
      case 14: 
        if ((goto 940) || (!c(paramT1, paramT2, i2))) {
          break;
        }
        if (Yt.b(paramT1, l1) == Yt.b(paramT2, l1)) {
          break label943;
        }
        break;
      case 13: 
        if (!c(paramT1, paramT2, i2)) {
          break;
        }
        if (Yt.a(paramT1, l1) == Yt.a(paramT2, l1)) {
          break label943;
        }
      case 12: 
        if ((goto 940) || (!c(paramT1, paramT2, i2))) {
          break;
        }
        if (Yt.a(paramT1, l1) == Yt.a(paramT2, l1)) {
          break label943;
        }
        break;
      case 11: 
        if (!c(paramT1, paramT2, i2)) {
          break;
        }
        if (Yt.a(paramT1, l1) == Yt.a(paramT2, l1)) {
          break label943;
        }
      case 10: 
        if ((goto 940) || (!c(paramT1, paramT2, i2))) {
          break;
        }
        if (Bt.a(Yt.f(paramT1, l1), Yt.f(paramT2, l1))) {
          break label943;
        }
        break;
      case 9: 
        if (!c(paramT1, paramT2, i2)) {
          break;
        }
        if (Bt.a(Yt.f(paramT1, l1), Yt.f(paramT2, l1))) {
          break label943;
        }
      case 8: 
        if ((goto 940) || (!c(paramT1, paramT2, i2))) {
          break;
        }
        if (Bt.a(Yt.f(paramT1, l1), Yt.f(paramT2, l1))) {
          break label943;
        }
        break;
      case 7: 
        if (!c(paramT1, paramT2, i2)) {
          break;
        }
        if (Yt.c(paramT1, l1) == Yt.c(paramT2, l1)) {
          break label943;
        }
      case 6: 
        if ((goto 940) || (!c(paramT1, paramT2, i2))) {
          break;
        }
        if (Yt.a(paramT1, l1) == Yt.a(paramT2, l1)) {
          break label943;
        }
        break;
      case 5: 
        if (!c(paramT1, paramT2, i2)) {
          break;
        }
        if (Yt.b(paramT1, l1) == Yt.b(paramT2, l1)) {
          break label943;
        }
      case 4: 
        if ((goto 940) || (!c(paramT1, paramT2, i2))) {
          break;
        }
        if (Yt.a(paramT1, l1) == Yt.a(paramT2, l1)) {
          break label943;
        }
        break;
      case 3: 
        if (!c(paramT1, paramT2, i2)) {
          break;
        }
        if (Yt.b(paramT1, l1) == Yt.b(paramT2, l1)) {
          break label943;
        }
      case 2: 
        if ((goto 940) || (!c(paramT1, paramT2, i2))) {
          break;
        }
        if (Yt.b(paramT1, l1) == Yt.b(paramT2, l1)) {
          break label943;
        }
        break;
      case 1: 
        if (!c(paramT1, paramT2, i2)) {
          break;
        }
        if (Yt.a(paramT1, l1) == Yt.a(paramT2, l1)) {
          break label943;
        }
        break;
      }
      if ((!c(paramT1, paramT2, i2)) || (Yt.b(paramT1, l1) != Yt.b(paramT2, l1))) {
        bool = false;
      }
      label943:
      if (!bool) {
        return false;
      }
    }
    if (!this.q.c(paramT1).equals(this.q.c(paramT2))) {
      return false;
    }
    if (this.h) {
      return this.r.a(paramT1).equals(this.r.a(paramT2));
    }
    return true;
  }
  
  public final int b(T paramT)
  {
    int i1 = this.b.length;
    int i2 = 0;
    for (int i3 = 0; i2 < i1; i3 = i6)
    {
      int i4 = d(i2);
      int i5 = this.b[i2];
      long l1 = 0xFFFFF & i4;
      i6 = 37;
      Object localObject;
      boolean bool;
      float f1;
      switch ((i4 & 0xFF00000) >>> 20)
      {
      default: 
        i6 = i3;
        break;
      case 68: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        break;
      case 67: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        break;
      case 66: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        break;
      case 65: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        break;
      case 64: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        break;
      case 63: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        break;
      case 62: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        break;
      case 61: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        break;
      case 60: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        localObject = Yt.f(paramT, l1);
        i6 = i3 * 53;
        break;
      case 59: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        break;
      case 58: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        i6 = i3 * 53;
        bool = f(paramT, l1);
        break;
      case 57: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        break;
      case 56: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        break;
      case 55: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        i6 = i3 * 53;
        i3 = d(paramT, l1);
        break;
      case 54: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        break;
      case 53: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        i6 = i3 * 53;
        l1 = e(paramT, l1);
        break;
      case 52: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        i6 = i3 * 53;
        f1 = c(paramT, l1);
        break;
      case 51: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label985;
        }
        i6 = i3 * 53;
        d1 = b(paramT, l1);
        break;
      case 17: 
        localObject = Yt.f(paramT, l1);
        if (localObject == null) {}
        break;
      case 10: 
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
      case 28: 
      case 29: 
      case 30: 
      case 31: 
      case 32: 
      case 33: 
      case 34: 
      case 35: 
      case 36: 
      case 37: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 43: 
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
      case 50: 
        i6 = i3 * 53;
        localObject = Yt.f(paramT, l1);
        i3 = localObject.hashCode();
        break;
      case 9: 
        localObject = Yt.f(paramT, l1);
        if (localObject != null) {
          i6 = localObject.hashCode();
        }
        i6 = i3 * 53 + i6;
        break;
      case 8: 
        i6 = i3 * 53;
        i3 = ((String)Yt.f(paramT, l1)).hashCode();
        break;
      case 7: 
        i6 = i3 * 53;
        bool = Yt.c(paramT, l1);
        i3 = Gs.a(bool);
        break;
      case 4: 
      case 6: 
      case 11: 
      case 12: 
      case 13: 
      case 15: 
        i6 = i3 * 53;
        i3 = Yt.a(paramT, l1);
        break;
      case 2: 
      case 3: 
      case 5: 
      case 14: 
      case 16: 
        i6 = i3 * 53;
        l1 = Yt.b(paramT, l1);
        break;
      case 1: 
        i6 = i3 * 53;
        f1 = Yt.d(paramT, l1);
        i3 = Float.floatToIntBits(f1);
        break;
      }
      i6 = i3 * 53;
      double d1 = Yt.e(paramT, l1);
      l1 = Double.doubleToLongBits(d1);
      i3 = Gs.a(l1);
      i6 += i3;
      label985:
      i2 += 4;
    }
    i3 = i3 * 53 + this.q.c(paramT).hashCode();
    int i6 = i3;
    if (this.h) {
      i6 = i3 * 53 + this.r.a(paramT).hashCode();
    }
    return i6;
  }
  
  /* Error */
  public final void b(T paramT1, T paramT2)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnull +740 -> 741
    //   4: iconst_0
    //   5: istore_3
    //   6: iload_3
    //   7: aload_0
    //   8: getfield 55	mt:b	[I
    //   11: arraylength
    //   12: if_icmpge +696 -> 708
    //   15: aload_0
    //   16: iload_3
    //   17: invokespecial 380	mt:d	(I)I
    //   20: istore 4
    //   22: ldc 122
    //   24: iload 4
    //   26: iand
    //   27: i2l
    //   28: lstore 5
    //   30: aload_0
    //   31: getfield 55	mt:b	[I
    //   34: iload_3
    //   35: iaload
    //   36: istore 7
    //   38: iload 4
    //   40: ldc_w 351
    //   43: iand
    //   44: bipush 20
    //   46: iushr
    //   47: tableswitch	default:+289->336, 0:+628->675, 1:+604->651, 2:+580->627, 3:+568->615, 4:+544->591, 5:+532->579, 6:+520->567, 7:+496->543, 8:+472->519, 9:+462->509, 10:+450->497, 11:+438->485, 12:+426->473, 13:+414->461, 14:+402->449, 15:+390->437, 16:+378->425, 17:+462->509, 18:+364->411, 19:+364->411, 20:+364->411, 21:+364->411, 22:+364->411, 23:+364->411, 24:+364->411, 25:+364->411, 26:+364->411, 27:+364->411, 28:+364->411, 29:+364->411, 30:+364->411, 31:+364->411, 32:+364->411, 33:+364->411, 34:+364->411, 35:+364->411, 36:+364->411, 37:+364->411, 38:+364->411, 39:+364->411, 40:+364->411, 41:+364->411, 42:+364->411, 43:+364->411, 44:+364->411, 45:+364->411, 46:+364->411, 47:+364->411, 48:+364->411, 49:+364->411, 50:+350->397, 51:+316->363, 52:+316->363, 53:+316->363, 54:+316->363, 55:+316->363, 56:+316->363, 57:+316->363, 58:+316->363, 59:+316->363, 60:+306->353, 61:+292->339, 62:+292->339, 63:+292->339, 64:+292->339, 65:+292->339, 66:+292->339, 67:+292->339, 68:+306->353
    //   336: goto +366 -> 702
    //   339: aload_0
    //   340: aload_2
    //   341: iload 7
    //   343: iload_3
    //   344: invokespecial 579	mt:a	(Ljava/lang/Object;II)Z
    //   347: ifeq +355 -> 702
    //   350: goto +24 -> 374
    //   353: aload_0
    //   354: aload_1
    //   355: aload_2
    //   356: iload_3
    //   357: invokespecial 768	mt:b	(Ljava/lang/Object;Ljava/lang/Object;I)V
    //   360: goto +342 -> 702
    //   363: aload_0
    //   364: aload_2
    //   365: iload 7
    //   367: iload_3
    //   368: invokespecial 579	mt:a	(Ljava/lang/Object;II)Z
    //   371: ifeq +331 -> 702
    //   374: aload_1
    //   375: lload 5
    //   377: aload_2
    //   378: lload 5
    //   380: invokestatic 382	Yt:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   383: invokestatic 528	Yt:a	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   386: aload_0
    //   387: aload_1
    //   388: iload 7
    //   390: iload_3
    //   391: invokespecial 581	mt:b	(Ljava/lang/Object;II)V
    //   394: goto +308 -> 702
    //   397: aload_0
    //   398: getfield 96	mt:s	Ldt;
    //   401: aload_1
    //   402: aload_2
    //   403: lload 5
    //   405: invokestatic 771	Bt:a	(Ldt;Ljava/lang/Object;Ljava/lang/Object;J)V
    //   408: goto +294 -> 702
    //   411: aload_0
    //   412: getfield 88	mt:p	LUs;
    //   415: aload_1
    //   416: aload_2
    //   417: lload 5
    //   419: invokevirtual 776	Us:a	(Ljava/lang/Object;Ljava/lang/Object;J)V
    //   422: goto +280 -> 702
    //   425: aload_0
    //   426: aload_2
    //   427: iload_3
    //   428: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   431: ifeq +271 -> 702
    //   434: goto +202 -> 636
    //   437: aload_0
    //   438: aload_2
    //   439: iload_3
    //   440: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   443: ifeq +259 -> 702
    //   446: goto +36 -> 482
    //   449: aload_0
    //   450: aload_2
    //   451: iload_3
    //   452: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   455: ifeq +247 -> 702
    //   458: goto +178 -> 636
    //   461: aload_0
    //   462: aload_2
    //   463: iload_3
    //   464: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   467: ifeq +235 -> 702
    //   470: goto +12 -> 482
    //   473: aload_0
    //   474: aload_2
    //   475: iload_3
    //   476: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   479: ifeq +223 -> 702
    //   482: goto +118 -> 600
    //   485: aload_0
    //   486: aload_2
    //   487: iload_3
    //   488: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   491: ifeq +211 -> 702
    //   494: goto +106 -> 600
    //   497: aload_0
    //   498: aload_2
    //   499: iload_3
    //   500: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   503: ifeq +199 -> 702
    //   506: goto +22 -> 528
    //   509: aload_0
    //   510: aload_1
    //   511: aload_2
    //   512: iload_3
    //   513: invokespecial 778	mt:a	(Ljava/lang/Object;Ljava/lang/Object;I)V
    //   516: goto +186 -> 702
    //   519: aload_0
    //   520: aload_2
    //   521: iload_3
    //   522: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   525: ifeq +177 -> 702
    //   528: aload_1
    //   529: lload 5
    //   531: aload_2
    //   532: lload 5
    //   534: invokestatic 382	Yt:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   537: invokestatic 528	Yt:a	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   540: goto +156 -> 696
    //   543: aload_0
    //   544: aload_2
    //   545: iload_3
    //   546: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   549: ifeq +153 -> 702
    //   552: aload_1
    //   553: lload 5
    //   555: aload_2
    //   556: lload 5
    //   558: invokestatic 551	Yt:c	(Ljava/lang/Object;J)Z
    //   561: invokestatic 364	Yt:a	(Ljava/lang/Object;JZ)V
    //   564: goto +132 -> 696
    //   567: aload_0
    //   568: aload_2
    //   569: iload_3
    //   570: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   573: ifeq +129 -> 702
    //   576: goto +24 -> 600
    //   579: aload_0
    //   580: aload_2
    //   581: iload_3
    //   582: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   585: ifeq +117 -> 702
    //   588: goto +48 -> 636
    //   591: aload_0
    //   592: aload_2
    //   593: iload_3
    //   594: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   597: ifeq +105 -> 702
    //   600: aload_1
    //   601: lload 5
    //   603: aload_2
    //   604: lload 5
    //   606: invokestatic 542	Yt:a	(Ljava/lang/Object;J)I
    //   609: invokestatic 574	Yt:a	(Ljava/lang/Object;JI)V
    //   612: goto +84 -> 696
    //   615: aload_0
    //   616: aload_2
    //   617: iload_3
    //   618: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   621: ifeq +81 -> 702
    //   624: goto +12 -> 636
    //   627: aload_0
    //   628: aload_2
    //   629: iload_3
    //   630: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   633: ifeq +69 -> 702
    //   636: aload_1
    //   637: lload 5
    //   639: aload_2
    //   640: lload 5
    //   642: invokestatic 540	Yt:b	(Ljava/lang/Object;J)J
    //   645: invokestatic 780	Yt:a	(Ljava/lang/Object;JJ)V
    //   648: goto +48 -> 696
    //   651: aload_0
    //   652: aload_2
    //   653: iload_3
    //   654: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   657: ifeq +45 -> 702
    //   660: aload_1
    //   661: lload 5
    //   663: aload_2
    //   664: lload 5
    //   666: invokestatic 554	Yt:d	(Ljava/lang/Object;J)F
    //   669: invokestatic 367	Yt:a	(Ljava/lang/Object;JF)V
    //   672: goto +24 -> 696
    //   675: aload_0
    //   676: aload_2
    //   677: iload_3
    //   678: invokespecial 526	mt:a	(Ljava/lang/Object;I)Z
    //   681: ifeq +21 -> 702
    //   684: aload_1
    //   685: lload 5
    //   687: aload_2
    //   688: lload 5
    //   690: invokestatic 557	Yt:e	(Ljava/lang/Object;J)D
    //   693: invokestatic 370	Yt:a	(Ljava/lang/Object;JD)V
    //   696: aload_0
    //   697: aload_1
    //   698: iload_3
    //   699: invokespecial 531	mt:b	(Ljava/lang/Object;I)V
    //   702: iinc 3 4
    //   705: goto -699 -> 6
    //   708: aload_0
    //   709: getfield 69	mt:j	Z
    //   712: ifne +28 -> 740
    //   715: aload_0
    //   716: getfield 90	mt:q	LRt;
    //   719: aload_1
    //   720: aload_2
    //   721: invokestatic 783	Bt:a	(LRt;Ljava/lang/Object;Ljava/lang/Object;)V
    //   724: aload_0
    //   725: getfield 76	mt:h	Z
    //   728: ifeq +12 -> 740
    //   731: aload_0
    //   732: getfield 92	mt:r	Lrs;
    //   735: aload_1
    //   736: aload_2
    //   737: invokestatic 786	Bt:a	(Lrs;Ljava/lang/Object;Ljava/lang/Object;)V
    //   740: return
    //   741: new 788	java/lang/NullPointerException
    //   744: dup
    //   745: invokespecial 789	java/lang/NullPointerException:<init>	()V
    //   748: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	749	0	this	mt
    //   0	749	1	paramT1	T
    //   0	749	2	paramT2	T
    //   5	698	3	i1	int
    //   20	24	4	i2	int
    //   28	661	5	l1	long
    //   36	353	7	i3	int
  }
  
  public final int c(T paramT)
  {
    int i3;
    int i5;
    long l1;
    Object localObject1;
    Object localObject2;
    if (this.j)
    {
      localUnsafe = a;
      i1 = 0;
      for (i2 = 0; i1 < this.b.length; i2 = i4)
      {
        i3 = d(i1);
        i4 = (i3 & 0xFF00000) >>> 20;
        i5 = this.b[i1];
        l1 = i3 & 0xFFFFF;
        if ((i4 >= zs.J.a()) && (i4 <= zs.W.a())) {
          i3 = this.b[(i1 + 2)] & 0xFFFFF;
        } else {
          i3 = 0;
        }
        switch (i4)
        {
        default: 
          i4 = i2;
          break;
        case 68: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          break;
        case 67: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          l1 = e(paramT, l1);
          break;
        case 66: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          i4 = d(paramT, l1);
          break;
        case 65: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          break;
        case 64: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          break;
        case 63: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          i4 = d(paramT, l1);
          break;
        case 62: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          i4 = d(paramT, l1);
          break;
        case 61: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          break;
        case 60: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          break;
        case 59: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          localObject1 = Yt.f(paramT, l1);
          localObject2 = localObject1;
          if ((localObject1 instanceof _r)) {
            localObject2 = localObject1;
          }
          break;
        case 58: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          break;
        case 57: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          break;
        case 56: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          break;
        case 55: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          i4 = d(paramT, l1);
          break;
        case 54: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          l1 = e(paramT, l1);
          break;
        case 53: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          l1 = e(paramT, l1);
          break;
        case 52: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          break;
        case 51: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2256;
          }
          break;
        case 50: 
          i4 = this.s.a(i5, Yt.f(paramT, l1), b(i1));
          break;
        case 49: 
          i4 = Bt.b(i5, a(paramT, l1), a(i1));
          break;
        case 48: 
          i6 = Bt.c((List)localUnsafe.getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2256;
          }
          i4 = i6;
          if (this.k) {
            i4 = i6;
          }
          break;
        case 47: 
          i6 = Bt.g((List)localUnsafe.getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2256;
          }
          i4 = i6;
          if (this.k) {
            i4 = i6;
          }
          break;
        case 46: 
          i6 = Bt.i((List)localUnsafe.getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2256;
          }
          i4 = i6;
          if (this.k) {
            i4 = i6;
          }
          break;
        case 45: 
          i6 = Bt.h((List)localUnsafe.getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2256;
          }
          i4 = i6;
          if (this.k) {
            i4 = i6;
          }
          break;
        case 44: 
          i6 = Bt.d((List)localUnsafe.getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2256;
          }
          i4 = i6;
          if (this.k) {
            i4 = i6;
          }
          break;
        case 43: 
          i6 = Bt.f((List)localUnsafe.getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2256;
          }
          i4 = i6;
          if (this.k) {
            i4 = i6;
          }
          break;
        case 42: 
          i6 = Bt.j((List)localUnsafe.getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2256;
          }
          i4 = i6;
          if (this.k) {
            i4 = i6;
          }
          break;
        case 41: 
          i6 = Bt.h((List)localUnsafe.getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2256;
          }
          i4 = i6;
          if (this.k) {
            i4 = i6;
          }
          break;
        case 40: 
          i6 = Bt.i((List)localUnsafe.getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2256;
          }
          i4 = i6;
          if (this.k) {
            i4 = i6;
          }
          break;
        case 39: 
          i6 = Bt.e((List)localUnsafe.getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2256;
          }
          i4 = i6;
          if (this.k) {
            i4 = i6;
          }
          break;
        case 38: 
          i6 = Bt.b((List)localUnsafe.getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2256;
          }
          i4 = i6;
          if (this.k) {
            i4 = i6;
          }
          break;
        case 37: 
          i6 = Bt.a((List)localUnsafe.getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2256;
          }
          i4 = i6;
          if (this.k) {
            i4 = i6;
          }
          break;
        case 36: 
          i6 = Bt.h((List)localUnsafe.getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2256;
          }
          i4 = i6;
          if (this.k) {
            i4 = i6;
          }
          break;
        case 35: 
          i6 = Bt.i((List)localUnsafe.getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2256;
          }
          i4 = i6;
          if (this.k)
          {
            i4 = i6;
            localUnsafe.putInt(paramT, i3, i4);
          }
          i4 = ls.e(i5) + ls.g(i4) + i4;
          break;
        case 34: 
          i4 = Bt.c(i5, a(paramT, l1), false);
          break;
        case 33: 
          i4 = Bt.g(i5, a(paramT, l1), false);
          break;
        case 30: 
          i4 = Bt.d(i5, a(paramT, l1), false);
          break;
        case 29: 
          i4 = Bt.f(i5, a(paramT, l1), false);
          break;
        case 28: 
          i4 = Bt.b(i5, a(paramT, l1));
          break;
        case 27: 
          i4 = Bt.a(i5, a(paramT, l1), a(i1));
          break;
        case 26: 
          i4 = Bt.a(i5, a(paramT, l1));
          break;
        case 25: 
          i4 = Bt.j(i5, a(paramT, l1), false);
          break;
        case 22: 
          i4 = Bt.e(i5, a(paramT, l1), false);
          break;
        case 21: 
          i4 = Bt.b(i5, a(paramT, l1), false);
          break;
        case 20: 
          i4 = Bt.a(i5, a(paramT, l1), false);
          break;
        case 19: 
        case 24: 
        case 31: 
          i4 = Bt.h(i5, a(paramT, l1), false);
          break;
        case 18: 
        case 23: 
        case 32: 
          i4 = Bt.i(i5, a(paramT, l1), false);
        }
        for (;;)
        {
          i4 = i2 + i4;
          break;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = ls.c(i5, (it)Yt.f(paramT, l1), a(i1));
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          l1 = Yt.b(paramT, l1);
          i4 = ls.f(i5, l1);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = Yt.a(paramT, l1);
          i4 = ls.h(i5, i4);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = ls.h(i5, 0L);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = ls.j(i5, 0);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = Yt.a(paramT, l1);
          i4 = ls.k(i5, i4);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = Yt.a(paramT, l1);
          i4 = ls.g(i5, i4);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          for (localObject2 = Yt.f(paramT, l1);; localObject2 = localObject1)
          {
            i4 = ls.c(i5, (_r)localObject2);
            break;
            i4 = i2;
            if (!a(paramT, i1)) {
              break label2256;
            }
            i4 = Bt.a(i5, Yt.f(paramT, l1), a(i1));
            break;
            i4 = i2;
            if (!a(paramT, i1)) {
              break label2256;
            }
            localObject1 = Yt.f(paramT, l1);
            localObject2 = localObject1;
            if (!(localObject1 instanceof _r)) {
              break label2022;
            }
          }
          label2022:
          i4 = ls.b(i5, (String)localObject2);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = ls.b(i5, true);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = ls.i(i5, 0);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = ls.g(i5, 0L);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = Yt.a(paramT, l1);
          i4 = ls.f(i5, i4);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          l1 = Yt.b(paramT, l1);
          i4 = ls.e(i5, l1);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          l1 = Yt.b(paramT, l1);
          i4 = ls.d(i5, l1);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = ls.b(i5, 0.0F);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = ls.b(i5, 0.0D);
        }
        label2256:
        i1 += 4;
      }
      return i2 + a(this.q, paramT);
    }
    Unsafe localUnsafe = a;
    int i6 = 0;
    int i2 = 0;
    int i1 = -1;
    for (int i4 = 0; i6 < this.b.length; i4 = i5)
    {
      int i7 = d(i6);
      localObject2 = this.b;
      int i8 = localObject2[i6];
      int i9 = (i7 & 0xFF00000) >>> 20;
      int i10;
      if (i9 <= 17)
      {
        i3 = localObject2[(i6 + 2)];
        i5 = i3 & 0xFFFFF;
        i10 = 1 << (i3 >>> 20);
        if (i5 != i1)
        {
          i4 = localUnsafe.getInt(paramT, i5);
          i1 = i5;
        }
        i5 = i4;
      }
      else
      {
        if ((this.k) && (i9 >= zs.J.a()) && (i9 <= zs.W.a())) {
          i3 = this.b[(i6 + 2)] & 0xFFFFF;
        } else {
          i3 = 0;
        }
        i10 = 0;
        i5 = i4;
      }
      l1 = i7 & 0xFFFFF;
      switch (i9)
      {
      default: 
        i4 = i2;
        break;
      case 68: 
        i4 = i2;
        if (!a(paramT, i8, i6)) {}
        break;
      case 67: 
        i4 = i2;
        if (a(paramT, i8, i6)) {
          l1 = e(paramT, l1);
        }
        break;
      case 66: 
        i4 = i2;
        if (a(paramT, i8, i6)) {
          i4 = d(paramT, l1);
        }
        break;
      case 65: 
        i4 = i2;
        if (!a(paramT, i8, i6)) {}
        break;
      case 64: 
        i4 = i2;
        if (!a(paramT, i8, i6)) {}
        break;
      case 63: 
        i4 = i2;
        if (a(paramT, i8, i6)) {
          i4 = d(paramT, l1);
        }
        break;
      case 62: 
        i4 = i2;
        if (a(paramT, i8, i6)) {
          i4 = d(paramT, l1);
        }
        break;
      case 61: 
        i4 = i2;
        if (!a(paramT, i8, i6)) {}
        break;
      case 60: 
        i4 = i2;
        if (!a(paramT, i8, i6)) {}
        break;
      case 59: 
        i4 = i2;
        if (a(paramT, i8, i6))
        {
          localObject1 = localUnsafe.getObject(paramT, l1);
          localObject2 = localObject1;
          if (!(localObject1 instanceof _r)) {
            break label4515;
          }
          localObject2 = localObject1;
        }
        break;
      case 58: 
        i4 = i2;
        if (!a(paramT, i8, i6)) {}
        break;
      case 57: 
        i4 = i2;
        if (a(paramT, i8, i6)) {
          i4 = ls.i(i8, 0);
        }
        break;
      case 56: 
        i4 = i2;
        if (a(paramT, i8, i6)) {
          i4 = ls.g(i8, 0L);
        }
        break;
      case 55: 
        i4 = i2;
        if (a(paramT, i8, i6)) {
          i4 = ls.f(i8, d(paramT, l1));
        }
        break;
      case 54: 
        i4 = i2;
        if (a(paramT, i8, i6)) {
          i4 = ls.e(i8, e(paramT, l1));
        }
        break;
      case 53: 
        i4 = i2;
        if (a(paramT, i8, i6)) {
          i4 = ls.d(i8, e(paramT, l1));
        }
        break;
      case 52: 
        i4 = i2;
        if (a(paramT, i8, i6)) {
          i4 = ls.b(i8, 0.0F);
        }
        break;
      case 51: 
        i4 = i2;
        if (a(paramT, i8, i6)) {
          i4 = ls.b(i8, 0.0D);
        }
        break;
      case 50: 
        i4 = this.s.a(i8, localUnsafe.getObject(paramT, l1), b(i6));
        break;
      case 49: 
        i4 = Bt.b(i8, (List)localUnsafe.getObject(paramT, l1), a(i6));
        break;
      case 48: 
        i10 = Bt.c((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i10 > 0)
        {
          i4 = i10;
          if (this.k) {
            i4 = i10;
          }
        }
        break;
      case 47: 
        i10 = Bt.g((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i10 > 0)
        {
          i4 = i10;
          if (this.k) {
            i4 = i10;
          }
        }
        break;
      case 46: 
        i10 = Bt.i((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i10 > 0)
        {
          i4 = i10;
          if (this.k) {
            i4 = i10;
          }
        }
        break;
      case 45: 
        i10 = Bt.h((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i10 > 0)
        {
          i4 = i10;
          if (this.k) {
            i4 = i10;
          }
        }
        break;
      case 44: 
        i10 = Bt.d((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i10 > 0)
        {
          i4 = i10;
          if (this.k) {
            i4 = i10;
          }
        }
        break;
      case 43: 
        i10 = Bt.f((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i10 > 0)
        {
          i4 = i10;
          if (this.k) {
            i4 = i10;
          }
        }
        break;
      case 42: 
        i10 = Bt.j((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i10 > 0)
        {
          i4 = i10;
          if (this.k) {
            i4 = i10;
          }
        }
        break;
      case 41: 
        i10 = Bt.h((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i10 > 0)
        {
          i4 = i10;
          if (this.k) {
            i4 = i10;
          }
        }
        break;
      case 40: 
        i10 = Bt.i((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i10 > 0)
        {
          i4 = i10;
          if (this.k) {
            i4 = i10;
          }
        }
        break;
      case 39: 
        i10 = Bt.e((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i10 > 0)
        {
          i4 = i10;
          if (this.k) {
            i4 = i10;
          }
        }
        break;
      case 38: 
        i10 = Bt.b((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i10 > 0)
        {
          i4 = i10;
          if (this.k) {
            i4 = i10;
          }
        }
        break;
      case 37: 
        i10 = Bt.a((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i10 > 0)
        {
          i4 = i10;
          if (this.k) {
            i4 = i10;
          }
        }
        break;
      case 36: 
        i10 = Bt.h((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i10 > 0)
        {
          i4 = i10;
          if (this.k) {
            i4 = i10;
          }
        }
        break;
      case 35: 
        i10 = Bt.i((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i10 > 0)
        {
          i4 = i10;
          if (this.k)
          {
            i4 = i10;
            localUnsafe.putInt(paramT, i3, i4);
          }
          i4 = ls.e(i8) + ls.g(i4) + i4;
        }
        break;
      case 34: 
        i4 = Bt.c(i8, (List)localUnsafe.getObject(paramT, l1), false);
        break;
      case 33: 
        i4 = Bt.g(i8, (List)localUnsafe.getObject(paramT, l1), false);
        break;
      case 30: 
        i4 = Bt.d(i8, (List)localUnsafe.getObject(paramT, l1), false);
        break;
      case 29: 
        i4 = Bt.f(i8, (List)localUnsafe.getObject(paramT, l1), false);
        break;
      case 28: 
        i4 = Bt.b(i8, (List)localUnsafe.getObject(paramT, l1));
        break;
      case 27: 
        i4 = Bt.a(i8, (List)localUnsafe.getObject(paramT, l1), a(i6));
        break;
      case 26: 
        i4 = Bt.a(i8, (List)localUnsafe.getObject(paramT, l1));
        break;
      case 25: 
        i4 = Bt.j(i8, (List)localUnsafe.getObject(paramT, l1), false);
        break;
      case 22: 
        i4 = Bt.e(i8, (List)localUnsafe.getObject(paramT, l1), false);
        break;
      case 21: 
        i4 = Bt.b(i8, (List)localUnsafe.getObject(paramT, l1), false);
        break;
      case 20: 
        i4 = Bt.a(i8, (List)localUnsafe.getObject(paramT, l1), false);
        break;
      case 19: 
      case 24: 
      case 31: 
        i4 = Bt.h(i8, (List)localUnsafe.getObject(paramT, l1), false);
        break;
      case 18: 
      case 23: 
      case 32: 
        i4 = Bt.i(i8, (List)localUnsafe.getObject(paramT, l1), false);
        i4 = i2 + i4;
      }
      for (;;)
      {
        label4178:
        break label4748;
        i4 = i2;
        if ((i5 & i10) != 0)
        {
          i4 = ls.c(i8, (it)localUnsafe.getObject(paramT, l1), a(i6));
          break;
          i4 = i2;
          if ((i5 & i10) != 0)
          {
            l1 = localUnsafe.getLong(paramT, l1);
            i4 = ls.f(i8, l1);
            break;
            i4 = i2;
            if ((i5 & i10) != 0)
            {
              i4 = localUnsafe.getInt(paramT, l1);
              i4 = ls.h(i8, i4);
              break;
              i4 = i2;
              if ((i5 & i10) != 0)
              {
                i4 = ls.h(i8, 0L);
                break;
                i4 = i2;
                if ((i5 & i10) != 0)
                {
                  i4 = ls.j(i8, 0);
                  i4 = i2 + i4;
                  continue;
                  i4 = i2;
                  if ((i5 & i10) != 0)
                  {
                    i4 = localUnsafe.getInt(paramT, l1);
                    i4 = ls.k(i8, i4);
                    break;
                    i4 = i2;
                    if ((i5 & i10) != 0)
                    {
                      i4 = localUnsafe.getInt(paramT, l1);
                      i4 = ls.g(i8, i4);
                      break;
                      i4 = i2;
                      if ((i5 & i10) != 0)
                      {
                        for (localObject2 = localUnsafe.getObject(paramT, l1);; localObject2 = localObject1)
                        {
                          i4 = ls.c(i8, (_r)localObject2);
                          break;
                          i4 = i2;
                          if ((i5 & i10) == 0) {
                            break label4178;
                          }
                          i4 = Bt.a(i8, localUnsafe.getObject(paramT, l1), a(i6));
                          break;
                          i4 = i2;
                          if ((i5 & i10) == 0) {
                            break label4178;
                          }
                          localObject1 = localUnsafe.getObject(paramT, l1);
                          localObject2 = localObject1;
                          if (!(localObject1 instanceof _r)) {
                            break label4515;
                          }
                        }
                        label4515:
                        i4 = ls.b(i8, (String)localObject2);
                        break;
                        i4 = i2;
                        if ((i5 & i10) != 0)
                        {
                          i4 = ls.b(i8, true);
                          break;
                          i4 = i2;
                          if ((i5 & i10) != 0)
                          {
                            i4 = i2 + ls.i(i8, 0);
                            continue;
                            if ((i5 & i10) != 0)
                            {
                              i4 = ls.g(i8, 0L);
                            }
                            else
                            {
                              i4 = i2;
                              break label4696;
                              i4 = i2;
                              if ((i5 & i10) == 0) {
                                break label4696;
                              }
                              i4 = ls.f(i8, localUnsafe.getInt(paramT, l1));
                              break label4689;
                              i4 = i2;
                              if ((i5 & i10) == 0) {
                                break label4696;
                              }
                              i4 = ls.e(i8, localUnsafe.getLong(paramT, l1));
                              break label4689;
                              i4 = i2;
                              if ((i5 & i10) == 0) {
                                break label4696;
                              }
                              i4 = ls.d(i8, localUnsafe.getLong(paramT, l1));
                            }
                            label4689:
                            i4 = i2 + i4;
                            for (;;)
                            {
                              label4696:
                              break;
                              i4 = i2;
                              if ((i5 & i10) != 0) {
                                i4 = i2 + ls.b(i8, 0.0F);
                              }
                            }
                            for (;;)
                            {
                              break;
                              i4 = i2;
                              if ((i5 & i10) != 0) {
                                i4 = i2 + ls.b(i8, 0.0D);
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      label4748:
      i6 += 4;
      i2 = i4;
    }
    i2 += a(this.q, paramT);
    i4 = i2;
    if (this.h) {
      i4 = i2 + this.r.a(paramT).g();
    }
    return i4;
  }
  
  public final boolean f(T paramT)
  {
    int[] arrayOfInt = this.l;
    if ((arrayOfInt != null) && (arrayOfInt.length != 0))
    {
      int i1 = arrayOfInt.length;
      int i2 = 0;
      int i3 = -1;
      int i4 = 0;
      while (i2 < i1)
      {
        int i5 = arrayOfInt[i2];
        int i6 = f(i5);
        int i7 = d(i6);
        int i8;
        if (!this.j)
        {
          i8 = this.b[(i6 + 2)];
          i9 = i8 & 0xFFFFF;
          i8 = 1 << (i8 >>> 20);
          if (i9 != i3)
          {
            i4 = a.getInt(paramT, i9);
            i3 = i9;
          }
        }
        else
        {
          i8 = 0;
        }
        if ((0x10000000 & i7) != 0) {
          i9 = 1;
        } else {
          i9 = 0;
        }
        if ((i9 != 0) && (!a(paramT, i6, i4, i8))) {
          return false;
        }
        int i9 = (0xFF00000 & i7) >>> 20;
        if ((i9 != 9) && (i9 != 17))
        {
          if (i9 != 27) {
            if ((i9 != 60) && (i9 != 68))
            {
              if (i9 != 49)
              {
                if ((i9 != 50) || (this.s.c(Yt.f(paramT, i7 & 0xFFFFF)).isEmpty())) {
                  break label424;
                }
                paramT = b(i6);
                this.s.e(paramT);
                throw null;
              }
            }
            else
            {
              if ((!a(paramT, i5, i6)) || (a(paramT, i7, a(i6)))) {
                break label424;
              }
              return false;
            }
          }
          List localList = (List)Yt.f(paramT, i7 & 0xFFFFF);
          if (!localList.isEmpty())
          {
            zt localzt = a(i6);
            for (i8 = 0; i8 < localList.size(); i8++) {
              if (!localzt.f(localList.get(i8)))
              {
                i8 = 0;
                break label386;
              }
            }
          }
          i8 = 1;
          label386:
          if (i8 == 0) {
            return false;
          }
        }
        else if ((a(paramT, i6, i4, i8)) && (!a(paramT, i7, a(i6))))
        {
          return false;
        }
        label424:
        i2++;
      }
      return (!this.h) || (this.r.a(paramT).d());
    }
    return true;
  }
  
  public final void g(T paramT)
  {
    int[] arrayOfInt = this.m;
    int i1 = 0;
    int i2;
    int i3;
    if (arrayOfInt != null)
    {
      i2 = arrayOfInt.length;
      for (i3 = 0; i3 < i2; i3++)
      {
        long l1 = d(arrayOfInt[i3]) & 0xFFFFF;
        localObject = Yt.f(paramT, l1);
        if (localObject != null)
        {
          this.s.d(localObject);
          Yt.a(paramT, l1, localObject);
        }
      }
    }
    Object localObject = this.n;
    if (localObject != null)
    {
      i2 = localObject.length;
      for (i3 = i1; i3 < i2; i3++)
      {
        i1 = localObject[i3];
        this.p.a(paramT, i1);
      }
    }
    this.q.a(paramT);
    if (this.h) {
      this.r.c(paramT);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */