import java.io.IOException;
import java.net.ProtocolException;

public final class o_a
{
  public final vZa a;
  public final int b;
  public final String c;
  
  public o_a(vZa paramvZa, int paramInt, String paramString)
  {
    this.a = paramvZa;
    this.b = paramInt;
    this.c = paramString;
  }
  
  public static o_a a(String paramString)
    throws IOException
  {
    boolean bool = paramString.startsWith("HTTP/1.");
    int i = 9;
    Object localObject;
    if (bool)
    {
      if ((paramString.length() >= 9) && (paramString.charAt(8) == ' '))
      {
        j = paramString.charAt(7) - '0';
        if (j == 0)
        {
          localObject = vZa.a;
        }
        else if (j == 1)
        {
          localObject = vZa.b;
        }
        else
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Unexpected status line: ");
          ((StringBuilder)localObject).append(paramString);
          throw new ProtocolException(((StringBuilder)localObject).toString());
        }
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unexpected status line: ");
        ((StringBuilder)localObject).append(paramString);
        throw new ProtocolException(((StringBuilder)localObject).toString());
      }
    }
    else
    {
      if (!paramString.startsWith("ICY ")) {
        break label344;
      }
      localObject = vZa.a;
      i = 4;
    }
    int k = paramString.length();
    int j = i + 3;
    if (k >= j) {
      try
      {
        k = Integer.parseInt(paramString.substring(i, j));
        if (paramString.length() > j)
        {
          if (paramString.charAt(j) == ' ')
          {
            paramString = paramString.substring(i + 4);
          }
          else
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("Unexpected status line: ");
            ((StringBuilder)localObject).append(paramString);
            throw new ProtocolException(((StringBuilder)localObject).toString());
          }
        }
        else {
          paramString = "";
        }
        return new o_a((vZa)localObject, k, paramString);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Unexpected status line: ");
        localStringBuilder.append(paramString);
        throw new ProtocolException(localStringBuilder.toString());
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unexpected status line: ");
    localStringBuilder.append(paramString);
    throw new ProtocolException(localStringBuilder.toString());
    label344:
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unexpected status line: ");
    localStringBuilder.append(paramString);
    throw new ProtocolException(localStringBuilder.toString());
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str;
    if (this.a == vZa.a) {
      str = "HTTP/1.0";
    } else {
      str = "HTTP/1.1";
    }
    localStringBuilder.append(str);
    localStringBuilder.append(' ');
    localStringBuilder.append(this.b);
    if (this.c != null)
    {
      localStringBuilder.append(' ');
      localStringBuilder.append(this.c);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/o_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */