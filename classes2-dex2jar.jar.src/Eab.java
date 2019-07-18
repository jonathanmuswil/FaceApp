class eab
  implements Eab
{
  eab(fab paramfab, Eab paramEab) {}
  
  /* Error */
  public long b(jab paramjab, long paramLong)
    throws java.io.IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 18	eab:b	Lfab;
    //   4: invokevirtual 30	fab:h	()V
    //   7: aload_0
    //   8: getfield 20	eab:a	LEab;
    //   11: aload_1
    //   12: lload_2
    //   13: invokeinterface 32 4 0
    //   18: lstore_2
    //   19: aload_0
    //   20: getfield 18	eab:b	Lfab;
    //   23: iconst_1
    //   24: invokevirtual 35	fab:a	(Z)V
    //   27: lload_2
    //   28: lreturn
    //   29: astore_1
    //   30: goto +13 -> 43
    //   33: astore_1
    //   34: aload_0
    //   35: getfield 18	eab:b	Lfab;
    //   38: aload_1
    //   39: invokevirtual 38	fab:a	(Ljava/io/IOException;)Ljava/io/IOException;
    //   42: athrow
    //   43: aload_0
    //   44: getfield 18	eab:b	Lfab;
    //   47: iconst_0
    //   48: invokevirtual 35	fab:a	(Z)V
    //   51: aload_1
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	eab
    //   0	53	1	paramjab	jab
    //   0	53	2	paramLong	long
    // Exception table:
    //   from	to	target	type
    //   7	19	29	finally
    //   34	43	29	finally
    //   7	19	33	java/io/IOException
  }
  
  /* Error */
  public void close()
    throws java.io.IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 18	eab:b	Lfab;
    //   4: invokevirtual 30	fab:h	()V
    //   7: aload_0
    //   8: getfield 20	eab:a	LEab;
    //   11: invokeinterface 42 1 0
    //   16: aload_0
    //   17: getfield 18	eab:b	Lfab;
    //   20: iconst_1
    //   21: invokevirtual 35	fab:a	(Z)V
    //   24: return
    //   25: astore_1
    //   26: goto +13 -> 39
    //   29: astore_1
    //   30: aload_0
    //   31: getfield 18	eab:b	Lfab;
    //   34: aload_1
    //   35: invokevirtual 38	fab:a	(Ljava/io/IOException;)Ljava/io/IOException;
    //   38: athrow
    //   39: aload_0
    //   40: getfield 18	eab:b	Lfab;
    //   43: iconst_0
    //   44: invokevirtual 35	fab:a	(Z)V
    //   47: aload_1
    //   48: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	eab
    //   25	1	1	localObject	Object
    //   29	19	1	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   7	16	25	finally
    //   30	39	25	finally
    //   7	16	29	java/io/IOException
  }
  
  public Gab n()
  {
    return this.b;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AsyncTimeout.source(");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/eab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */