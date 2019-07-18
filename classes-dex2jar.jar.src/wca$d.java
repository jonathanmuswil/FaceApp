import java.io.IOException;
import java.util.concurrent.Callable;

public abstract class wca$d<V>
  implements Callable<V>
{
  protected abstract void a()
    throws IOException;
  
  protected abstract V b()
    throws wca.c, IOException;
  
  /* Error */
  public V call()
    throws wca.c
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: invokevirtual 25	wca$d:b	()Ljava/lang/Object;
    //   6: astore_2
    //   7: aload_0
    //   8: invokevirtual 27	wca$d:a	()V
    //   11: aload_2
    //   12: areturn
    //   13: astore_2
    //   14: new 22	wca$c
    //   17: dup
    //   18: aload_2
    //   19: invokespecial 30	wca$c:<init>	(Ljava/io/IOException;)V
    //   22: athrow
    //   23: astore_2
    //   24: iconst_0
    //   25: istore_1
    //   26: goto +19 -> 45
    //   29: astore_3
    //   30: new 22	wca$c
    //   33: astore_2
    //   34: aload_2
    //   35: aload_3
    //   36: invokespecial 30	wca$c:<init>	(Ljava/io/IOException;)V
    //   39: aload_2
    //   40: athrow
    //   41: astore_2
    //   42: aload_2
    //   43: athrow
    //   44: astore_2
    //   45: aload_0
    //   46: invokevirtual 27	wca$d:a	()V
    //   49: goto +17 -> 66
    //   52: astore_3
    //   53: iload_1
    //   54: ifne +12 -> 66
    //   57: new 22	wca$c
    //   60: dup
    //   61: aload_3
    //   62: invokespecial 30	wca$c:<init>	(Ljava/io/IOException;)V
    //   65: athrow
    //   66: aload_2
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	this	d
    //   1	53	1	i	int
    //   6	6	2	localObject1	Object
    //   13	6	2	localIOException1	IOException
    //   23	1	2	localObject2	Object
    //   33	7	2	localc1	wca.c
    //   41	2	2	localc2	wca.c
    //   44	23	2	localObject3	Object
    //   29	7	3	localIOException2	IOException
    //   52	10	3	localIOException3	IOException
    // Exception table:
    //   from	to	target	type
    //   7	11	13	java/io/IOException
    //   2	7	23	finally
    //   2	7	29	java/io/IOException
    //   2	7	41	wca$c
    //   30	41	44	finally
    //   42	44	44	finally
    //   45	49	52	java/io/IOException
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wca$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */