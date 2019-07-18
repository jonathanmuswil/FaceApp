import java.io.IOException;

public final class v_a
{
  static final mab a = mab.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
  private static final String[] b = { "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION" };
  static final String[] c = new String[64];
  static final String[] d = new String['Ā'];
  
  static
  {
    int i = 0;
    for (int j = 0;; j++)
    {
      localObject1 = d;
      if (j >= localObject1.length) {
        break;
      }
      localObject1[j] = LZa.a("%8s", new Object[] { Integer.toBinaryString(j) }).replace(' ', '0');
    }
    Object localObject2 = c;
    localObject2[0] = "";
    localObject2[1] = "END_STREAM";
    Object localObject1 = new int[1];
    localObject1[0] = 1;
    localObject2[8] = "PADDED";
    int k = localObject1.length;
    StringBuilder localStringBuilder;
    for (j = 0; j < k; j++)
    {
      m = localObject1[j];
      localObject2 = c;
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(c[m]);
      localStringBuilder.append("|PADDED");
      localObject2[(m | 0x8)] = localStringBuilder.toString();
    }
    localObject2 = c;
    localObject2[4] = "END_HEADERS";
    localObject2[32] = "PRIORITY";
    localObject2[36] = "END_HEADERS|PRIORITY";
    localObject2 = new int[3];
    Object tmp255_254 = localObject2;
    tmp255_254[0] = 4;
    Object tmp259_255 = tmp255_254;
    tmp259_255[1] = 32;
    Object tmp264_259 = tmp259_255;
    tmp264_259[2] = 36;
    tmp264_259;
    int m = localObject2.length;
    for (j = 0;; j++)
    {
      k = i;
      if (j >= m) {
        break;
      }
      int n = localObject2[j];
      int i1 = localObject1.length;
      for (k = 0; k < i1; k++)
      {
        int i2 = localObject1[k];
        String[] arrayOfString = c;
        int i3 = i2 | n;
        localStringBuilder = new StringBuilder();
        localStringBuilder.append(c[i2]);
        localStringBuilder.append('|');
        localStringBuilder.append(c[n]);
        arrayOfString[i3] = localStringBuilder.toString();
        arrayOfString = c;
        localStringBuilder = new StringBuilder();
        localStringBuilder.append(c[i2]);
        localStringBuilder.append('|');
        localStringBuilder.append(c[n]);
        localStringBuilder.append("|PADDED");
        arrayOfString[(i3 | 0x8)] = localStringBuilder.toString();
      }
    }
    for (;;)
    {
      localObject1 = c;
      if (k >= localObject1.length) {
        break;
      }
      if (localObject1[k] == null) {
        localObject1[k] = d[k];
      }
      k++;
    }
  }
  
  static IllegalArgumentException a(String paramString, Object... paramVarArgs)
  {
    throw new IllegalArgumentException(LZa.a(paramString, paramVarArgs));
  }
  
  static String a(byte paramByte1, byte paramByte2)
  {
    if (paramByte2 == 0) {
      return "";
    }
    if ((paramByte1 != 2) && (paramByte1 != 3))
    {
      Object localObject;
      if ((paramByte1 != 4) && (paramByte1 != 6))
      {
        if ((paramByte1 != 7) && (paramByte1 != 8))
        {
          localObject = c;
          if (paramByte2 < localObject.length) {
            localObject = localObject[paramByte2];
          } else {
            localObject = d[paramByte2];
          }
          if ((paramByte1 == 5) && ((paramByte2 & 0x4) != 0)) {
            return ((String)localObject).replace("HEADERS", "PUSH_PROMISE");
          }
          if ((paramByte1 == 0) && ((paramByte2 & 0x20) != 0)) {
            return ((String)localObject).replace("PRIORITY", "COMPRESSED");
          }
          return (String)localObject;
        }
      }
      else
      {
        if (paramByte2 == 1) {
          localObject = "ACK";
        } else {
          localObject = d[paramByte2];
        }
        return (String)localObject;
      }
    }
    return d[paramByte2];
  }
  
  static String a(boolean paramBoolean, int paramInt1, int paramInt2, byte paramByte1, byte paramByte2)
  {
    Object localObject = b;
    if (paramByte1 < localObject.length) {
      localObject = localObject[paramByte1];
    } else {
      localObject = LZa.a("0x%02x", new Object[] { Byte.valueOf(paramByte1) });
    }
    String str1 = a(paramByte1, paramByte2);
    String str2;
    if (paramBoolean) {
      str2 = "<<";
    } else {
      str2 = ">>";
    }
    return LZa.a("%s 0x%08x %5d %-13s %s", new Object[] { str2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), localObject, str1 });
  }
  
  static IOException b(String paramString, Object... paramVarArgs)
    throws IOException
  {
    throw new IOException(LZa.a(paramString, paramVarArgs));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/v_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */