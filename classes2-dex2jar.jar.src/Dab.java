class dab
  implements Dab
{
  dab(fab paramfab, Dab paramDab) {}
  
  /* Error */
  public void a(jab paramjab, long paramLong)
    throws java.io.IOException
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 33	jab:c	J
    //   4: lconst_0
    //   5: lload_2
    //   6: invokestatic 38	Hab:a	(JJJ)V
    //   9: lconst_0
    //   10: lstore 4
    //   12: lload_2
    //   13: lconst_0
    //   14: lcmp
    //   15: ifle +121 -> 136
    //   18: aload_1
    //   19: getfield 41	jab:b	LAab;
    //   22: astore 6
    //   24: lload 4
    //   26: lstore 7
    //   28: lload 4
    //   30: ldc2_w 42
    //   33: lcmp
    //   34: ifge +43 -> 77
    //   37: lload 4
    //   39: aload 6
    //   41: getfield 48	Aab:c	I
    //   44: aload 6
    //   46: getfield 50	Aab:b	I
    //   49: isub
    //   50: i2l
    //   51: ladd
    //   52: lstore 4
    //   54: lload 4
    //   56: lload_2
    //   57: lcmp
    //   58: iflt +9 -> 67
    //   61: lload_2
    //   62: lstore 7
    //   64: goto +13 -> 77
    //   67: aload 6
    //   69: getfield 53	Aab:f	LAab;
    //   72: astore 6
    //   74: goto -50 -> 24
    //   77: aload_0
    //   78: getfield 18	dab:b	Lfab;
    //   81: invokevirtual 56	fab:h	()V
    //   84: aload_0
    //   85: getfield 20	dab:a	LDab;
    //   88: aload_1
    //   89: lload 7
    //   91: invokeinterface 58 4 0
    //   96: lload_2
    //   97: lload 7
    //   99: lsub
    //   100: lstore_2
    //   101: aload_0
    //   102: getfield 18	dab:b	Lfab;
    //   105: iconst_1
    //   106: invokevirtual 61	fab:a	(Z)V
    //   109: goto -100 -> 9
    //   112: astore_1
    //   113: goto +13 -> 126
    //   116: astore_1
    //   117: aload_0
    //   118: getfield 18	dab:b	Lfab;
    //   121: aload_1
    //   122: invokevirtual 64	fab:a	(Ljava/io/IOException;)Ljava/io/IOException;
    //   125: athrow
    //   126: aload_0
    //   127: getfield 18	dab:b	Lfab;
    //   130: iconst_0
    //   131: invokevirtual 61	fab:a	(Z)V
    //   134: aload_1
    //   135: athrow
    //   136: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	dab
    //   0	137	1	paramjab	jab
    //   0	137	2	paramLong	long
    //   10	45	4	l1	long
    //   22	51	6	localAab	Aab
    //   26	72	7	l2	long
    // Exception table:
    //   from	to	target	type
    //   84	96	112	finally
    //   117	126	112	finally
    //   84	96	116	java/io/IOException
  }
  
  /* Error */
  public void close()
    throws java.io.IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 18	dab:b	Lfab;
    //   4: invokevirtual 56	fab:h	()V
    //   7: aload_0
    //   8: getfield 20	dab:a	LDab;
    //   11: invokeinterface 68 1 0
    //   16: aload_0
    //   17: getfield 18	dab:b	Lfab;
    //   20: iconst_1
    //   21: invokevirtual 61	fab:a	(Z)V
    //   24: return
    //   25: astore_1
    //   26: goto +13 -> 39
    //   29: astore_1
    //   30: aload_0
    //   31: getfield 18	dab:b	Lfab;
    //   34: aload_1
    //   35: invokevirtual 64	fab:a	(Ljava/io/IOException;)Ljava/io/IOException;
    //   38: athrow
    //   39: aload_0
    //   40: getfield 18	dab:b	Lfab;
    //   43: iconst_0
    //   44: invokevirtual 61	fab:a	(Z)V
    //   47: aload_1
    //   48: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	dab
    //   25	1	1	localObject	Object
    //   29	19	1	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   7	16	25	finally
    //   30	39	25	finally
    //   7	16	29	java/io/IOException
  }
  
  /* Error */
  public void flush()
    throws java.io.IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 18	dab:b	Lfab;
    //   4: invokevirtual 56	fab:h	()V
    //   7: aload_0
    //   8: getfield 20	dab:a	LDab;
    //   11: invokeinterface 71 1 0
    //   16: aload_0
    //   17: getfield 18	dab:b	Lfab;
    //   20: iconst_1
    //   21: invokevirtual 61	fab:a	(Z)V
    //   24: return
    //   25: astore_1
    //   26: goto +13 -> 39
    //   29: astore_1
    //   30: aload_0
    //   31: getfield 18	dab:b	Lfab;
    //   34: aload_1
    //   35: invokevirtual 64	fab:a	(Ljava/io/IOException;)Ljava/io/IOException;
    //   38: athrow
    //   39: aload_0
    //   40: getfield 18	dab:b	Lfab;
    //   43: iconst_0
    //   44: invokevirtual 61	fab:a	(Z)V
    //   47: aload_1
    //   48: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	dab
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
    localStringBuilder.append("AsyncTimeout.sink(");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */