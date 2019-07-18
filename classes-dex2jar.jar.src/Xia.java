import io.faceapp.FaceApplication;
import io.faceapp.FaceApplication.a;
import java.io.IOException;

public final class xia
  extends AZa
{
  private final int a;
  private final HVa<tia> b;
  private final byte[] c;
  
  public xia(byte[] paramArrayOfByte)
  {
    this.c = paramArrayOfByte;
    this.a = 2048;
    paramArrayOfByte = HVa.t();
    oXa.a(paramArrayOfByte, "ReplaySubject.create()");
    this.b = paramArrayOfByte;
  }
  
  public long a()
    throws IOException
  {
    return this.c.length;
  }
  
  public final void a(int paramInt)
  {
    if (Soa.a.a(paramInt)) {
      Soa.a.a();
    }
  }
  
  /* Error */
  public void a(kab paramkab)
    throws IOException
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 64
    //   3: invokestatic 24	oXa:b	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: getfield 29	xia:c	[B
    //   10: astore_2
    //   11: aload_2
    //   12: arraylength
    //   13: istore_3
    //   14: aload_0
    //   15: getfield 31	xia:a	I
    //   18: newarray <illegal type>
    //   20: astore 4
    //   22: new 66	java/io/ByteArrayInputStream
    //   25: dup
    //   26: aload_2
    //   27: invokespecial 68	java/io/ByteArrayInputStream:<init>	([B)V
    //   30: astore_2
    //   31: aload_2
    //   32: aload 4
    //   34: invokevirtual 72	java/io/ByteArrayInputStream:read	([B)I
    //   37: istore 5
    //   39: iconst_0
    //   40: istore 6
    //   42: iload 5
    //   44: iconst_m1
    //   45: if_icmpeq +65 -> 110
    //   48: aload_0
    //   49: getfield 43	xia:b	LHVa;
    //   52: astore 7
    //   54: new 74	tia
    //   57: astore 8
    //   59: aload 8
    //   61: iload 6
    //   63: iload_3
    //   64: invokespecial 77	tia:<init>	(II)V
    //   67: aload 7
    //   69: aload 8
    //   71: invokevirtual 80	HVa:a	(Ljava/lang/Object;)V
    //   74: aload_0
    //   75: iload 5
    //   77: invokevirtual 82	xia:a	(I)V
    //   80: iload 6
    //   82: iload 5
    //   84: iadd
    //   85: istore 6
    //   87: aload_1
    //   88: aload 4
    //   90: iconst_0
    //   91: iload 5
    //   93: invokeinterface 88 4 0
    //   98: pop
    //   99: aload_2
    //   100: aload 4
    //   102: invokevirtual 72	java/io/ByteArrayInputStream:read	([B)I
    //   105: istore 5
    //   107: goto -65 -> 42
    //   110: aload_0
    //   111: getfield 43	xia:b	LHVa;
    //   114: invokevirtual 89	HVa:a	()V
    //   117: goto +16 -> 133
    //   120: astore_1
    //   121: goto +17 -> 138
    //   124: astore_1
    //   125: aload_0
    //   126: getfield 43	xia:b	LHVa;
    //   129: aload_1
    //   130: invokevirtual 92	HVa:a	(Ljava/lang/Throwable;)V
    //   133: aload_2
    //   134: invokevirtual 95	java/io/ByteArrayInputStream:close	()V
    //   137: return
    //   138: aload_2
    //   139: invokevirtual 95	java/io/ByteArrayInputStream:close	()V
    //   142: aload_1
    //   143: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	144	0	this	xia
    //   0	144	1	paramkab	kab
    //   10	129	2	localObject	Object
    //   13	51	3	i	int
    //   20	81	4	arrayOfByte	byte[]
    //   37	69	5	j	int
    //   40	46	6	k	int
    //   52	16	7	localHVa	HVa
    //   57	13	8	localtia	tia
    // Exception table:
    //   from	to	target	type
    //   31	39	120	finally
    //   48	80	120	finally
    //   87	107	120	finally
    //   110	117	120	finally
    //   125	133	120	finally
    //   31	39	124	java/lang/Exception
    //   48	80	124	java/lang/Exception
    //   87	107	124	java/lang/Exception
    //   110	117	124	java/lang/Exception
  }
  
  public rZa b()
  {
    rZa localrZa = rZa.a("image/jpeg");
    oXa.a(localrZa, "MediaType.get(\"image/jpeg\")");
    return localrZa;
  }
  
  public final QQa<tia> e()
  {
    QQa localQQa = FaceApplication.d.c().a(wia.a);
    localQQa = this.b.i().e(localQQa).b(via.a);
    oXa.a(localQQa, "progressSubject.hide()\n …tyError\n                }");
    return localQQa;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */