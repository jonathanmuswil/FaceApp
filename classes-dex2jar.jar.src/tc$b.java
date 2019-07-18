import android.graphics.Path;
import android.util.Log;

public class tc$b
{
  public char a;
  public float[] b;
  
  tc$b(char paramChar, float[] paramArrayOfFloat)
  {
    this.a = ((char)paramChar);
    this.b = paramArrayOfFloat;
  }
  
  tc$b(b paramb)
  {
    this.a = ((char)paramb.a);
    paramb = paramb.b;
    this.b = tc.a(paramb, 0, paramb.length);
  }
  
  private static void a(Path paramPath, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9)
  {
    int i = (int)Math.ceil(Math.abs(paramDouble9 * 4.0D / 3.141592653589793D));
    double d1 = Math.cos(paramDouble7);
    double d2 = Math.sin(paramDouble7);
    double d3 = Math.cos(paramDouble8);
    double d4 = Math.sin(paramDouble8);
    paramDouble7 = -paramDouble3;
    double d5 = paramDouble7 * d1;
    double d6 = paramDouble4 * d2;
    paramDouble7 *= d2;
    double d7 = paramDouble4 * d1;
    paramDouble9 /= i;
    double d8 = paramDouble5;
    paramDouble5 = d4 * paramDouble7 + d3 * d7;
    paramDouble4 = d5 * d4 - d6 * d3;
    int j = 0;
    d3 = paramDouble8;
    d4 = paramDouble6;
    paramDouble8 = paramDouble4;
    paramDouble4 = paramDouble7;
    paramDouble7 = paramDouble9;
    paramDouble9 = d2;
    paramDouble6 = d1;
    for (;;)
    {
      d2 = paramDouble3;
      if (j >= i) {
        break;
      }
      double d9 = d3 + paramDouble7;
      double d10 = Math.sin(d9);
      double d11 = Math.cos(d9);
      d1 = paramDouble1 + d2 * paramDouble6 * d11 - d6 * d10;
      double d12 = paramDouble2 + d2 * paramDouble9 * d11 + d7 * d10;
      d2 = d5 * d10 - d6 * d11;
      d11 = d10 * paramDouble4 + d11 * d7;
      d10 = d9 - d3;
      d3 = Math.tan(d10 / 2.0D);
      d3 = Math.sin(d10) * (Math.sqrt(d3 * 3.0D * d3 + 4.0D) - 1.0D) / 3.0D;
      paramPath.rLineTo(0.0F, 0.0F);
      paramPath.cubicTo((float)(d8 + paramDouble8 * d3), (float)(d4 + paramDouble5 * d3), (float)(d1 - d3 * d2), (float)(d12 - d3 * d11), (float)d1, (float)d12);
      j++;
      d4 = d12;
      d3 = d9;
      paramDouble5 = d11;
      paramDouble8 = d2;
      d8 = d1;
    }
  }
  
  private static void a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, boolean paramBoolean1, boolean paramBoolean2)
  {
    double d1 = Math.toRadians(paramFloat7);
    double d2 = Math.cos(d1);
    double d3 = Math.sin(d1);
    double d4 = paramFloat1;
    double d5 = paramFloat2;
    double d6 = paramFloat5;
    double d7 = (d4 * d2 + d5 * d3) / d6;
    double d8 = -paramFloat1;
    double d9 = paramFloat6;
    double d10 = (d8 * d3 + d5 * d2) / d9;
    double d11 = paramFloat3;
    d8 = paramFloat4;
    double d12 = (d11 * d2 + d8 * d3) / d6;
    double d13 = (-paramFloat3 * d3 + d8 * d2) / d9;
    double d14 = d7 - d12;
    double d15 = d10 - d13;
    d11 = (d7 + d12) / 2.0D;
    d8 = (d10 + d13) / 2.0D;
    double d16 = d14 * d14 + d15 * d15;
    if (d16 == 0.0D)
    {
      Log.w("PathParser", " Points are coincident");
      return;
    }
    double d17 = 1.0D / d16 - 0.25D;
    if (d17 < 0.0D)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Points are too far apart ");
      localStringBuilder.append(d16);
      Log.w("PathParser", localStringBuilder.toString());
      float f = (float)(Math.sqrt(d16) / 1.99999D);
      a(paramPath, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5 * f, paramFloat6 * f, paramFloat7, paramBoolean1, paramBoolean2);
      return;
    }
    d17 = Math.sqrt(d17);
    d14 *= d17;
    d15 = d17 * d15;
    if (paramBoolean1 == paramBoolean2)
    {
      d11 -= d15;
      d8 += d14;
    }
    else
    {
      d11 += d15;
      d8 -= d14;
    }
    d10 = Math.atan2(d10 - d8, d7 - d11);
    d12 = Math.atan2(d13 - d8, d12 - d11) - d10;
    boolean bool = d12 < 0.0D;
    if (!bool) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    d7 = d12;
    if (paramBoolean2 != paramBoolean1) {
      if (bool) {
        d7 = d12 - 6.283185307179586D;
      } else {
        d7 = d12 + 6.283185307179586D;
      }
    }
    d11 *= d6;
    d8 *= d9;
    a(paramPath, d11 * d2 - d8 * d3, d11 * d3 + d8 * d2, d6, d9, d4, d5, d1, d10, d7);
  }
  
  private static void a(Path paramPath, float[] paramArrayOfFloat1, char paramChar1, char paramChar2, float[] paramArrayOfFloat2)
  {
    float f1 = paramArrayOfFloat1[0];
    float f2 = paramArrayOfFloat1[1];
    float f3 = paramArrayOfFloat1[2];
    float f4 = paramArrayOfFloat1[3];
    float f5 = paramArrayOfFloat1[4];
    float f6 = paramArrayOfFloat1[5];
    float f7 = f1;
    float f8 = f2;
    float f9 = f3;
    float f10 = f4;
    char c1;
    switch (paramChar2)
    {
    default: 
      f10 = f4;
      f9 = f3;
      f8 = f2;
      f7 = f1;
    case 'L': 
    case 'M': 
    case 'T': 
    case 'l': 
    case 'm': 
    case 't': 
    case 'Z': 
    case 'z': 
      for (;;)
      {
        c1 = '\002';
        break;
        paramPath.close();
        paramPath.moveTo(f5, f6);
        f7 = f5;
        f9 = f7;
        f8 = f6;
        f10 = f8;
      }
    case 'Q': 
    case 'S': 
    case 'q': 
    case 's': 
      c1 = '\004';
      f7 = f1;
      f8 = f2;
      f9 = f3;
      f10 = f4;
      break;
    case 'H': 
    case 'V': 
    case 'h': 
    case 'v': 
      c1 = '\001';
      f7 = f1;
      f8 = f2;
      f9 = f3;
      f10 = f4;
      break;
    case 'C': 
    case 'c': 
      c1 = '\006';
      f7 = f1;
      f8 = f2;
      f9 = f3;
      f10 = f4;
      break;
    case 'A': 
    case 'a': 
      c1 = '\007';
      f10 = f4;
      f9 = f3;
      f8 = f2;
      f7 = f1;
    }
    f3 = f7;
    f7 = f8;
    char c2 = '\000';
    int i = paramChar1;
    paramChar1 = c2;
    f8 = f3;
    for (;;)
    {
      c2 = paramChar2;
      if (paramChar1 >= paramArrayOfFloat2.length) {
        break;
      }
      int j;
      label1243:
      label1569:
      label1580:
      boolean bool1;
      boolean bool2;
      if (c2 != 'A')
      {
        int k;
        if (c2 != 'C')
        {
          if (c2 != 'H')
          {
            if (c2 != 'Q')
            {
              if (c2 != 'V')
              {
                if (c2 != 'a')
                {
                  if (c2 != 'c') {
                    if (c2 != 'h') {
                      if (c2 != 'q') {
                        if (c2 != 'v') {
                          if (c2 != 'L') {
                            if (c2 != 'M') {
                              if (c2 != 'S') {
                                if (c2 != 'T') {
                                  if (c2 != 'l') {
                                    if (c2 != 'm') {
                                      if (c2 != 's') {
                                        if (c2 != 't') {
                                          break label2134;
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
                  for (;;)
                  {
                    if ((i != 113) && (i != 116) && (i != 81) && (i != 84))
                    {
                      f10 = 0.0F;
                      f9 = 0.0F;
                    }
                    else
                    {
                      f9 = f8 - f9;
                      f10 = f7 - f10;
                    }
                    i = paramChar1 + '\000';
                    f3 = paramArrayOfFloat2[i];
                    c2 = paramChar1 + '\001';
                    paramPath.rQuadTo(f9, f10, f3, paramArrayOfFloat2[c2]);
                    f3 = f8 + paramArrayOfFloat2[i];
                    f4 = f7 + paramArrayOfFloat2[c2];
                    f10 += f7;
                    f9 += f8;
                    f7 = f4;
                    f8 = f3;
                    continue;
                    if ((i != 99) && (i != 115) && (i != 67) && (i != 83))
                    {
                      f9 = 0.0F;
                      f10 = 0.0F;
                    }
                    else
                    {
                      f10 = f7 - f10;
                      f9 = f8 - f9;
                    }
                    j = paramChar1 + '\000';
                    f3 = paramArrayOfFloat2[j];
                    k = paramChar1 + '\001';
                    f4 = paramArrayOfFloat2[k];
                    i = paramChar1 + '\002';
                    f2 = paramArrayOfFloat2[i];
                    c2 = paramChar1 + '\003';
                    paramPath.rCubicTo(f9, f10, f3, f4, f2, paramArrayOfFloat2[c2]);
                    f4 = paramArrayOfFloat2[j] + f8;
                    f9 = paramArrayOfFloat2[k] + f7;
                    f10 = f8 + paramArrayOfFloat2[i];
                    f3 = paramArrayOfFloat2[c2];
                    f8 = f4;
                    break label1569;
                    i = paramChar1 + '\000';
                    f8 += paramArrayOfFloat2[i];
                    c2 = paramChar1 + '\001';
                    f7 += paramArrayOfFloat2[c2];
                    if (paramChar1 > 0)
                    {
                      paramPath.rLineTo(paramArrayOfFloat2[i], paramArrayOfFloat2[c2]);
                    }
                    else
                    {
                      paramPath.rMoveTo(paramArrayOfFloat2[i], paramArrayOfFloat2[c2]);
                      break label1243;
                      i = paramChar1 + '\000';
                      f3 = paramArrayOfFloat2[i];
                      c2 = paramChar1 + '\001';
                      paramPath.rLineTo(f3, paramArrayOfFloat2[c2]);
                      f8 += paramArrayOfFloat2[i];
                      for (f3 = paramArrayOfFloat2[c2];; f3 = paramArrayOfFloat2[i])
                      {
                        f7 += f3;
                        break;
                        if ((i != 113) && (i != 116) && (i != 81))
                        {
                          f4 = f7;
                          f3 = f8;
                          if (i != 84) {}
                        }
                        else
                        {
                          f3 = f8 * 2.0F - f9;
                          f4 = f7 * 2.0F - f10;
                        }
                        i = paramChar1 + '\000';
                        f8 = paramArrayOfFloat2[i];
                        c2 = paramChar1 + '\001';
                        paramPath.quadTo(f3, f4, f8, paramArrayOfFloat2[c2]);
                        f8 = paramArrayOfFloat2[i];
                        f7 = paramArrayOfFloat2[c2];
                        f10 = f4;
                        f9 = f3;
                        break;
                        if ((i != 99) && (i != 115) && (i != 67))
                        {
                          f4 = f7;
                          f3 = f8;
                          if (i != 83) {}
                        }
                        else
                        {
                          f3 = f8 * 2.0F - f9;
                          f4 = f7 * 2.0F - f10;
                        }
                        k = paramChar1 + '\000';
                        f8 = paramArrayOfFloat2[k];
                        c2 = paramChar1 + '\001';
                        f7 = paramArrayOfFloat2[c2];
                        j = paramChar1 + '\002';
                        f9 = paramArrayOfFloat2[j];
                        i = paramChar1 + '\003';
                        paramPath.cubicTo(f3, f4, f8, f7, f9, paramArrayOfFloat2[i]);
                        f8 = paramArrayOfFloat2[k];
                        f9 = paramArrayOfFloat2[c2];
                        f3 = paramArrayOfFloat2[j];
                        f7 = paramArrayOfFloat2[i];
                        break label1580;
                        c2 = paramChar1 + '\000';
                        f8 = paramArrayOfFloat2[c2];
                        i = paramChar1 + '\001';
                        f7 = paramArrayOfFloat2[i];
                        if (paramChar1 > 0)
                        {
                          paramPath.lineTo(paramArrayOfFloat2[c2], paramArrayOfFloat2[i]);
                          break;
                        }
                        paramPath.moveTo(paramArrayOfFloat2[c2], paramArrayOfFloat2[i]);
                        f6 = f7;
                        f5 = f8;
                        break;
                        c2 = paramChar1 + '\000';
                        f8 = paramArrayOfFloat2[c2];
                        i = paramChar1 + '\001';
                        paramPath.lineTo(f8, paramArrayOfFloat2[i]);
                        f8 = paramArrayOfFloat2[c2];
                        f7 = paramArrayOfFloat2[i];
                        break;
                        i = paramChar1 + '\000';
                        paramPath.rLineTo(0.0F, paramArrayOfFloat2[i]);
                      }
                      i = paramChar1 + '\000';
                      f3 = paramArrayOfFloat2[i];
                      j = paramChar1 + '\001';
                      f9 = paramArrayOfFloat2[j];
                      k = paramChar1 + '\002';
                      f10 = paramArrayOfFloat2[k];
                      c2 = paramChar1 + '\003';
                      paramPath.rQuadTo(f3, f9, f10, paramArrayOfFloat2[c2]);
                      f4 = paramArrayOfFloat2[i] + f8;
                      f9 = paramArrayOfFloat2[j] + f7;
                      f10 = f8 + paramArrayOfFloat2[k];
                      f3 = paramArrayOfFloat2[c2];
                      f8 = f4;
                      break label1569;
                      i = paramChar1 + '\000';
                      paramPath.rLineTo(paramArrayOfFloat2[i], 0.0F);
                      f8 += paramArrayOfFloat2[i];
                      continue;
                      f2 = paramArrayOfFloat2[(paramChar1 + '\000')];
                      f10 = paramArrayOfFloat2[(paramChar1 + '\001')];
                      i = paramChar1 + '\002';
                      f9 = paramArrayOfFloat2[i];
                      c2 = paramChar1 + '\003';
                      f4 = paramArrayOfFloat2[c2];
                      j = paramChar1 + '\004';
                      f3 = paramArrayOfFloat2[j];
                      k = paramChar1 + '\005';
                      paramPath.rCubicTo(f2, f10, f9, f4, f3, paramArrayOfFloat2[k]);
                      f4 = paramArrayOfFloat2[i] + f8;
                      f9 = paramArrayOfFloat2[c2] + f7;
                      f10 = f8 + paramArrayOfFloat2[j];
                      f3 = paramArrayOfFloat2[k];
                      f8 = f4;
                      f7 += f3;
                      f3 = f10;
                      f10 = f9;
                      f9 = f8;
                      f8 = f3;
                    }
                  }
                }
                c2 = paramChar1 + '\005';
                f2 = paramArrayOfFloat2[c2];
                i = paramChar1 + '\006';
                f4 = paramArrayOfFloat2[i];
                f3 = paramArrayOfFloat2[(paramChar1 + '\000')];
                f9 = paramArrayOfFloat2[(paramChar1 + '\001')];
                f10 = paramArrayOfFloat2[(paramChar1 + '\002')];
                if (paramArrayOfFloat2[(paramChar1 + '\003')] != 0.0F) {
                  bool1 = true;
                } else {
                  bool1 = false;
                }
                if (paramArrayOfFloat2[(paramChar1 + '\004')] != 0.0F) {
                  bool2 = true;
                } else {
                  bool2 = false;
                }
                a(paramPath, f8, f7, f2 + f8, f4 + f7, f3, f9, f10, bool1, bool2);
                f8 += paramArrayOfFloat2[c2];
                f7 += paramArrayOfFloat2[i];
              }
              else
              {
                i = paramChar1 + '\000';
                paramPath.lineTo(f8, paramArrayOfFloat2[i]);
                f7 = paramArrayOfFloat2[i];
                break label2134;
              }
            }
            else
            {
              i = paramChar1;
              c2 = i + 0;
              f9 = paramArrayOfFloat2[c2];
              k = i + 1;
              f7 = paramArrayOfFloat2[k];
              j = i + 2;
              f8 = paramArrayOfFloat2[j];
              i += 3;
              paramPath.quadTo(f9, f7, f8, paramArrayOfFloat2[i]);
              f9 = paramArrayOfFloat2[c2];
              f10 = paramArrayOfFloat2[k];
              f8 = paramArrayOfFloat2[j];
              f7 = paramArrayOfFloat2[i];
              break label2134;
            }
          }
          else
          {
            i = paramChar1 + '\000';
            paramPath.lineTo(paramArrayOfFloat2[i], f7);
            f8 = paramArrayOfFloat2[i];
            break label2134;
          }
        }
        else
        {
          i = paramChar1;
          f3 = paramArrayOfFloat2[(i + 0)];
          f7 = paramArrayOfFloat2[(i + 1)];
          k = i + 2;
          f10 = paramArrayOfFloat2[k];
          j = i + 3;
          f8 = paramArrayOfFloat2[j];
          c2 = i + 4;
          f9 = paramArrayOfFloat2[c2];
          i += 5;
          paramPath.cubicTo(f3, f7, f10, f8, f9, paramArrayOfFloat2[i]);
          f8 = paramArrayOfFloat2[c2];
          f7 = paramArrayOfFloat2[i];
          f9 = paramArrayOfFloat2[k];
          f10 = paramArrayOfFloat2[j];
          break label2134;
        }
      }
      else
      {
        i = paramChar1;
        c2 = i + 5;
        f9 = paramArrayOfFloat2[c2];
        j = i + 6;
        f4 = paramArrayOfFloat2[j];
        f2 = paramArrayOfFloat2[(i + 0)];
        f3 = paramArrayOfFloat2[(i + 1)];
        f10 = paramArrayOfFloat2[(i + 2)];
        if (paramArrayOfFloat2[(i + 3)] != 0.0F) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        if (paramArrayOfFloat2[(i + 4)] != 0.0F) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        a(paramPath, f8, f7, f9, f4, f2, f3, f10, bool1, bool2);
        f8 = paramArrayOfFloat2[c2];
        f7 = paramArrayOfFloat2[j];
      }
      f10 = f7;
      f9 = f8;
      label2134:
      paramChar1 += c1;
      i = paramChar2;
    }
    paramArrayOfFloat1[0] = f8;
    paramArrayOfFloat1[1] = f7;
    paramArrayOfFloat1[2] = f9;
    paramArrayOfFloat1[3] = f10;
    paramArrayOfFloat1[4] = f5;
    paramArrayOfFloat1[5] = f6;
  }
  
  public static void a(b[] paramArrayOfb, Path paramPath)
  {
    float[] arrayOfFloat = new float[6];
    char c1 = 'm';
    int i = 0;
    for (char c2 = c1; i < paramArrayOfb.length; c2 = c1)
    {
      a(paramPath, arrayOfFloat, c2, paramArrayOfb[i].a, paramArrayOfb[i].b);
      c1 = paramArrayOfb[i].a;
      i++;
    }
  }
  
  public void a(b paramb1, b paramb2, float paramFloat)
  {
    for (int i = 0;; i++)
    {
      float[] arrayOfFloat = paramb1.b;
      if (i >= arrayOfFloat.length) {
        break;
      }
      this.b[i] = (arrayOfFloat[i] * (1.0F - paramFloat) + paramb2.b[i] * paramFloat);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tc$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */