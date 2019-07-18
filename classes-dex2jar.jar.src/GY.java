import java.io.IOException;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

final class gy<T>
  implements ry<T>
{
  private static final int[] a = new int[0];
  private static final Unsafe b = Qy.d();
  private final int[] c;
  private final Object[] d;
  private final int e;
  private final int f;
  private final by g;
  private final boolean h;
  private final boolean i;
  private final boolean j;
  private final boolean k;
  private final int[] l;
  private final int m;
  private final int n;
  private final jy o;
  private final Mx p;
  private final Ky<?, ?> q;
  private final ix<?> r;
  private final Xx s;
  
  private gy(int[] paramArrayOfInt1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, by paramby, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt2, int paramInt3, int paramInt4, jy paramjy, Mx paramMx, Ky<?, ?> paramKy, ix<?> paramix, Xx paramXx)
  {
    this.c = paramArrayOfInt1;
    this.d = paramArrayOfObject;
    this.e = paramInt1;
    this.f = paramInt2;
    this.i = (paramby instanceof sx);
    this.j = paramBoolean1;
    if ((paramix != null) && (paramix.a(paramby))) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    this.h = paramBoolean1;
    this.k = false;
    this.l = paramArrayOfInt2;
    this.m = paramInt3;
    this.n = paramInt4;
    this.o = paramjy;
    this.p = paramMx;
    this.q = paramKy;
    this.r = paramix;
    this.g = paramby;
    this.s = paramXx;
  }
  
  private static <UT, UB> int a(Ky<UT, UB> paramKy, T paramT)
  {
    return paramKy.b(paramKy.c(paramT));
  }
  
  static <T> gy<T> a(Class<T> paramClass, _x param_x, jy paramjy, Mx paramMx, Ky<?, ?> paramKy, ix<?> paramix, Xx paramXx)
  {
    if ((param_x instanceof qy))
    {
      qy localqy = (qy)param_x;
      int i1 = localqy.a();
      int i2 = sx.d.j;
      int i3 = 0;
      boolean bool;
      if (i1 == i2) {
        bool = true;
      } else {
        bool = false;
      }
      param_x = localqy.d();
      int i4 = param_x.length();
      int i5 = param_x.charAt(0);
      if (i5 >= 55296)
      {
        i6 = i5 & 0x1FFF;
        i7 = 1;
        i1 = 13;
        for (;;)
        {
          i2 = i7 + 1;
          i7 = param_x.charAt(i7);
          if (i7 < 55296) {
            break;
          }
          i6 |= (i7 & 0x1FFF) << i1;
          i1 += 13;
          i7 = i2;
        }
        i5 = i7 << i1 | i6;
      }
      else
      {
        i2 = 1;
      }
      int i6 = i2 + 1;
      i2 = param_x.charAt(i2);
      int i8;
      if (i2 >= 55296)
      {
        i1 = i2 & 0x1FFF;
        i2 = 13;
        for (;;)
        {
          i8 = i6 + 1;
          i6 = param_x.charAt(i6);
          if (i6 < 55296) {
            break;
          }
          i1 |= (i6 & 0x1FFF) << i2;
          i2 += 13;
          i6 = i8;
        }
        i2 = i1 | i6 << i2;
      }
      else
      {
        i8 = i6;
      }
      int i11;
      if (i2 == 0)
      {
        paramClass = a;
        i6 = 0;
        i9 = 0;
        i2 = 0;
        i10 = 0;
        i7 = 0;
        i11 = 0;
        i1 = i3;
        i3 = i6;
      }
      else
      {
        i1 = i8 + 1;
        i2 = param_x.charAt(i8);
        if (i2 >= 55296)
        {
          i6 = i2 & 0x1FFF;
          i2 = 13;
          for (i7 = i1;; i7 = i1)
          {
            i1 = i7 + 1;
            i7 = param_x.charAt(i7);
            if (i7 < 55296) {
              break;
            }
            i6 |= (i7 & 0x1FFF) << i2;
            i2 += 13;
          }
          i2 = i7 << i2 | i6;
          i6 = i1;
        }
        else
        {
          i6 = i1;
        }
        i1 = i6 + 1;
        i8 = param_x.charAt(i6);
        if (i8 >= 55296)
        {
          i7 = i8 & 0x1FFF;
          i6 = 13;
          for (i3 = i1;; i3 = i1)
          {
            i1 = i3 + 1;
            i3 = param_x.charAt(i3);
            if (i3 < 55296) {
              break;
            }
            i7 |= (i3 & 0x1FFF) << i6;
            i6 += 13;
          }
          i8 = i7 | i3 << i6;
        }
        i6 = i1 + 1;
        i1 = param_x.charAt(i1);
        if (i1 >= 55296)
        {
          i7 = i1 & 0x1FFF;
          i1 = 13;
          for (i3 = i6;; i3 = i6)
          {
            i6 = i3 + 1;
            i3 = param_x.charAt(i3);
            if (i3 < 55296) {
              break;
            }
            i7 |= (i3 & 0x1FFF) << i1;
            i1 += 13;
          }
          i1 = i3 << i1 | i7;
        }
        i7 = i6 + 1;
        i6 = param_x.charAt(i6);
        if (i6 >= 55296)
        {
          i3 = i6 & 0x1FFF;
          i6 = 13;
          for (i9 = i7;; i9 = i7)
          {
            i7 = i9 + 1;
            i9 = param_x.charAt(i9);
            if (i9 < 55296) {
              break;
            }
            i3 |= (i9 & 0x1FFF) << i6;
            i6 += 13;
          }
          i6 = i9 << i6 | i3;
        }
        i3 = i7 + 1;
        i9 = param_x.charAt(i7);
        i10 = i3;
        i7 = i9;
        if (i9 >= 55296)
        {
          i10 = i9 & 0x1FFF;
          i9 = 13;
          for (;;)
          {
            i7 = i3 + 1;
            i3 = param_x.charAt(i3);
            if (i3 < 55296) {
              break;
            }
            i10 |= (i3 & 0x1FFF) << i9;
            i9 += 13;
            i3 = i7;
          }
          i3 = i3 << i9 | i10;
          i10 = i7;
          i7 = i3;
        }
        i9 = i10 + 1;
        i12 = param_x.charAt(i10);
        i3 = i12;
        i10 = i9;
        if (i12 >= 55296)
        {
          i10 = i12 & 0x1FFF;
          i3 = 13;
          for (i12 = i9;; i12 = i9)
          {
            i9 = i12 + 1;
            i12 = param_x.charAt(i12);
            if (i12 < 55296) {
              break;
            }
            i10 |= (i12 & 0x1FFF) << i3;
            i3 += 13;
          }
          i3 = i10 | i12 << i3;
          i10 = i9;
        }
        i11 = i10 + 1;
        i12 = param_x.charAt(i10);
        if (i12 >= 55296)
        {
          i10 = 13;
          i12 &= 0x1FFF;
          for (;;)
          {
            i9 = i11 + 1;
            i11 = param_x.charAt(i11);
            if (i11 < 55296) {
              break;
            }
            i12 |= (i11 & 0x1FFF) << i10;
            i10 += 13;
            i11 = i9;
          }
          i10 = i12 | i11 << i10;
        }
        else
        {
          i9 = i11;
          i10 = i12;
        }
        i11 = i9 + 1;
        i13 = param_x.charAt(i9);
        i12 = i13;
        i9 = i11;
        if (i13 >= 55296)
        {
          i9 = 13;
          i12 = i13 & 0x1FFF;
          i13 = i11;
          i11 = i12;
          for (;;)
          {
            i12 = i13 + 1;
            i13 = param_x.charAt(i13);
            if (i13 < 55296) {
              break;
            }
            i11 |= (i13 & 0x1FFF) << i9;
            i9 += 13;
            i13 = i12;
          }
          i11 |= i13 << i9;
          i9 = i12;
          i12 = i11;
        }
        paramClass = new int[i12 + i3 + i10];
        i13 = (i2 << 1) + i8;
        i11 = i2;
        i10 = i6;
        i8 = i9;
        i2 = i13;
        i9 = i1;
        i1 = i12;
      }
      Unsafe localUnsafe = b;
      Object[] arrayOfObject1 = localqy.e();
      Class localClass = localqy.c().getClass();
      i6 = i2;
      int[] arrayOfInt = new int[i7 * 3];
      Object[] arrayOfObject2 = new Object[i7 << 1];
      int i14 = i1 + i3;
      i2 = i1;
      int i7 = i14;
      i3 = 0;
      int i15 = 0;
      int i12 = i10;
      int i10 = i9;
      int i9 = i3;
      int i13 = i1;
      while (i8 < i4)
      {
        int i16 = i8 + 1;
        i3 = param_x.charAt(i8);
        if (i3 >= 55296)
        {
          i1 = 13;
          i8 = i3 & 0x1FFF;
          for (;;)
          {
            i3 = i16 + 1;
            i16 = param_x.charAt(i16);
            if (i16 < 55296) {
              break;
            }
            i8 |= (i16 & 0x1FFF) << i1;
            i1 += 13;
            i16 = i3;
          }
          i16 = i8 | i16 << i1;
          i1 = i3;
        }
        else
        {
          i1 = i16;
          i16 = i3;
        }
        int i17 = i1 + 1;
        i3 = param_x.charAt(i1);
        if (i3 >= 55296)
        {
          i1 = 13;
          i8 = i3 & 0x1FFF;
          for (;;)
          {
            i3 = i17 + 1;
            i17 = param_x.charAt(i17);
            if (i17 < 55296) {
              break;
            }
            i8 |= (i17 & 0x1FFF) << i1;
            i1 += 13;
            i17 = i3;
          }
          i17 = i8 | i17 << i1;
          i8 = i3;
        }
        else
        {
          i8 = i17;
          i17 = i3;
        }
        int i18 = i17 & 0xFF;
        i3 = i9;
        if ((i17 & 0x400) != 0)
        {
          paramClass[i9] = i15;
          i3 = i9 + 1;
        }
        int i19;
        Object localObject;
        if (i18 >= 51)
        {
          i9 = i8 + 1;
          i19 = param_x.charAt(i8);
          i8 = i19;
          i1 = i9;
          if (i19 >= 55296)
          {
            i1 = i19 & 0x1FFF;
            i8 = 13;
            i19 = i9;
            i9 = i1;
            for (;;)
            {
              i1 = i19 + 1;
              i19 = param_x.charAt(i19);
              if (i19 < 55296) {
                break;
              }
              i9 |= (i19 & 0x1FFF) << i8;
              i8 += 13;
              i19 = i1;
            }
            i8 = i9 | i19 << i8;
          }
          i19 = i18 - 51;
          if ((i19 != 9) && (i19 != 17))
          {
            i9 = i6;
            if (i19 == 12)
            {
              i9 = i6;
              if ((i5 & 0x1) == 1)
              {
                arrayOfObject2[((i15 / 3 << 1) + 1)] = arrayOfObject1[i6];
                i9 = i6 + 1;
              }
            }
            i6 = i9;
          }
          else
          {
            arrayOfObject2[((i15 / 3 << 1) + 1)] = arrayOfObject1[i6];
            i6++;
          }
          i9 = i8 << 1;
          localObject = arrayOfObject1[i9];
          if ((localObject instanceof Field))
          {
            localObject = (Field)localObject;
          }
          else
          {
            localObject = a(localClass, (String)localObject);
            arrayOfObject1[i9] = localObject;
          }
          i19 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          i9++;
          localObject = arrayOfObject1[i9];
          if ((localObject instanceof Field))
          {
            localObject = (Field)localObject;
          }
          else
          {
            localObject = a(localClass, (String)localObject);
            arrayOfObject1[i9] = localObject;
          }
          i8 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          i9 = 0;
        }
        else
        {
          i9 = i6 + 1;
          localObject = a(localClass, (String)arrayOfObject1[i6]);
          if ((i18 != 9) && (i18 != 17))
          {
            if ((i18 != 27) && (i18 != 49))
            {
              if ((i18 != 12) && (i18 != 30) && (i18 != 44))
              {
                if (i18 == 50)
                {
                  i1 = i2 + 1;
                  paramClass[i2] = i15;
                  i6 = i15 / 3 << 1;
                  i2 = i9 + 1;
                  arrayOfObject2[i6] = arrayOfObject1[i9];
                  if ((i17 & 0x800) != 0)
                  {
                    i9 = i2 + 1;
                    arrayOfObject2[(i6 + 1)] = arrayOfObject1[i2];
                    i6 = i1;
                    i1 = i9;
                    break label2065;
                  }
                  i6 = i1;
                  i1 = i2;
                  break label2065;
                }
                i1 = i9;
                i6 = i2;
                break label2065;
              }
              i1 = i9;
              i6 = i2;
              if ((i5 & 0x1) != 1) {
                break label2065;
              }
              i6 = i15 / 3;
              i1 = i9 + 1;
              arrayOfObject2[((i6 << 1) + 1)] = arrayOfObject1[i9];
            }
            else
            {
              i6 = i15 / 3;
              i1 = i9 + 1;
              arrayOfObject2[((i6 << 1) + 1)] = arrayOfObject1[i9];
            }
            break label2069;
          }
          else
          {
            arrayOfObject2[((i15 / 3 << 1) + 1)] = ((Field)localObject).getType();
            i6 = i2;
            i1 = i9;
          }
          label2065:
          i2 = i6;
          label2069:
          i20 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          if (((i5 & 0x1) == 1) && (i18 <= 17))
          {
            i9 = i8 + 1;
            i19 = param_x.charAt(i8);
            i8 = i19;
            i6 = i9;
            if (i19 >= 55296)
            {
              i8 = i19 & 0x1FFF;
              i6 = 13;
              for (i19 = i9;; i19 = i9)
              {
                i9 = i19 + 1;
                i19 = param_x.charAt(i19);
                if (i19 < 55296) {
                  break;
                }
                i8 |= (i19 & 0x1FFF) << i6;
                i6 += 13;
              }
              i8 |= i19 << i6;
              i6 = i9;
            }
            i9 = (i11 << 1) + i8 / 32;
            localObject = arrayOfObject1[i9];
            if ((localObject instanceof Field))
            {
              localObject = (Field)localObject;
            }
            else
            {
              localObject = a(localClass, (String)localObject);
              arrayOfObject1[i9] = localObject;
            }
            i19 = (int)localUnsafe.objectFieldOffset((Field)localObject);
            i9 = i8 % 32;
            i8 = i19;
          }
          else
          {
            i6 = i8;
            i9 = 0;
            i8 = 0;
          }
          i21 = i1;
          i1 = i7;
          if (i18 >= 18)
          {
            i1 = i7;
            if (i18 <= 49)
            {
              paramClass[i7] = i20;
              i1 = i7 + 1;
            }
          }
          i19 = i6;
          i6 = i21;
          i7 = i1;
          i1 = i19;
          i19 = i20;
        }
        int i21 = i15 + 1;
        arrayOfInt[i15] = i16;
        int i20 = i21 + 1;
        if ((i17 & 0x200) != 0) {
          i15 = 536870912;
        } else {
          i15 = 0;
        }
        if ((i17 & 0x100) != 0) {
          i16 = 268435456;
        } else {
          i16 = 0;
        }
        arrayOfInt[i21] = (i18 << 20 | i16 | i15 | i19);
        i15 = i20 + 1;
        arrayOfInt[i20] = (i9 << 20 | i8);
        i9 = i3;
        i8 = i1;
      }
      return new gy(arrayOfInt, arrayOfObject2, i10, i12, localqy.c(), bool, false, paramClass, i13, i14, paramjy, paramMx, paramKy, paramix, paramXx);
    }
    ((Ey)param_x).a();
    throw null;
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
      Object localObject2 = Arrays.toString((Object[])???);
      ??? = new StringBuilder(String.valueOf(paramString).length() + 40 + String.valueOf(paramClass).length() + String.valueOf(localObject2).length());
      ((StringBuilder)???).append("Field ");
      ((StringBuilder)???).append(paramString);
      ((StringBuilder)???).append(" for ");
      ((StringBuilder)???).append(paramClass);
      ((StringBuilder)???).append(" not found. Known fields are ");
      ((StringBuilder)???).append((String)localObject2);
      throw new RuntimeException(((StringBuilder)???).toString());
    }
  }
  
  private static <E> List<E> a(Object paramObject, long paramLong)
  {
    return (List)Qy.f(paramObject, paramLong);
  }
  
  private final ry a(int paramInt)
  {
    paramInt = paramInt / 3 << 1;
    ry localry = (ry)this.d[paramInt];
    if (localry != null) {
      return localry;
    }
    localry = oy.a().a((Class)this.d[(paramInt + 1)]);
    this.d[paramInt] = localry;
    return localry;
  }
  
  private static void a(int paramInt, Object paramObject, dz paramdz)
    throws IOException
  {
    if ((paramObject instanceof String))
    {
      paramdz.a(paramInt, (String)paramObject);
      return;
    }
    paramdz.a(paramInt, (Ow)paramObject);
  }
  
  private static <UT, UB> void a(Ky<UT, UB> paramKy, T paramT, dz paramdz)
    throws IOException
  {
    paramKy.a(paramKy.c(paramT), paramdz);
  }
  
  private final <K, V> void a(dz paramdz, int paramInt1, Object paramObject, int paramInt2)
    throws IOException
  {
    if (paramObject != null) {
      paramdz.a(paramInt1, this.s.b(b(paramInt2)), this.s.a(paramObject));
    }
  }
  
  private final void a(T paramT1, T paramT2, int paramInt)
  {
    long l1 = c(paramInt) & 0xFFFFF;
    if (!a(paramT2, paramInt)) {
      return;
    }
    Object localObject = Qy.f(paramT1, l1);
    paramT2 = Qy.f(paramT2, l1);
    if ((localObject != null) && (paramT2 != null))
    {
      Qy.a(paramT1, l1, ux.a(localObject, paramT2));
      b(paramT1, paramInt);
      return;
    }
    if (paramT2 != null)
    {
      Qy.a(paramT1, l1, paramT2);
      b(paramT1, paramInt);
    }
  }
  
  private final boolean a(T paramT, int paramInt)
  {
    if (this.j)
    {
      paramInt = c(paramInt);
      long l1 = paramInt & 0xFFFFF;
      switch ((paramInt & 0xFF00000) >>> 20)
      {
      default: 
        throw new IllegalArgumentException();
      case 17: 
        return Qy.f(paramT, l1) != null;
      case 16: 
        return Qy.b(paramT, l1) != 0L;
      case 15: 
        return Qy.a(paramT, l1) != 0;
      case 14: 
        return Qy.b(paramT, l1) != 0L;
      case 13: 
        return Qy.a(paramT, l1) != 0;
      case 12: 
        return Qy.a(paramT, l1) != 0;
      case 11: 
        return Qy.a(paramT, l1) != 0;
      case 10: 
        return !Ow.a.equals(Qy.f(paramT, l1));
      case 9: 
        return Qy.f(paramT, l1) != null;
      case 8: 
        paramT = Qy.f(paramT, l1);
        if ((paramT instanceof String)) {
          return !((String)paramT).isEmpty();
        }
        if ((paramT instanceof Ow)) {
          return !Ow.a.equals(paramT);
        }
        throw new IllegalArgumentException();
      case 7: 
        return Qy.c(paramT, l1);
      case 6: 
        return Qy.a(paramT, l1) != 0;
      case 5: 
        return Qy.b(paramT, l1) != 0L;
      case 4: 
        return Qy.a(paramT, l1) != 0;
      case 3: 
        return Qy.b(paramT, l1) != 0L;
      case 2: 
        return Qy.b(paramT, l1) != 0L;
      case 1: 
        return Qy.d(paramT, l1) != 0.0F;
      }
      return Qy.e(paramT, l1) != 0.0D;
    }
    paramInt = d(paramInt);
    return (Qy.a(paramT, paramInt & 0xFFFFF) & 1 << (paramInt >>> 20)) != 0;
  }
  
  private final boolean a(T paramT, int paramInt1, int paramInt2)
  {
    return Qy.a(paramT, d(paramInt2) & 0xFFFFF) == paramInt1;
  }
  
  private final boolean a(T paramT, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.j) {
      return a(paramT, paramInt1);
    }
    return (paramInt2 & paramInt3) != 0;
  }
  
  private static boolean a(Object paramObject, int paramInt, ry paramry)
  {
    return paramry.c(Qy.f(paramObject, paramInt & 0xFFFFF));
  }
  
  private static <T> double b(T paramT, long paramLong)
  {
    return ((Double)Qy.f(paramT, paramLong)).doubleValue();
  }
  
  private final Object b(int paramInt)
  {
    return this.d[(paramInt / 3 << 1)];
  }
  
  private final void b(T paramT, int paramInt)
  {
    if (this.j) {
      return;
    }
    paramInt = d(paramInt);
    long l1 = paramInt & 0xFFFFF;
    Qy.a(paramT, l1, Qy.a(paramT, l1) | 1 << (paramInt >>> 20));
  }
  
  private final void b(T paramT, int paramInt1, int paramInt2)
  {
    Qy.a(paramT, d(paramInt2) & 0xFFFFF, paramInt1);
  }
  
  private final void b(T paramT, dz paramdz)
    throws IOException
  {
    if (this.h)
    {
      localObject = this.r.a(paramT);
      if (!((lx)localObject).b.isEmpty())
      {
        localObject = (Map.Entry)((lx)localObject).d().next();
        break label44;
      }
    }
    Object localObject = null;
    label44:
    int i1 = this.c.length;
    Unsafe localUnsafe = b;
    int i2 = 0;
    int i3 = -1;
    int i4 = 0;
    while (i2 < i1)
    {
      int i5 = c(i2);
      int[] arrayOfInt = this.c;
      int i6 = arrayOfInt[i2];
      int i7 = (0xFF00000 & i5) >>> 20;
      int i9;
      if ((!this.j) && (i7 <= 17))
      {
        int i8 = arrayOfInt[(i2 + 2)];
        i9 = i8 & 0xFFFFF;
        if (i9 != i3)
        {
          i4 = localUnsafe.getInt(paramT, i9);
          i3 = i9;
        }
        i9 = 1 << (i8 >>> 20);
      }
      else
      {
        i9 = 0;
      }
      if (localObject == null)
      {
        long l1 = i5 & 0xFFFFF;
        switch (i7)
        {
        default: 
          break;
        case 68: 
          if (a(paramT, i6, i2)) {
            paramdz.b(i6, localUnsafe.getObject(paramT, l1), a(i2));
          }
          break;
        case 67: 
          if (a(paramT, i6, i2)) {
            paramdz.a(i6, e(paramT, l1));
          }
          break;
        case 66: 
          if (a(paramT, i6, i2)) {
            paramdz.a(i6, d(paramT, l1));
          }
          break;
        case 65: 
          if (a(paramT, i6, i2)) {
            paramdz.d(i6, e(paramT, l1));
          }
          break;
        case 64: 
          if (a(paramT, i6, i2)) {
            paramdz.g(i6, d(paramT, l1));
          }
          break;
        case 63: 
          if (a(paramT, i6, i2)) {
            paramdz.h(i6, d(paramT, l1));
          }
          break;
        case 62: 
          if (a(paramT, i6, i2)) {
            paramdz.d(i6, d(paramT, l1));
          }
          break;
        case 61: 
          if (a(paramT, i6, i2)) {
            paramdz.a(i6, (Ow)localUnsafe.getObject(paramT, l1));
          }
          break;
        case 60: 
          if (a(paramT, i6, i2)) {
            paramdz.a(i6, localUnsafe.getObject(paramT, l1), a(i2));
          }
          break;
        case 59: 
          if (a(paramT, i6, i2)) {
            a(i6, localUnsafe.getObject(paramT, l1), paramdz);
          }
          break;
        case 58: 
          if (a(paramT, i6, i2)) {
            paramdz.a(i6, f(paramT, l1));
          }
          break;
        case 57: 
          if (a(paramT, i6, i2)) {
            paramdz.f(i6, d(paramT, l1));
          }
          break;
        case 56: 
          if (a(paramT, i6, i2)) {
            paramdz.b(i6, e(paramT, l1));
          }
          break;
        case 55: 
          if (a(paramT, i6, i2)) {
            paramdz.e(i6, d(paramT, l1));
          }
          break;
        case 54: 
          if (a(paramT, i6, i2)) {
            paramdz.c(i6, e(paramT, l1));
          }
          break;
        case 53: 
          if (a(paramT, i6, i2)) {
            paramdz.e(i6, e(paramT, l1));
          }
          break;
        case 52: 
          if (a(paramT, i6, i2)) {
            paramdz.a(i6, c(paramT, l1));
          }
          break;
        case 51: 
          if (a(paramT, i6, i2)) {
            paramdz.a(i6, b(paramT, l1));
          }
          break;
        case 50: 
          a(paramdz, i6, localUnsafe.getObject(paramT, l1), i2);
          break;
        case 49: 
          ty.b(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, a(i2));
          break;
        case 48: 
          ty.e(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, true);
          break;
        case 47: 
          ty.j(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, true);
          break;
        case 46: 
          ty.g(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, true);
          break;
        case 45: 
          ty.l(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, true);
          break;
        case 44: 
          ty.m(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, true);
          break;
        case 43: 
          ty.i(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, true);
          break;
        case 42: 
          ty.n(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, true);
          break;
        case 41: 
          ty.k(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, true);
          break;
        case 40: 
          ty.f(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, true);
          break;
        case 39: 
          ty.h(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, true);
          break;
        case 38: 
          ty.d(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, true);
          break;
        case 37: 
          ty.c(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, true);
          break;
        case 36: 
          ty.b(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, true);
          break;
        case 35: 
          ty.a(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, true);
          break;
        case 34: 
          ty.e(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, false);
          break;
        case 33: 
          ty.j(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, false);
          break;
        case 32: 
          ty.g(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, false);
          break;
        case 31: 
          ty.l(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, false);
          break;
        case 30: 
          ty.m(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, false);
          break;
        case 29: 
          ty.i(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, false);
          break;
        case 28: 
          ty.b(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz);
          break;
        case 27: 
          ty.a(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, a(i2));
          break;
        case 26: 
          ty.a(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz);
          break;
        case 25: 
          ty.n(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, false);
          break;
        case 24: 
          ty.k(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, false);
          break;
        case 23: 
          ty.f(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, false);
          break;
        case 22: 
          ty.h(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, false);
          break;
        case 21: 
          ty.d(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, false);
          break;
        case 20: 
          ty.c(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, false);
          break;
        case 19: 
          ty.b(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, false);
          break;
        case 18: 
          ty.a(this.c[i2], (List)localUnsafe.getObject(paramT, l1), paramdz, false);
          break;
        case 17: 
          if ((i4 & i9) != 0) {
            paramdz.b(i6, localUnsafe.getObject(paramT, l1), a(i2));
          }
          break;
        case 16: 
          if ((i4 & i9) != 0) {
            paramdz.a(i6, localUnsafe.getLong(paramT, l1));
          }
          break;
        case 15: 
          if ((i4 & i9) != 0) {
            paramdz.a(i6, localUnsafe.getInt(paramT, l1));
          }
          break;
        case 14: 
          if ((i4 & i9) != 0) {
            paramdz.d(i6, localUnsafe.getLong(paramT, l1));
          }
          break;
        case 13: 
          if ((i4 & i9) != 0) {
            paramdz.g(i6, localUnsafe.getInt(paramT, l1));
          }
          break;
        case 12: 
          if ((i4 & i9) != 0) {
            paramdz.h(i6, localUnsafe.getInt(paramT, l1));
          }
          break;
        case 11: 
          if ((i4 & i9) != 0) {
            paramdz.d(i6, localUnsafe.getInt(paramT, l1));
          }
          break;
        case 10: 
          if ((i4 & i9) != 0) {
            paramdz.a(i6, (Ow)localUnsafe.getObject(paramT, l1));
          }
          break;
        case 9: 
          if ((i4 & i9) != 0) {
            paramdz.a(i6, localUnsafe.getObject(paramT, l1), a(i2));
          }
          break;
        case 8: 
          if ((i4 & i9) != 0) {
            a(i6, localUnsafe.getObject(paramT, l1), paramdz);
          }
          break;
        case 7: 
          if ((i4 & i9) != 0) {
            paramdz.a(i6, Qy.c(paramT, l1));
          }
          break;
        case 6: 
          if ((i4 & i9) != 0) {
            paramdz.f(i6, localUnsafe.getInt(paramT, l1));
          }
          break;
        case 5: 
          if ((i4 & i9) != 0) {
            paramdz.b(i6, localUnsafe.getLong(paramT, l1));
          }
          break;
        case 4: 
          if ((i4 & i9) != 0) {
            paramdz.e(i6, localUnsafe.getInt(paramT, l1));
          }
          break;
        case 3: 
          if ((i4 & i9) != 0) {
            paramdz.c(i6, localUnsafe.getLong(paramT, l1));
          }
          break;
        case 2: 
          if ((i4 & i9) != 0) {
            paramdz.e(i6, localUnsafe.getLong(paramT, l1));
          }
          break;
        case 1: 
          if ((i4 & i9) != 0) {
            paramdz.a(i6, Qy.d(paramT, l1));
          }
          break;
        case 0: 
          if ((i4 & i9) != 0) {
            paramdz.a(i6, Qy.e(paramT, l1));
          }
          break;
        }
        i2 += 3;
      }
      else
      {
        this.r.a((Map.Entry)localObject);
        throw null;
      }
    }
    if (localObject == null)
    {
      a(this.q, paramT, paramdz);
      return;
    }
    this.r.a(paramdz, (Map.Entry)localObject);
    throw null;
  }
  
  private final void b(T paramT1, T paramT2, int paramInt)
  {
    int i1 = c(paramInt);
    int i2 = this.c[paramInt];
    long l1 = i1 & 0xFFFFF;
    if (!a(paramT2, i2, paramInt)) {
      return;
    }
    Object localObject = Qy.f(paramT1, l1);
    paramT2 = Qy.f(paramT2, l1);
    if ((localObject != null) && (paramT2 != null))
    {
      Qy.a(paramT1, l1, ux.a(localObject, paramT2));
      b(paramT1, i2, paramInt);
      return;
    }
    if (paramT2 != null)
    {
      Qy.a(paramT1, l1, paramT2);
      b(paramT1, i2, paramInt);
    }
  }
  
  private static <T> float c(T paramT, long paramLong)
  {
    return ((Float)Qy.f(paramT, paramLong)).floatValue();
  }
  
  private final int c(int paramInt)
  {
    return this.c[(paramInt + 1)];
  }
  
  private final boolean c(T paramT1, T paramT2, int paramInt)
  {
    return a(paramT1, paramInt) == a(paramT2, paramInt);
  }
  
  private final int d(int paramInt)
  {
    return this.c[(paramInt + 2)];
  }
  
  private static <T> int d(T paramT, long paramLong)
  {
    return ((Integer)Qy.f(paramT, paramLong)).intValue();
  }
  
  private static <T> long e(T paramT, long paramLong)
  {
    return ((Long)Qy.f(paramT, paramLong)).longValue();
  }
  
  private static <T> boolean f(T paramT, long paramLong)
  {
    return ((Boolean)Qy.f(paramT, paramLong)).booleanValue();
  }
  
  public final void a(T paramT, dz paramdz)
    throws IOException
  {
    Object localObject;
    label65:
    int i1;
    int i2;
    int[] arrayOfInt;
    int i3;
    if (paramdz.a() == sx.d.m)
    {
      a(this.q, paramT, paramdz);
      if (this.h)
      {
        localObject = this.r.a(paramT);
        if (!((lx)localObject).b.isEmpty())
        {
          localObject = (Map.Entry)((lx)localObject).a().next();
          break label65;
        }
      }
      localObject = null;
      i1 = this.c.length - 3;
      while (i1 >= 0)
      {
        i2 = c(i1);
        arrayOfInt = this.c;
        i3 = arrayOfInt[i1];
        if (localObject == null)
        {
          switch ((i2 & 0xFF00000) >>> 20)
          {
          default: 
            break;
          case 68: 
            if (a(paramT, i3, i1)) {
              paramdz.b(i3, Qy.f(paramT, i2 & 0xFFFFF), a(i1));
            }
            break;
          case 67: 
            if (a(paramT, i3, i1)) {
              paramdz.a(i3, e(paramT, i2 & 0xFFFFF));
            }
            break;
          case 66: 
            if (a(paramT, i3, i1)) {
              paramdz.a(i3, d(paramT, i2 & 0xFFFFF));
            }
            break;
          case 65: 
            if (a(paramT, i3, i1)) {
              paramdz.d(i3, e(paramT, i2 & 0xFFFFF));
            }
            break;
          case 64: 
            if (a(paramT, i3, i1)) {
              paramdz.g(i3, d(paramT, i2 & 0xFFFFF));
            }
            break;
          case 63: 
            if (a(paramT, i3, i1)) {
              paramdz.h(i3, d(paramT, i2 & 0xFFFFF));
            }
            break;
          case 62: 
            if (a(paramT, i3, i1)) {
              paramdz.d(i3, d(paramT, i2 & 0xFFFFF));
            }
            break;
          case 61: 
            if (a(paramT, i3, i1)) {
              paramdz.a(i3, (Ow)Qy.f(paramT, i2 & 0xFFFFF));
            }
            break;
          case 60: 
            if (a(paramT, i3, i1)) {
              paramdz.a(i3, Qy.f(paramT, i2 & 0xFFFFF), a(i1));
            }
            break;
          case 59: 
            if (a(paramT, i3, i1)) {
              a(i3, Qy.f(paramT, i2 & 0xFFFFF), paramdz);
            }
            break;
          case 58: 
            if (a(paramT, i3, i1)) {
              paramdz.a(i3, f(paramT, i2 & 0xFFFFF));
            }
            break;
          case 57: 
            if (a(paramT, i3, i1)) {
              paramdz.f(i3, d(paramT, i2 & 0xFFFFF));
            }
            break;
          case 56: 
            if (a(paramT, i3, i1)) {
              paramdz.b(i3, e(paramT, i2 & 0xFFFFF));
            }
            break;
          case 55: 
            if (a(paramT, i3, i1)) {
              paramdz.e(i3, d(paramT, i2 & 0xFFFFF));
            }
            break;
          case 54: 
            if (a(paramT, i3, i1)) {
              paramdz.c(i3, e(paramT, i2 & 0xFFFFF));
            }
            break;
          case 53: 
            if (a(paramT, i3, i1)) {
              paramdz.e(i3, e(paramT, i2 & 0xFFFFF));
            }
            break;
          case 52: 
            if (a(paramT, i3, i1)) {
              paramdz.a(i3, c(paramT, i2 & 0xFFFFF));
            }
            break;
          case 51: 
            if (a(paramT, i3, i1)) {
              paramdz.a(i3, b(paramT, i2 & 0xFFFFF));
            }
            break;
          case 50: 
            a(paramdz, i3, Qy.f(paramT, i2 & 0xFFFFF), i1);
            break;
          case 49: 
            ty.b(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, a(i1));
            break;
          case 48: 
            ty.e(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, true);
            break;
          case 47: 
            ty.j(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, true);
            break;
          case 46: 
            ty.g(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, true);
            break;
          case 45: 
            ty.l(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, true);
            break;
          case 44: 
            ty.m(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, true);
            break;
          case 43: 
            ty.i(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, true);
            break;
          case 42: 
            ty.n(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, true);
            break;
          case 41: 
            ty.k(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, true);
            break;
          case 40: 
            ty.f(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, true);
            break;
          case 39: 
            ty.h(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, true);
            break;
          case 38: 
            ty.d(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, true);
            break;
          case 37: 
            ty.c(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, true);
            break;
          case 36: 
            ty.b(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, true);
            break;
          case 35: 
            ty.a(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, true);
            break;
          case 34: 
            ty.e(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, false);
            break;
          case 33: 
            ty.j(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, false);
            break;
          case 32: 
            ty.g(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, false);
            break;
          case 31: 
            ty.l(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, false);
            break;
          case 30: 
            ty.m(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, false);
            break;
          case 29: 
            ty.i(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, false);
            break;
          case 28: 
            ty.b(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz);
            break;
          case 27: 
            ty.a(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, a(i1));
            break;
          case 26: 
            ty.a(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz);
            break;
          case 25: 
            ty.n(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, false);
            break;
          case 24: 
            ty.k(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, false);
            break;
          case 23: 
            ty.f(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, false);
            break;
          case 22: 
            ty.h(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, false);
            break;
          case 21: 
            ty.d(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, false);
            break;
          case 20: 
            ty.c(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, false);
            break;
          case 19: 
            ty.b(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, false);
            break;
          case 18: 
            ty.a(arrayOfInt[i1], (List)Qy.f(paramT, i2 & 0xFFFFF), paramdz, false);
            break;
          case 17: 
            if (a(paramT, i1)) {
              paramdz.b(i3, Qy.f(paramT, i2 & 0xFFFFF), a(i1));
            }
            break;
          case 16: 
            if (a(paramT, i1)) {
              paramdz.a(i3, Qy.b(paramT, i2 & 0xFFFFF));
            }
            break;
          case 15: 
            if (a(paramT, i1)) {
              paramdz.a(i3, Qy.a(paramT, i2 & 0xFFFFF));
            }
            break;
          case 14: 
            if (a(paramT, i1)) {
              paramdz.d(i3, Qy.b(paramT, i2 & 0xFFFFF));
            }
            break;
          case 13: 
            if (a(paramT, i1)) {
              paramdz.g(i3, Qy.a(paramT, i2 & 0xFFFFF));
            }
            break;
          case 12: 
            if (a(paramT, i1)) {
              paramdz.h(i3, Qy.a(paramT, i2 & 0xFFFFF));
            }
            break;
          case 11: 
            if (a(paramT, i1)) {
              paramdz.d(i3, Qy.a(paramT, i2 & 0xFFFFF));
            }
            break;
          case 10: 
            if (a(paramT, i1)) {
              paramdz.a(i3, (Ow)Qy.f(paramT, i2 & 0xFFFFF));
            }
            break;
          case 9: 
            if (a(paramT, i1)) {
              paramdz.a(i3, Qy.f(paramT, i2 & 0xFFFFF), a(i1));
            }
            break;
          case 8: 
            if (a(paramT, i1)) {
              a(i3, Qy.f(paramT, i2 & 0xFFFFF), paramdz);
            }
            break;
          case 7: 
            if (a(paramT, i1)) {
              paramdz.a(i3, Qy.c(paramT, i2 & 0xFFFFF));
            }
            break;
          case 6: 
            if (a(paramT, i1)) {
              paramdz.f(i3, Qy.a(paramT, i2 & 0xFFFFF));
            }
            break;
          case 5: 
            if (a(paramT, i1)) {
              paramdz.b(i3, Qy.b(paramT, i2 & 0xFFFFF));
            }
            break;
          case 4: 
            if (a(paramT, i1)) {
              paramdz.e(i3, Qy.a(paramT, i2 & 0xFFFFF));
            }
            break;
          case 3: 
            if (a(paramT, i1)) {
              paramdz.c(i3, Qy.b(paramT, i2 & 0xFFFFF));
            }
            break;
          case 2: 
            if (a(paramT, i1)) {
              paramdz.e(i3, Qy.b(paramT, i2 & 0xFFFFF));
            }
            break;
          case 1: 
            if (a(paramT, i1)) {
              paramdz.a(i3, Qy.d(paramT, i2 & 0xFFFFF));
            }
            break;
          case 0: 
            if (a(paramT, i1)) {
              paramdz.a(i3, Qy.e(paramT, i2 & 0xFFFFF));
            }
            break;
          }
          i1 -= 3;
        }
        else
        {
          this.r.a((Map.Entry)localObject);
          throw null;
        }
      }
      if (localObject == null) {
        return;
      }
      this.r.a(paramdz, (Map.Entry)localObject);
      throw null;
    }
    if (this.j)
    {
      if (this.h)
      {
        localObject = this.r.a(paramT);
        if (!((lx)localObject).b.isEmpty())
        {
          localObject = (Map.Entry)((lx)localObject).d().next();
          break label2597;
        }
      }
      localObject = null;
      label2597:
      i2 = this.c.length;
      i1 = 0;
      while (i1 < i2)
      {
        int i4 = c(i1);
        arrayOfInt = this.c;
        i3 = arrayOfInt[i1];
        if (localObject == null)
        {
          switch ((i4 & 0xFF00000) >>> 20)
          {
          default: 
            break;
          case 68: 
            if (a(paramT, i3, i1)) {
              paramdz.b(i3, Qy.f(paramT, i4 & 0xFFFFF), a(i1));
            }
            break;
          case 67: 
            if (a(paramT, i3, i1)) {
              paramdz.a(i3, e(paramT, i4 & 0xFFFFF));
            }
            break;
          case 66: 
            if (a(paramT, i3, i1)) {
              paramdz.a(i3, d(paramT, i4 & 0xFFFFF));
            }
            break;
          case 65: 
            if (a(paramT, i3, i1)) {
              paramdz.d(i3, e(paramT, i4 & 0xFFFFF));
            }
            break;
          case 64: 
            if (a(paramT, i3, i1)) {
              paramdz.g(i3, d(paramT, i4 & 0xFFFFF));
            }
            break;
          case 63: 
            if (a(paramT, i3, i1)) {
              paramdz.h(i3, d(paramT, i4 & 0xFFFFF));
            }
            break;
          case 62: 
            if (a(paramT, i3, i1)) {
              paramdz.d(i3, d(paramT, i4 & 0xFFFFF));
            }
            break;
          case 61: 
            if (a(paramT, i3, i1)) {
              paramdz.a(i3, (Ow)Qy.f(paramT, i4 & 0xFFFFF));
            }
            break;
          case 60: 
            if (a(paramT, i3, i1)) {
              paramdz.a(i3, Qy.f(paramT, i4 & 0xFFFFF), a(i1));
            }
            break;
          case 59: 
            if (a(paramT, i3, i1)) {
              a(i3, Qy.f(paramT, i4 & 0xFFFFF), paramdz);
            }
            break;
          case 58: 
            if (a(paramT, i3, i1)) {
              paramdz.a(i3, f(paramT, i4 & 0xFFFFF));
            }
            break;
          case 57: 
            if (a(paramT, i3, i1)) {
              paramdz.f(i3, d(paramT, i4 & 0xFFFFF));
            }
            break;
          case 56: 
            if (a(paramT, i3, i1)) {
              paramdz.b(i3, e(paramT, i4 & 0xFFFFF));
            }
            break;
          case 55: 
            if (a(paramT, i3, i1)) {
              paramdz.e(i3, d(paramT, i4 & 0xFFFFF));
            }
            break;
          case 54: 
            if (a(paramT, i3, i1)) {
              paramdz.c(i3, e(paramT, i4 & 0xFFFFF));
            }
            break;
          case 53: 
            if (a(paramT, i3, i1)) {
              paramdz.e(i3, e(paramT, i4 & 0xFFFFF));
            }
            break;
          case 52: 
            if (a(paramT, i3, i1)) {
              paramdz.a(i3, c(paramT, i4 & 0xFFFFF));
            }
            break;
          case 51: 
            if (a(paramT, i3, i1)) {
              paramdz.a(i3, b(paramT, i4 & 0xFFFFF));
            }
            break;
          case 50: 
            a(paramdz, i3, Qy.f(paramT, i4 & 0xFFFFF), i1);
            break;
          case 49: 
            ty.b(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, a(i1));
            break;
          case 48: 
            ty.e(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, true);
            break;
          case 47: 
            ty.j(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, true);
            break;
          case 46: 
            ty.g(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, true);
            break;
          case 45: 
            ty.l(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, true);
            break;
          case 44: 
            ty.m(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, true);
            break;
          case 43: 
            ty.i(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, true);
            break;
          case 42: 
            ty.n(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, true);
            break;
          case 41: 
            ty.k(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, true);
            break;
          case 40: 
            ty.f(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, true);
            break;
          case 39: 
            ty.h(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, true);
            break;
          case 38: 
            ty.d(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, true);
            break;
          case 37: 
            ty.c(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, true);
            break;
          case 36: 
            ty.b(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, true);
            break;
          case 35: 
            ty.a(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, true);
            break;
          case 34: 
            ty.e(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, false);
            break;
          case 33: 
            ty.j(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, false);
            break;
          case 32: 
            ty.g(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, false);
            break;
          case 31: 
            ty.l(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, false);
            break;
          case 30: 
            ty.m(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, false);
            break;
          case 29: 
            ty.i(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, false);
            break;
          case 28: 
            ty.b(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz);
            break;
          case 27: 
            ty.a(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, a(i1));
            break;
          case 26: 
            ty.a(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz);
            break;
          case 25: 
            ty.n(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, false);
            break;
          case 24: 
            ty.k(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, false);
            break;
          case 23: 
            ty.f(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, false);
            break;
          case 22: 
            ty.h(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, false);
            break;
          case 21: 
            ty.d(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, false);
            break;
          case 20: 
            ty.c(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, false);
            break;
          case 19: 
            ty.b(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, false);
            break;
          case 18: 
            ty.a(arrayOfInt[i1], (List)Qy.f(paramT, i4 & 0xFFFFF), paramdz, false);
            break;
          case 17: 
            if (a(paramT, i1)) {
              paramdz.b(i3, Qy.f(paramT, i4 & 0xFFFFF), a(i1));
            }
            break;
          case 16: 
            if (a(paramT, i1)) {
              paramdz.a(i3, Qy.b(paramT, i4 & 0xFFFFF));
            }
            break;
          case 15: 
            if (a(paramT, i1)) {
              paramdz.a(i3, Qy.a(paramT, i4 & 0xFFFFF));
            }
            break;
          case 14: 
            if (a(paramT, i1)) {
              paramdz.d(i3, Qy.b(paramT, i4 & 0xFFFFF));
            }
            break;
          case 13: 
            if (a(paramT, i1)) {
              paramdz.g(i3, Qy.a(paramT, i4 & 0xFFFFF));
            }
            break;
          case 12: 
            if (a(paramT, i1)) {
              paramdz.h(i3, Qy.a(paramT, i4 & 0xFFFFF));
            }
            break;
          case 11: 
            if (a(paramT, i1)) {
              paramdz.d(i3, Qy.a(paramT, i4 & 0xFFFFF));
            }
            break;
          case 10: 
            if (a(paramT, i1)) {
              paramdz.a(i3, (Ow)Qy.f(paramT, i4 & 0xFFFFF));
            }
            break;
          case 9: 
            if (a(paramT, i1)) {
              paramdz.a(i3, Qy.f(paramT, i4 & 0xFFFFF), a(i1));
            }
            break;
          case 8: 
            if (a(paramT, i1)) {
              a(i3, Qy.f(paramT, i4 & 0xFFFFF), paramdz);
            }
            break;
          case 7: 
            if (a(paramT, i1)) {
              paramdz.a(i3, Qy.c(paramT, i4 & 0xFFFFF));
            }
            break;
          case 6: 
            if (a(paramT, i1)) {
              paramdz.f(i3, Qy.a(paramT, i4 & 0xFFFFF));
            }
            break;
          case 5: 
            if (a(paramT, i1)) {
              paramdz.b(i3, Qy.b(paramT, i4 & 0xFFFFF));
            }
            break;
          case 4: 
            if (a(paramT, i1)) {
              paramdz.e(i3, Qy.a(paramT, i4 & 0xFFFFF));
            }
            break;
          case 3: 
            if (a(paramT, i1)) {
              paramdz.c(i3, Qy.b(paramT, i4 & 0xFFFFF));
            }
            break;
          case 2: 
            if (a(paramT, i1)) {
              paramdz.e(i3, Qy.b(paramT, i4 & 0xFFFFF));
            }
            break;
          case 1: 
            if (a(paramT, i1)) {
              paramdz.a(i3, Qy.d(paramT, i4 & 0xFFFFF));
            }
            break;
          case 0: 
            if (a(paramT, i1)) {
              paramdz.a(i3, Qy.e(paramT, i4 & 0xFFFFF));
            }
            break;
          }
          i1 += 3;
        }
        else
        {
          this.r.a((Map.Entry)localObject);
          throw null;
        }
      }
      if (localObject == null)
      {
        a(this.q, paramT, paramdz);
        return;
      }
      this.r.a(paramdz, (Map.Entry)localObject);
      throw null;
    }
    b(paramT, paramdz);
  }
  
  /* Error */
  public final boolean a(T paramT1, T paramT2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 57	gy:c	[I
    //   4: arraylength
    //   5: istore_3
    //   6: iconst_0
    //   7: istore 4
    //   9: iconst_1
    //   10: istore 5
    //   12: iload 4
    //   14: iload_3
    //   15: if_icmpge +978 -> 993
    //   18: aload_0
    //   19: iload 4
    //   21: invokespecial 271	gy:c	(I)I
    //   24: istore 6
    //   26: iload 6
    //   28: ldc_w 272
    //   31: iand
    //   32: i2l
    //   33: lstore 7
    //   35: iload 6
    //   37: ldc_w 288
    //   40: iand
    //   41: bipush 20
    //   43: iushr
    //   44: tableswitch	default:+292->336, 0:+900->944, 1:+865->909, 2:+835->879, 3:+805->849, 4:+776->820, 5:+746->790, 6:+717->761, 7:+688->732, 8:+656->700, 9:+624->668, 10:+592->636, 11:+563->607, 12:+534->578, 13:+505->549, 14:+475->519, 15:+446->490, 16:+416->460, 17:+384->428, 18:+364->408, 19:+364->408, 20:+364->408, 21:+364->408, 22:+364->408, 23:+364->408, 24:+364->408, 25:+364->408, 26:+364->408, 27:+364->408, 28:+364->408, 29:+364->408, 30:+364->408, 31:+364->408, 32:+364->408, 33:+364->408, 34:+364->408, 35:+364->408, 36:+364->408, 37:+364->408, 38:+364->408, 39:+364->408, 40:+364->408, 41:+364->408, 42:+364->408, 43:+364->408, 44:+364->408, 45:+364->408, 46:+364->408, 47:+364->408, 48:+364->408, 49:+364->408, 50:+344->388, 51:+295->339, 52:+295->339, 53:+295->339, 54:+295->339, 55:+295->339, 56:+295->339, 57:+295->339, 58:+295->339, 59:+295->339, 60:+295->339, 61:+295->339, 62:+295->339, 63:+295->339, 64:+295->339, 65:+295->339, 66:+295->339, 67:+295->339, 68:+295->339
    //   336: goto +644 -> 980
    //   339: aload_0
    //   340: iload 4
    //   342: invokespecial 316	gy:d	(I)I
    //   345: ldc_w 272
    //   348: iand
    //   349: i2l
    //   350: lstore 9
    //   352: aload_1
    //   353: lload 9
    //   355: invokestatic 297	Qy:a	(Ljava/lang/Object;J)I
    //   358: aload_2
    //   359: lload 9
    //   361: invokestatic 297	Qy:a	(Ljava/lang/Object;J)I
    //   364: if_icmpne +613 -> 977
    //   367: aload_1
    //   368: lload 7
    //   370: invokestatic 220	Qy:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   373: aload_2
    //   374: lload 7
    //   376: invokestatic 220	Qy:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   379: invokestatic 513	ty:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   382: ifne +598 -> 980
    //   385: goto +592 -> 977
    //   388: aload_1
    //   389: lload 7
    //   391: invokestatic 220	Qy:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   394: aload_2
    //   395: lload 7
    //   397: invokestatic 220	Qy:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   400: invokestatic 513	ty:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   403: istore 5
    //   405: goto +575 -> 980
    //   408: aload_1
    //   409: lload 7
    //   411: invokestatic 220	Qy:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   414: aload_2
    //   415: lload 7
    //   417: invokestatic 220	Qy:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   420: invokestatic 513	ty:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   423: istore 5
    //   425: goto +555 -> 980
    //   428: aload_0
    //   429: aload_1
    //   430: aload_2
    //   431: iload 4
    //   433: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   436: ifeq +541 -> 977
    //   439: aload_1
    //   440: lload 7
    //   442: invokestatic 220	Qy:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   445: aload_2
    //   446: lload 7
    //   448: invokestatic 220	Qy:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   451: invokestatic 513	ty:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   454: ifne +526 -> 980
    //   457: goto +520 -> 977
    //   460: aload_0
    //   461: aload_1
    //   462: aload_2
    //   463: iload 4
    //   465: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   468: ifeq +509 -> 977
    //   471: aload_1
    //   472: lload 7
    //   474: invokestatic 294	Qy:b	(Ljava/lang/Object;J)J
    //   477: aload_2
    //   478: lload 7
    //   480: invokestatic 294	Qy:b	(Ljava/lang/Object;J)J
    //   483: lcmp
    //   484: ifeq +496 -> 980
    //   487: goto +490 -> 977
    //   490: aload_0
    //   491: aload_1
    //   492: aload_2
    //   493: iload 4
    //   495: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   498: ifeq +479 -> 977
    //   501: aload_1
    //   502: lload 7
    //   504: invokestatic 297	Qy:a	(Ljava/lang/Object;J)I
    //   507: aload_2
    //   508: lload 7
    //   510: invokestatic 297	Qy:a	(Ljava/lang/Object;J)I
    //   513: if_icmpeq +467 -> 980
    //   516: goto +461 -> 977
    //   519: aload_0
    //   520: aload_1
    //   521: aload_2
    //   522: iload 4
    //   524: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   527: ifeq +450 -> 977
    //   530: aload_1
    //   531: lload 7
    //   533: invokestatic 294	Qy:b	(Ljava/lang/Object;J)J
    //   536: aload_2
    //   537: lload 7
    //   539: invokestatic 294	Qy:b	(Ljava/lang/Object;J)J
    //   542: lcmp
    //   543: ifeq +437 -> 980
    //   546: goto +431 -> 977
    //   549: aload_0
    //   550: aload_1
    //   551: aload_2
    //   552: iload 4
    //   554: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   557: ifeq +420 -> 977
    //   560: aload_1
    //   561: lload 7
    //   563: invokestatic 297	Qy:a	(Ljava/lang/Object;J)I
    //   566: aload_2
    //   567: lload 7
    //   569: invokestatic 297	Qy:a	(Ljava/lang/Object;J)I
    //   572: if_icmpeq +408 -> 980
    //   575: goto +402 -> 977
    //   578: aload_0
    //   579: aload_1
    //   580: aload_2
    //   581: iload 4
    //   583: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   586: ifeq +391 -> 977
    //   589: aload_1
    //   590: lload 7
    //   592: invokestatic 297	Qy:a	(Ljava/lang/Object;J)I
    //   595: aload_2
    //   596: lload 7
    //   598: invokestatic 297	Qy:a	(Ljava/lang/Object;J)I
    //   601: if_icmpeq +379 -> 980
    //   604: goto +373 -> 977
    //   607: aload_0
    //   608: aload_1
    //   609: aload_2
    //   610: iload 4
    //   612: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   615: ifeq +362 -> 977
    //   618: aload_1
    //   619: lload 7
    //   621: invokestatic 297	Qy:a	(Ljava/lang/Object;J)I
    //   624: aload_2
    //   625: lload 7
    //   627: invokestatic 297	Qy:a	(Ljava/lang/Object;J)I
    //   630: if_icmpeq +350 -> 980
    //   633: goto +344 -> 977
    //   636: aload_0
    //   637: aload_1
    //   638: aload_2
    //   639: iload 4
    //   641: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   644: ifeq +333 -> 977
    //   647: aload_1
    //   648: lload 7
    //   650: invokestatic 220	Qy:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   653: aload_2
    //   654: lload 7
    //   656: invokestatic 220	Qy:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   659: invokestatic 513	ty:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   662: ifne +318 -> 980
    //   665: goto +312 -> 977
    //   668: aload_0
    //   669: aload_1
    //   670: aload_2
    //   671: iload 4
    //   673: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   676: ifeq +301 -> 977
    //   679: aload_1
    //   680: lload 7
    //   682: invokestatic 220	Qy:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   685: aload_2
    //   686: lload 7
    //   688: invokestatic 220	Qy:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   691: invokestatic 513	ty:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   694: ifne +286 -> 980
    //   697: goto +280 -> 977
    //   700: aload_0
    //   701: aload_1
    //   702: aload_2
    //   703: iload 4
    //   705: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   708: ifeq +269 -> 977
    //   711: aload_1
    //   712: lload 7
    //   714: invokestatic 220	Qy:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   717: aload_2
    //   718: lload 7
    //   720: invokestatic 220	Qy:f	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   723: invokestatic 513	ty:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   726: ifne +254 -> 980
    //   729: goto +248 -> 977
    //   732: aload_0
    //   733: aload_1
    //   734: aload_2
    //   735: iload 4
    //   737: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   740: ifeq +237 -> 977
    //   743: aload_1
    //   744: lload 7
    //   746: invokestatic 308	Qy:c	(Ljava/lang/Object;J)Z
    //   749: aload_2
    //   750: lload 7
    //   752: invokestatic 308	Qy:c	(Ljava/lang/Object;J)Z
    //   755: if_icmpeq +225 -> 980
    //   758: goto +219 -> 977
    //   761: aload_0
    //   762: aload_1
    //   763: aload_2
    //   764: iload 4
    //   766: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   769: ifeq +208 -> 977
    //   772: aload_1
    //   773: lload 7
    //   775: invokestatic 297	Qy:a	(Ljava/lang/Object;J)I
    //   778: aload_2
    //   779: lload 7
    //   781: invokestatic 297	Qy:a	(Ljava/lang/Object;J)I
    //   784: if_icmpeq +196 -> 980
    //   787: goto +190 -> 977
    //   790: aload_0
    //   791: aload_1
    //   792: aload_2
    //   793: iload 4
    //   795: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   798: ifeq +179 -> 977
    //   801: aload_1
    //   802: lload 7
    //   804: invokestatic 294	Qy:b	(Ljava/lang/Object;J)J
    //   807: aload_2
    //   808: lload 7
    //   810: invokestatic 294	Qy:b	(Ljava/lang/Object;J)J
    //   813: lcmp
    //   814: ifeq +166 -> 980
    //   817: goto +160 -> 977
    //   820: aload_0
    //   821: aload_1
    //   822: aload_2
    //   823: iload 4
    //   825: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   828: ifeq +149 -> 977
    //   831: aload_1
    //   832: lload 7
    //   834: invokestatic 297	Qy:a	(Ljava/lang/Object;J)I
    //   837: aload_2
    //   838: lload 7
    //   840: invokestatic 297	Qy:a	(Ljava/lang/Object;J)I
    //   843: if_icmpeq +137 -> 980
    //   846: goto +131 -> 977
    //   849: aload_0
    //   850: aload_1
    //   851: aload_2
    //   852: iload 4
    //   854: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   857: ifeq +120 -> 977
    //   860: aload_1
    //   861: lload 7
    //   863: invokestatic 294	Qy:b	(Ljava/lang/Object;J)J
    //   866: aload_2
    //   867: lload 7
    //   869: invokestatic 294	Qy:b	(Ljava/lang/Object;J)J
    //   872: lcmp
    //   873: ifeq +107 -> 980
    //   876: goto +101 -> 977
    //   879: aload_0
    //   880: aload_1
    //   881: aload_2
    //   882: iload 4
    //   884: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   887: ifeq +90 -> 977
    //   890: aload_1
    //   891: lload 7
    //   893: invokestatic 294	Qy:b	(Ljava/lang/Object;J)J
    //   896: aload_2
    //   897: lload 7
    //   899: invokestatic 294	Qy:b	(Ljava/lang/Object;J)J
    //   902: lcmp
    //   903: ifeq +77 -> 980
    //   906: goto +71 -> 977
    //   909: aload_0
    //   910: aload_1
    //   911: aload_2
    //   912: iload 4
    //   914: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   917: ifeq +60 -> 977
    //   920: aload_1
    //   921: lload 7
    //   923: invokestatic 311	Qy:d	(Ljava/lang/Object;J)F
    //   926: invokestatic 519	java/lang/Float:floatToIntBits	(F)I
    //   929: aload_2
    //   930: lload 7
    //   932: invokestatic 311	Qy:d	(Ljava/lang/Object;J)F
    //   935: invokestatic 519	java/lang/Float:floatToIntBits	(F)I
    //   938: if_icmpeq +42 -> 980
    //   941: goto +36 -> 977
    //   944: aload_0
    //   945: aload_1
    //   946: aload_2
    //   947: iload 4
    //   949: invokespecial 515	gy:c	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   952: ifeq +25 -> 977
    //   955: aload_1
    //   956: lload 7
    //   958: invokestatic 314	Qy:e	(Ljava/lang/Object;J)D
    //   961: invokestatic 523	java/lang/Double:doubleToLongBits	(D)J
    //   964: aload_2
    //   965: lload 7
    //   967: invokestatic 314	Qy:e	(Ljava/lang/Object;J)D
    //   970: invokestatic 523	java/lang/Double:doubleToLongBits	(D)J
    //   973: lcmp
    //   974: ifeq +6 -> 980
    //   977: iconst_0
    //   978: istore 5
    //   980: iload 5
    //   982: ifne +5 -> 987
    //   985: iconst_0
    //   986: ireturn
    //   987: iinc 4 3
    //   990: goto -981 -> 9
    //   993: aload_0
    //   994: getfield 90	gy:q	LKy;
    //   997: aload_1
    //   998: invokevirtual 104	Ky:c	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1001: aload_0
    //   1002: getfield 90	gy:q	LKy;
    //   1005: aload_2
    //   1006: invokevirtual 104	Ky:c	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1009: invokevirtual 524	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1012: ifne +5 -> 1017
    //   1015: iconst_0
    //   1016: ireturn
    //   1017: aload_0
    //   1018: getfield 76	gy:h	Z
    //   1021: ifeq +23 -> 1044
    //   1024: aload_0
    //   1025: getfield 92	gy:r	Lix;
    //   1028: aload_1
    //   1029: invokevirtual 340	ix:a	(Ljava/lang/Object;)Llx;
    //   1032: aload_0
    //   1033: getfield 92	gy:r	Lix;
    //   1036: aload_2
    //   1037: invokevirtual 340	ix:a	(Ljava/lang/Object;)Llx;
    //   1040: invokevirtual 525	lx:equals	(Ljava/lang/Object;)Z
    //   1043: ireturn
    //   1044: iconst_1
    //   1045: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1046	0	this	gy
    //   0	1046	1	paramT1	T
    //   0	1046	2	paramT2	T
    //   5	11	3	i1	int
    //   7	981	4	i2	int
    //   10	971	5	bool	boolean
    //   24	17	6	i3	int
    //   33	933	7	l1	long
    //   350	10	9	l2	long
  }
  
  public final int b(T paramT)
  {
    int i1 = this.c.length;
    int i2 = 0;
    for (int i3 = 0; i2 < i1; i3 = i6)
    {
      int i4 = c(i2);
      int i5 = this.c[i2];
      long l1 = 0xFFFFF & i4;
      i6 = 37;
      Object localObject;
      switch ((i4 & 0xFF00000) >>> 20)
      {
      default: 
        i6 = i3;
        break;
      case 68: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        localObject = Qy.f(paramT, l1);
        i6 = i3 * 53;
        i3 = localObject.hashCode();
        break;
      case 67: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = ux.a(e(paramT, l1));
        break;
      case 66: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = d(paramT, l1);
        break;
      case 65: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = ux.a(e(paramT, l1));
        break;
      case 64: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = d(paramT, l1);
        break;
      case 63: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = d(paramT, l1);
        break;
      case 62: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = d(paramT, l1);
        break;
      case 61: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = Qy.f(paramT, l1).hashCode();
        break;
      case 60: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        localObject = Qy.f(paramT, l1);
        i6 = i3 * 53;
        i3 = localObject.hashCode();
        break;
      case 59: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = ((String)Qy.f(paramT, l1)).hashCode();
        break;
      case 58: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = ux.a(f(paramT, l1));
        break;
      case 57: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = d(paramT, l1);
        break;
      case 56: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = ux.a(e(paramT, l1));
        break;
      case 55: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = d(paramT, l1);
        break;
      case 54: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = ux.a(e(paramT, l1));
        break;
      case 53: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = ux.a(e(paramT, l1));
        break;
      case 52: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = Float.floatToIntBits(c(paramT, l1));
        break;
      case 51: 
        i6 = i3;
        if (!a(paramT, i5, i2)) {
          break label1421;
        }
        i6 = i3 * 53;
        i3 = ux.a(Double.doubleToLongBits(b(paramT, l1)));
        break;
      case 50: 
        i6 = i3 * 53;
        i3 = Qy.f(paramT, l1).hashCode();
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
        i6 = i3 * 53;
        i3 = Qy.f(paramT, l1).hashCode();
        break;
      case 17: 
        localObject = Qy.f(paramT, l1);
        if (localObject != null) {
          i6 = localObject.hashCode();
        }
        break;
      case 16: 
        i6 = i3 * 53;
        i3 = ux.a(Qy.b(paramT, l1));
        break;
      case 15: 
        i6 = i3 * 53;
        i3 = Qy.a(paramT, l1);
        break;
      case 14: 
        i6 = i3 * 53;
        i3 = ux.a(Qy.b(paramT, l1));
        break;
      case 13: 
        i6 = i3 * 53;
        i3 = Qy.a(paramT, l1);
        break;
      case 12: 
        i6 = i3 * 53;
        i3 = Qy.a(paramT, l1);
        break;
      case 11: 
        i6 = i3 * 53;
        i3 = Qy.a(paramT, l1);
        break;
      case 10: 
        i6 = i3 * 53;
        i3 = Qy.f(paramT, l1).hashCode();
        break;
      case 9: 
        localObject = Qy.f(paramT, l1);
        if (localObject != null) {
          i6 = localObject.hashCode();
        }
        i6 = i3 * 53 + i6;
        break;
      case 8: 
        i6 = i3 * 53;
        i3 = ((String)Qy.f(paramT, l1)).hashCode();
        break;
      case 7: 
        i6 = i3 * 53;
        i3 = ux.a(Qy.c(paramT, l1));
        break;
      case 6: 
        i6 = i3 * 53;
        i3 = Qy.a(paramT, l1);
        break;
      case 5: 
        i6 = i3 * 53;
        i3 = ux.a(Qy.b(paramT, l1));
        break;
      case 4: 
        i6 = i3 * 53;
        i3 = Qy.a(paramT, l1);
        break;
      case 3: 
        i6 = i3 * 53;
        i3 = ux.a(Qy.b(paramT, l1));
        break;
      case 2: 
        i6 = i3 * 53;
        i3 = ux.a(Qy.b(paramT, l1));
        break;
      case 1: 
        i6 = i3 * 53;
        i3 = Float.floatToIntBits(Qy.d(paramT, l1));
        break;
      }
      i6 = i3 * 53;
      i3 = ux.a(Double.doubleToLongBits(Qy.e(paramT, l1)));
      i6 += i3;
      label1421:
      i2 += 3;
    }
    i3 = i3 * 53 + this.q.c(paramT).hashCode();
    int i6 = i3;
    if (this.h) {
      i6 = i3 * 53 + this.r.a(paramT).hashCode();
    }
    return i6;
  }
  
  public final void b(T paramT1, T paramT2)
  {
    if (paramT2 != null)
    {
      for (int i1 = 0; i1 < this.c.length; i1 += 3)
      {
        int i2 = c(i1);
        long l1 = 0xFFFFF & i2;
        int i3 = this.c[i1];
        switch ((i2 & 0xFF00000) >>> 20)
        {
        default: 
          break;
        case 68: 
          b(paramT1, paramT2, i1);
          break;
        case 61: 
        case 62: 
        case 63: 
        case 64: 
        case 65: 
        case 66: 
        case 67: 
          if (a(paramT2, i3, i1))
          {
            Qy.a(paramT1, l1, Qy.f(paramT2, l1));
            b(paramT1, i3, i1);
          }
          break;
        case 60: 
          b(paramT1, paramT2, i1);
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
          if (a(paramT2, i3, i1))
          {
            Qy.a(paramT1, l1, Qy.f(paramT2, l1));
            b(paramT1, i3, i1);
          }
          break;
        case 50: 
          ty.a(this.s, paramT1, paramT2, l1);
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
          this.p.a(paramT1, paramT2, l1);
          break;
        case 17: 
          a(paramT1, paramT2, i1);
          break;
        case 16: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.b(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 15: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.a(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 14: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.b(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 13: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.a(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 12: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.a(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 11: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.a(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 10: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.f(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 9: 
          a(paramT1, paramT2, i1);
          break;
        case 8: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.f(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 7: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.c(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 6: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.a(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 5: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.b(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 4: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.a(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 3: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.b(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 2: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.b(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 1: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.d(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        case 0: 
          if (a(paramT2, i1))
          {
            Qy.a(paramT1, l1, Qy.e(paramT2, l1));
            b(paramT1, i1);
          }
          break;
        }
      }
      if (!this.j)
      {
        ty.a(this.q, paramT1, paramT2);
        if (this.h) {
          ty.a(this.r, paramT1, paramT2);
        }
      }
      return;
    }
    throw new NullPointerException();
  }
  
  public final boolean c(T paramT)
  {
    int i1 = 0;
    int i2 = -1;
    int i3 = 0;
    for (;;)
    {
      int i4 = this.m;
      int i5 = 1;
      int i6 = 1;
      if (i1 >= i4) {
        break;
      }
      int i7 = this.l[i1];
      int i8 = this.c[i7];
      int i9 = c(i7);
      int i12;
      if (!this.j)
      {
        i4 = this.c[(i7 + 2)];
        int i10 = i4 & 0xFFFFF;
        int i11 = 1 << (i4 >>> 20);
        i4 = i2;
        i12 = i11;
        if (i10 != i2)
        {
          i3 = b.getInt(paramT, i10);
          i4 = i10;
          i12 = i11;
        }
      }
      else
      {
        i12 = 0;
        i4 = i2;
      }
      if ((0x10000000 & i9) != 0) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      if ((i2 != 0) && (!a(paramT, i7, i3, i12))) {
        return false;
      }
      i2 = (0xFF00000 & i9) >>> 20;
      if ((i2 != 9) && (i2 != 17))
      {
        Object localObject2;
        if (i2 != 27) {
          if ((i2 != 60) && (i2 != 68))
          {
            if (i2 != 49)
            {
              if (i2 != 50) {
                break label528;
              }
              localObject1 = this.s.a(Qy.f(paramT, i9 & 0xFFFFF));
              i12 = i6;
              if (!((Map)localObject1).isEmpty())
              {
                localObject2 = b(i7);
                i12 = i6;
                if (this.s.b(localObject2).c.a() == cz.i)
                {
                  localObject2 = null;
                  Iterator localIterator = ((Map)localObject1).values().iterator();
                  Object localObject3;
                  do
                  {
                    i12 = i6;
                    if (!localIterator.hasNext()) {
                      break;
                    }
                    localObject3 = localIterator.next();
                    localObject1 = localObject2;
                    if (localObject2 == null) {
                      localObject1 = oy.a().a(localObject3.getClass());
                    }
                    localObject2 = localObject1;
                  } while (((ry)localObject1).c(localObject3));
                  i12 = 0;
                }
              }
              if (i12 != 0) {
                break label528;
              }
              return false;
            }
          }
          else
          {
            if ((!a(paramT, i8, i7)) || (a(paramT, i9, a(i7)))) {
              break label528;
            }
            return false;
          }
        }
        Object localObject1 = (List)Qy.f(paramT, i9 & 0xFFFFF);
        i12 = i5;
        if (!((List)localObject1).isEmpty())
        {
          localObject2 = a(i7);
          for (i2 = 0;; i2++)
          {
            i12 = i5;
            if (i2 >= ((List)localObject1).size()) {
              break;
            }
            if (!((ry)localObject2).c(((List)localObject1).get(i2)))
            {
              i12 = 0;
              break;
            }
          }
        }
        if (i12 == 0) {
          return false;
        }
      }
      else if ((a(paramT, i7, i3, i12)) && (!a(paramT, i9, a(i7))))
      {
        return false;
      }
      label528:
      i1++;
      i2 = i4;
    }
    return (!this.h) || (this.r.a(paramT).c());
  }
  
  public final void d(T paramT)
  {
    int i2;
    for (int i1 = this.m;; i1++)
    {
      i2 = this.n;
      if (i1 >= i2) {
        break;
      }
      long l1 = c(this.l[i1]) & 0xFFFFF;
      Object localObject = Qy.f(paramT, l1);
      if (localObject != null)
      {
        this.s.d(localObject);
        Qy.a(paramT, l1, localObject);
      }
    }
    int i3 = this.l.length;
    for (i1 = i2; i1 < i3; i1++) {
      this.p.a(paramT, this.l[i1]);
    }
    this.q.a(paramT);
    if (this.h) {
      this.r.c(paramT);
    }
  }
  
  public final int e(T paramT)
  {
    int i5;
    long l1;
    Object localObject2;
    int i7;
    if (this.j)
    {
      localObject1 = b;
      i1 = 0;
      for (i2 = 0; i1 < this.c.length; i2 = i4)
      {
        i3 = c(i1);
        i4 = (i3 & 0xFF00000) >>> 20;
        i5 = this.c[i1];
        l1 = i3 & 0xFFFFF;
        if ((i4 >= ox.J.a()) && (i4 <= ox.W.a())) {
          i3 = this.c[(i1 + 2)] & 0xFFFFF;
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
            break label2781;
          }
          i4 = cx.c(i5, (by)Qy.f(paramT, l1), a(i1));
          break;
        case 67: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.f(i5, e(paramT, l1));
          break;
        case 66: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.h(i5, d(paramT, l1));
          break;
        case 65: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.h(i5, 0L);
          break;
        case 64: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.j(i5, 0);
          break;
        case 63: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.k(i5, d(paramT, l1));
          break;
        case 62: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.g(i5, d(paramT, l1));
          break;
        case 61: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.c(i5, (Ow)Qy.f(paramT, l1));
          break;
        case 60: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = ty.a(i5, Qy.f(paramT, l1), a(i1));
          break;
        case 59: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          localObject2 = Qy.f(paramT, l1);
          if ((localObject2 instanceof Ow)) {
            i4 = cx.c(i5, (Ow)localObject2);
          } else {
            i4 = cx.b(i5, (String)localObject2);
          }
          break;
        case 58: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.b(i5, true);
          break;
        case 57: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.i(i5, 0);
          break;
        case 56: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.g(i5, 0L);
          break;
        case 55: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.f(i5, d(paramT, l1));
          break;
        case 54: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.e(i5, e(paramT, l1));
          break;
        case 53: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.d(i5, e(paramT, l1));
          break;
        case 52: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.b(i5, 0.0F);
          break;
        case 51: 
          i4 = i2;
          if (!a(paramT, i5, i1)) {
            break label2781;
          }
          i4 = cx.b(i5, 0.0D);
          break;
        case 50: 
          i4 = this.s.a(i5, Qy.f(paramT, l1), b(i1));
          break;
        case 49: 
          i4 = ty.b(i5, a(paramT, l1), a(i1));
          break;
        case 48: 
          i6 = ty.c((List)((Unsafe)localObject1).getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2781;
          }
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i3, i6);
          }
          i4 = cx.l(i5);
          i7 = cx.a(i6);
          i3 = i6;
          i6 = i7;
          break;
        case 47: 
          i6 = ty.g((List)((Unsafe)localObject1).getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2781;
          }
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i3, i6);
          }
          i4 = cx.l(i5);
          i7 = cx.a(i6);
          i3 = i6;
          i6 = i7;
          break;
        case 46: 
          i6 = ty.i((List)((Unsafe)localObject1).getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2781;
          }
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i3, i6);
          }
          i4 = cx.l(i5);
          i7 = cx.a(i6);
          i3 = i6;
          i6 = i7;
          break;
        case 45: 
          i6 = ty.h((List)((Unsafe)localObject1).getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2781;
          }
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i3, i6);
          }
          i4 = cx.l(i5);
          i7 = cx.a(i6);
          i3 = i6;
          i6 = i7;
          break;
        case 44: 
          i6 = ty.d((List)((Unsafe)localObject1).getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2781;
          }
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i3, i6);
          }
          i4 = cx.l(i5);
          i7 = cx.a(i6);
          i3 = i6;
          i6 = i7;
          break;
        case 43: 
          i6 = ty.f((List)((Unsafe)localObject1).getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2781;
          }
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i3, i6);
          }
          i4 = cx.l(i5);
          i7 = cx.a(i6);
          i3 = i6;
          i6 = i7;
          break;
        case 42: 
          i6 = ty.j((List)((Unsafe)localObject1).getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2781;
          }
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i3, i6);
          }
          i4 = cx.l(i5);
          i7 = cx.a(i6);
          i3 = i6;
          i6 = i7;
          break;
        case 41: 
          i6 = ty.h((List)((Unsafe)localObject1).getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2781;
          }
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i3, i6);
          }
          i4 = cx.l(i5);
          i7 = cx.a(i6);
          i3 = i6;
          i6 = i7;
          break;
        case 40: 
          i6 = ty.i((List)((Unsafe)localObject1).getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2781;
          }
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i3, i6);
          }
          i4 = cx.l(i5);
          i7 = cx.a(i6);
          i3 = i6;
          i6 = i7;
          break;
        case 39: 
          i6 = ty.e((List)((Unsafe)localObject1).getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2781;
          }
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i3, i6);
          }
          i4 = cx.l(i5);
          i7 = cx.a(i6);
          i3 = i6;
          i6 = i7;
          break;
        case 38: 
          i6 = ty.b((List)((Unsafe)localObject1).getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2781;
          }
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i3, i6);
          }
          i4 = cx.l(i5);
          i7 = cx.a(i6);
          i3 = i6;
          i6 = i7;
          break;
        case 37: 
          i6 = ty.a((List)((Unsafe)localObject1).getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2781;
          }
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i3, i6);
          }
          i4 = cx.l(i5);
          i7 = cx.a(i6);
          i3 = i6;
          i6 = i7;
          break;
        case 36: 
          i6 = ty.h((List)((Unsafe)localObject1).getObject(paramT, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2781;
          }
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i3, i6);
          }
          i4 = cx.l(i5);
          i7 = cx.a(i6);
          i3 = i6;
          i6 = i7;
          break;
        case 35: 
          i7 = ty.i((List)((Unsafe)localObject1).getObject(paramT, l1));
          i4 = i2;
          if (i7 <= 0) {
            break label2781;
          }
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i3, i7);
          }
          i4 = cx.l(i5);
          i6 = cx.a(i7);
          i3 = i7;
          i4 = i4 + i6 + i3;
          break;
        case 34: 
          i4 = ty.c(i5, a(paramT, l1), false);
          break;
        case 33: 
          i4 = ty.g(i5, a(paramT, l1), false);
          break;
        case 32: 
          i4 = ty.i(i5, a(paramT, l1), false);
          break;
        case 31: 
          i4 = ty.h(i5, a(paramT, l1), false);
          break;
        case 30: 
          i4 = ty.d(i5, a(paramT, l1), false);
          break;
        case 29: 
          i4 = ty.f(i5, a(paramT, l1), false);
          break;
        case 28: 
          i4 = ty.b(i5, a(paramT, l1));
          break;
        case 27: 
          i4 = ty.a(i5, a(paramT, l1), a(i1));
          break;
        case 26: 
          i4 = ty.a(i5, a(paramT, l1));
          break;
        case 25: 
          i4 = ty.j(i5, a(paramT, l1), false);
          break;
        case 24: 
          i4 = ty.h(i5, a(paramT, l1), false);
          break;
        case 23: 
          i4 = ty.i(i5, a(paramT, l1), false);
          break;
        case 22: 
          i4 = ty.e(i5, a(paramT, l1), false);
          break;
        case 21: 
          i4 = ty.b(i5, a(paramT, l1), false);
          break;
        case 20: 
          i4 = ty.a(i5, a(paramT, l1), false);
          break;
        case 19: 
          i4 = ty.h(i5, a(paramT, l1), false);
          break;
        case 18: 
          i4 = ty.i(i5, a(paramT, l1), false);
        }
        for (;;)
        {
          i4 = i2 + i4;
          break;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = cx.c(i5, (by)Qy.f(paramT, l1), a(i1));
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = cx.f(i5, Qy.b(paramT, l1));
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = cx.h(i5, Qy.a(paramT, l1));
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = cx.h(i5, 0L);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = cx.j(i5, 0);
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = cx.k(i5, Qy.a(paramT, l1));
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = cx.g(i5, Qy.a(paramT, l1));
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = cx.c(i5, (Ow)Qy.f(paramT, l1));
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          i4 = ty.a(i5, Qy.f(paramT, l1), a(i1));
          continue;
          i4 = i2;
          if (!a(paramT, i1)) {
            break;
          }
          localObject2 = Qy.f(paramT, l1);
          if ((localObject2 instanceof Ow))
          {
            i4 = cx.c(i5, (Ow)localObject2);
          }
          else
          {
            i4 = cx.b(i5, (String)localObject2);
            continue;
            i4 = i2;
            if (!a(paramT, i1)) {
              break;
            }
            i4 = cx.b(i5, true);
            continue;
            i4 = i2;
            if (!a(paramT, i1)) {
              break;
            }
            i4 = cx.i(i5, 0);
            continue;
            i4 = i2;
            if (!a(paramT, i1)) {
              break;
            }
            i4 = cx.g(i5, 0L);
            continue;
            i4 = i2;
            if (!a(paramT, i1)) {
              break;
            }
            i4 = cx.f(i5, Qy.a(paramT, l1));
            continue;
            i4 = i2;
            if (!a(paramT, i1)) {
              break;
            }
            i4 = cx.e(i5, Qy.b(paramT, l1));
            continue;
            i4 = i2;
            if (!a(paramT, i1)) {
              break;
            }
            i4 = cx.d(i5, Qy.b(paramT, l1));
            continue;
            i4 = i2;
            if (!a(paramT, i1)) {
              break;
            }
            i4 = cx.b(i5, 0.0F);
            continue;
            i4 = i2;
            if (!a(paramT, i1)) {
              break;
            }
            i4 = cx.b(i5, 0.0D);
          }
        }
        label2781:
        i1 += 3;
      }
      return i2 + a(this.q, paramT);
    }
    Object localObject1 = b;
    int i1 = 0;
    int i2 = 0;
    int i3 = -1;
    for (int i4 = 0; i1 < this.c.length; i4 = i5)
    {
      int i8 = c(i1);
      localObject2 = this.c;
      int i9 = localObject2[i1];
      int i10 = (i8 & 0xFF00000) >>> 20;
      int i11;
      if (i10 <= 17)
      {
        i6 = localObject2[(i1 + 2)];
        i7 = i6 & 0xFFFFF;
        i11 = 1 << (i6 >>> 20);
        if (i7 != i3)
        {
          i4 = ((Unsafe)localObject1).getInt(paramT, i7);
          i3 = i7;
        }
        i7 = i3;
        i5 = i4;
      }
      else
      {
        if ((this.k) && (i10 >= ox.J.a()) && (i10 <= ox.W.a())) {
          i6 = this.c[(i1 + 2)] & 0xFFFFF;
        } else {
          i6 = 0;
        }
        i11 = 0;
        i5 = i4;
        i7 = i3;
      }
      l1 = i8 & 0xFFFFF;
      switch (i10)
      {
      default: 
        i4 = i2;
        break;
      case 68: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.c(i9, (by)((Unsafe)localObject1).getObject(paramT, l1), a(i1));
        }
        break;
      case 67: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.f(i9, e(paramT, l1));
        }
        break;
      case 66: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.h(i9, d(paramT, l1));
        }
        break;
      case 65: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.h(i9, 0L);
        }
        break;
      case 64: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.j(i9, 0);
        }
        break;
      case 63: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.k(i9, d(paramT, l1));
        }
        break;
      case 62: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.g(i9, d(paramT, l1));
        }
        break;
      case 61: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.c(i9, (Ow)((Unsafe)localObject1).getObject(paramT, l1));
        }
        break;
      case 60: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = ty.a(i9, ((Unsafe)localObject1).getObject(paramT, l1), a(i1));
        }
        break;
      case 59: 
        i4 = i2;
        if (a(paramT, i9, i1))
        {
          localObject2 = ((Unsafe)localObject1).getObject(paramT, l1);
          if ((localObject2 instanceof Ow)) {
            i4 = cx.c(i9, (Ow)localObject2);
          } else {
            i4 = cx.b(i9, (String)localObject2);
          }
        }
        break;
      case 58: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.b(i9, true);
        }
        break;
      case 57: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.i(i9, 0);
        }
        break;
      case 56: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.g(i9, 0L);
        }
        break;
      case 55: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.f(i9, d(paramT, l1));
        }
        break;
      case 54: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.e(i9, e(paramT, l1));
        }
        break;
      case 53: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.d(i9, e(paramT, l1));
        }
        break;
      case 52: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.b(i9, 0.0F);
        }
        break;
      case 51: 
        i4 = i2;
        if (a(paramT, i9, i1)) {
          i4 = cx.b(i9, 0.0D);
        }
        break;
      case 50: 
        i4 = this.s.a(i9, ((Unsafe)localObject1).getObject(paramT, l1), b(i1));
        break;
      case 49: 
        i4 = ty.b(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), a(i1));
        break;
      case 48: 
        i3 = ty.c((List)((Unsafe)localObject1).getObject(paramT, l1));
        i4 = i2;
        if (i3 > 0)
        {
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i6, i3);
          }
          i11 = cx.l(i9);
          i6 = cx.a(i3);
          i4 = i3;
          i3 = i11;
        }
        break;
      case 47: 
        i3 = ty.g((List)((Unsafe)localObject1).getObject(paramT, l1));
        i4 = i2;
        if (i3 > 0)
        {
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i6, i3);
          }
          i11 = cx.l(i9);
          i6 = cx.a(i3);
          i4 = i3;
          i3 = i11;
        }
        break;
      case 46: 
        i3 = ty.i((List)((Unsafe)localObject1).getObject(paramT, l1));
        i4 = i2;
        if (i3 > 0)
        {
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i6, i3);
          }
          i11 = cx.l(i9);
          i6 = cx.a(i3);
          i4 = i3;
          i3 = i11;
        }
        break;
      case 45: 
        i3 = ty.h((List)((Unsafe)localObject1).getObject(paramT, l1));
        i4 = i2;
        if (i3 > 0)
        {
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i6, i3);
          }
          i11 = cx.l(i9);
          i6 = cx.a(i3);
          i4 = i3;
          i3 = i11;
        }
        break;
      case 44: 
        i3 = ty.d((List)((Unsafe)localObject1).getObject(paramT, l1));
        i4 = i2;
        if (i3 > 0)
        {
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i6, i3);
          }
          i11 = cx.l(i9);
          i6 = cx.a(i3);
          i4 = i3;
          i3 = i11;
        }
        break;
      case 43: 
        i3 = ty.f((List)((Unsafe)localObject1).getObject(paramT, l1));
        i4 = i2;
        if (i3 > 0)
        {
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i6, i3);
          }
          i11 = cx.l(i9);
          i6 = cx.a(i3);
          i4 = i3;
          i3 = i11;
        }
        break;
      case 42: 
        i3 = ty.j((List)((Unsafe)localObject1).getObject(paramT, l1));
        i4 = i2;
        if (i3 > 0)
        {
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i6, i3);
          }
          i11 = cx.l(i9);
          i6 = cx.a(i3);
          i4 = i3;
          i3 = i11;
        }
        break;
      case 41: 
        i3 = ty.h((List)((Unsafe)localObject1).getObject(paramT, l1));
        i4 = i2;
        if (i3 > 0)
        {
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i6, i3);
          }
          i11 = cx.l(i9);
          i6 = cx.a(i3);
          i4 = i3;
          i3 = i11;
        }
        break;
      case 40: 
        i3 = ty.i((List)((Unsafe)localObject1).getObject(paramT, l1));
        i4 = i2;
        if (i3 > 0)
        {
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i6, i3);
          }
          i11 = cx.l(i9);
          i6 = cx.a(i3);
          i4 = i3;
          i3 = i11;
        }
        break;
      case 39: 
        i3 = ty.e((List)((Unsafe)localObject1).getObject(paramT, l1));
        i4 = i2;
        if (i3 > 0)
        {
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i6, i3);
          }
          i11 = cx.l(i9);
          i6 = cx.a(i3);
          i4 = i3;
          i3 = i11;
        }
        break;
      case 38: 
        i3 = ty.b((List)((Unsafe)localObject1).getObject(paramT, l1));
        i4 = i2;
        if (i3 > 0)
        {
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i6, i3);
          }
          i11 = cx.l(i9);
          i6 = cx.a(i3);
          i4 = i3;
          i3 = i11;
        }
        break;
      case 37: 
        i3 = ty.a((List)((Unsafe)localObject1).getObject(paramT, l1));
        i4 = i2;
        if (i3 > 0)
        {
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i6, i3);
          }
          i11 = cx.l(i9);
          i6 = cx.a(i3);
          i4 = i3;
          i3 = i11;
        }
        break;
      case 36: 
        i3 = ty.h((List)((Unsafe)localObject1).getObject(paramT, l1));
        i4 = i2;
        if (i3 > 0)
        {
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i6, i3);
          }
          i11 = cx.l(i9);
          i6 = cx.a(i3);
          i4 = i3;
          i3 = i11;
        }
        break;
      case 35: 
        i11 = ty.i((List)((Unsafe)localObject1).getObject(paramT, l1));
        i4 = i2;
        if (i11 > 0)
        {
          if (this.k) {
            ((Unsafe)localObject1).putInt(paramT, i6, i11);
          }
          i3 = cx.l(i9);
          i6 = cx.a(i11);
          i4 = i11;
          i4 = i3 + i6 + i4;
        }
        break;
      case 34: 
        i4 = ty.c(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), false);
        break;
      case 33: 
        i4 = ty.g(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), false);
        break;
      case 32: 
        i4 = ty.i(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), false);
        break;
      case 31: 
        i4 = ty.h(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), false);
        break;
      case 30: 
        i4 = ty.d(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), false);
        break;
      case 29: 
        i4 = ty.f(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), false);
        break;
      case 28: 
        i4 = ty.b(i9, (List)((Unsafe)localObject1).getObject(paramT, l1));
        break;
      case 27: 
        i4 = ty.a(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), a(i1));
        break;
      case 26: 
        i4 = ty.a(i9, (List)((Unsafe)localObject1).getObject(paramT, l1));
        break;
      case 25: 
        i4 = ty.j(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), false);
        break;
      case 24: 
        i4 = ty.h(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), false);
        break;
      case 23: 
        i4 = ty.i(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), false);
        break;
      case 22: 
        i4 = ty.e(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), false);
        break;
      case 21: 
        i4 = ty.b(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), false);
        break;
      case 20: 
        i4 = ty.a(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), false);
        break;
      case 19: 
        i4 = ty.h(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), false);
        i2 += i4;
      case 18: 
      case 17: 
      case 16: 
      case 15: 
      case 14: 
      case 13: 
      case 12: 
      case 11: 
      case 10: 
      case 9: 
      case 8: 
      case 7: 
      case 6: 
        for (;;)
        {
          i4 = i2;
          break label5221;
          i4 = ty.i(i9, (List)((Unsafe)localObject1).getObject(paramT, l1), false);
          i4 = i2 + i4;
          for (;;)
          {
            break label5775;
            i4 = i2;
            if ((i5 & i11) != 0)
            {
              i4 = cx.c(i9, (by)((Unsafe)localObject1).getObject(paramT, l1), a(i1));
              break;
              i4 = i2;
              if ((i5 & i11) != 0)
              {
                i4 = cx.f(i9, ((Unsafe)localObject1).getLong(paramT, l1));
                break;
                i4 = i2;
                if ((i5 & i11) != 0)
                {
                  i4 = cx.h(i9, ((Unsafe)localObject1).getInt(paramT, l1));
                  break;
                  i4 = i2;
                  if ((i5 & i11) != 0)
                  {
                    i4 = cx.h(i9, 0L);
                    break;
                    i4 = i2;
                    if ((i5 & i11) != 0)
                    {
                      i4 = cx.j(i9, 0);
                      i4 = i2 + i4;
                      continue;
                      i4 = i2;
                      if ((i5 & i11) != 0)
                      {
                        i4 = cx.k(i9, ((Unsafe)localObject1).getInt(paramT, l1));
                        break;
                        i4 = i2;
                        if ((i5 & i11) != 0)
                        {
                          i4 = cx.g(i9, ((Unsafe)localObject1).getInt(paramT, l1));
                          break;
                          i4 = i2;
                          if ((i5 & i11) != 0)
                          {
                            i4 = cx.c(i9, (Ow)((Unsafe)localObject1).getObject(paramT, l1));
                            break;
                            i4 = i2;
                            if ((i5 & i11) != 0)
                            {
                              i4 = ty.a(i9, ((Unsafe)localObject1).getObject(paramT, l1), a(i1));
                              break;
                              i4 = i2;
                              if ((i5 & i11) != 0)
                              {
                                localObject2 = ((Unsafe)localObject1).getObject(paramT, l1);
                                if ((localObject2 instanceof Ow))
                                {
                                  i4 = cx.c(i9, (Ow)localObject2);
                                  break;
                                }
                                i4 = cx.b(i9, (String)localObject2);
                                break;
                                i4 = i2;
                                if ((i5 & i11) != 0) {
                                  i4 = i2 + cx.b(i9, true);
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
          if ((i5 & i11) != 0) {
            i2 += cx.i(i9, 0);
          }
        }
      case 5: 
        if ((i5 & i11) != 0) {
          i4 = cx.g(i9, 0L);
        } else {
          i4 = i2;
        }
        break;
      case 4: 
        i4 = i2;
        if ((i5 & i11) != 0) {
          i4 = cx.f(i9, ((Unsafe)localObject1).getInt(paramT, l1));
        }
        break;
      case 3: 
        i4 = i2;
        if ((i5 & i11) != 0) {
          i4 = cx.e(i9, ((Unsafe)localObject1).getLong(paramT, l1));
        }
        break;
      case 2: 
        i4 = i2;
        if ((i5 & i11) != 0)
        {
          i4 = cx.d(i9, ((Unsafe)localObject1).getLong(paramT, l1));
          i4 = i2 + i4;
        }
        break;
      case 1: 
        label5221:
        i4 = i2;
        if ((i5 & i11) != 0) {
          i4 = i2 + cx.b(i9, 0.0F);
        }
        break;
      }
      for (;;)
      {
        break;
        i4 = i2;
        if ((i5 & i11) != 0) {
          i4 = i2 + cx.b(i9, 0.0D);
        }
      }
      label5775:
      i1 += 3;
      i2 = i4;
      i3 = i7;
    }
    i3 = 0;
    int i6 = i2 + a(this.q, paramT);
    i4 = i6;
    if (this.h)
    {
      localObject1 = this.r.a(paramT);
      i4 = 0;
      while (i3 < ((lx)localObject1).b.c())
      {
        paramT = ((lx)localObject1).b.b(i3);
        i4 += lx.a((nx)paramT.getKey(), paramT.getValue());
        i3++;
      }
      paramT = ((lx)localObject1).b.d().iterator();
      while (paramT.hasNext())
      {
        localObject1 = (Map.Entry)paramT.next();
        i4 += lx.a((nx)((Map.Entry)localObject1).getKey(), ((Map.Entry)localObject1).getValue());
      }
      i4 = i6 + i4;
    }
    return i4;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */