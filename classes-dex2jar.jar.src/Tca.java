import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class tca
  implements yca
{
  private final Xaa a;
  private Aca b;
  private SSLSocketFactory c;
  private boolean d;
  
  public tca()
  {
    this(new Kaa());
  }
  
  public tca(Xaa paramXaa)
  {
    this.a = paramXaa;
  }
  
  private SSLSocketFactory a()
  {
    try
    {
      if ((this.c == null) && (!this.d)) {
        this.c = b();
      }
      SSLSocketFactory localSSLSocketFactory = this.c;
      return localSSLSocketFactory;
    }
    finally {}
  }
  
  private boolean a(String paramString)
  {
    boolean bool;
    if ((paramString != null) && (paramString.toLowerCase(Locale.US).startsWith("https"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  /* Error */
  private SSLSocketFactory b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield 34	tca:d	Z
    //   7: aload_0
    //   8: getfield 58	tca:b	LAca;
    //   11: invokestatic 63	zca:a	(LAca;)Ljavax/net/ssl/SSLSocketFactory;
    //   14: astore_1
    //   15: aload_0
    //   16: getfield 29	tca:a	LXaa;
    //   19: ldc 65
    //   21: ldc 67
    //   23: invokeinterface 72 3 0
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: areturn
    //   32: astore_1
    //   33: aload_0
    //   34: getfield 29	tca:a	LXaa;
    //   37: ldc 65
    //   39: ldc 74
    //   41: aload_1
    //   42: invokeinterface 77 4 0
    //   47: aload_0
    //   48: monitorexit
    //   49: aconst_null
    //   50: areturn
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	tca
    //   14	17	1	localSSLSocketFactory	SSLSocketFactory
    //   32	10	1	localException	Exception
    //   51	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   7	28	32	java/lang/Exception
    //   2	7	51	finally
    //   7	28	51	finally
    //   33	47	51	finally
  }
  
  private void c()
  {
    try
    {
      this.d = false;
      this.c = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public wca a(uca paramuca, String paramString, Map<String, String> paramMap)
  {
    int i = sca.a[paramuca.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i == 4) {
            paramuca = wca.a(paramString);
          } else {
            throw new IllegalArgumentException("Unsupported HTTP method!");
          }
        }
        else {
          paramuca = wca.e(paramString);
        }
      }
      else {
        paramuca = wca.b(paramString, paramMap, true);
      }
    }
    else {
      paramuca = wca.a(paramString, paramMap, true);
    }
    if ((a(paramString)) && (this.b != null))
    {
      paramString = a();
      if (paramString != null) {
        ((HttpsURLConnection)paramuca.j()).setSSLSocketFactory(paramString);
      }
    }
    return paramuca;
  }
  
  public void a(Aca paramAca)
  {
    if (this.b != paramAca)
    {
      this.b = paramAca;
      c();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */