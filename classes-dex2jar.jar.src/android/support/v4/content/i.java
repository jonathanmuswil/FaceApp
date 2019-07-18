package android.support.v4.content;

class i
  extends l.d<Params, Result>
{
  i(l paraml) {}
  
  /* Error */
  public Result call()
    throws java.lang.Exception
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 15	android/support/v4/content/i:b	Landroid/support/v4/content/l;
    //   4: getfield 27	android/support/v4/content/l:j	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   7: iconst_1
    //   8: invokevirtual 33	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   11: aconst_null
    //   12: astore_1
    //   13: aconst_null
    //   14: astore_2
    //   15: aload_2
    //   16: astore_3
    //   17: aload_1
    //   18: astore 4
    //   20: bipush 10
    //   22: invokestatic 39	android/os/Process:setThreadPriority	(I)V
    //   25: aload_2
    //   26: astore_3
    //   27: aload_1
    //   28: astore 4
    //   30: aload_0
    //   31: getfield 15	android/support/v4/content/i:b	Landroid/support/v4/content/l;
    //   34: aload_0
    //   35: getfield 43	android/support/v4/content/l$d:a	[Ljava/lang/Object;
    //   38: invokevirtual 46	android/support/v4/content/l:a	([Ljava/lang/Object;)Ljava/lang/Object;
    //   41: astore_2
    //   42: aload_2
    //   43: astore_3
    //   44: aload_2
    //   45: astore 4
    //   47: invokestatic 51	android/os/Binder:flushPendingCommands	()V
    //   50: aload_0
    //   51: getfield 15	android/support/v4/content/i:b	Landroid/support/v4/content/l;
    //   54: aload_2
    //   55: invokevirtual 55	android/support/v4/content/l:d	(Ljava/lang/Object;)Ljava/lang/Object;
    //   58: pop
    //   59: aload_2
    //   60: areturn
    //   61: astore 4
    //   63: goto +23 -> 86
    //   66: astore_2
    //   67: aload 4
    //   69: astore_3
    //   70: aload_0
    //   71: getfield 15	android/support/v4/content/i:b	Landroid/support/v4/content/l;
    //   74: getfield 58	android/support/v4/content/l:i	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   77: iconst_1
    //   78: invokevirtual 33	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   81: aload 4
    //   83: astore_3
    //   84: aload_2
    //   85: athrow
    //   86: aload_0
    //   87: getfield 15	android/support/v4/content/i:b	Landroid/support/v4/content/l;
    //   90: aload_3
    //   91: invokevirtual 55	android/support/v4/content/l:d	(Ljava/lang/Object;)Ljava/lang/Object;
    //   94: pop
    //   95: aload 4
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	i
    //   12	16	1	localObject1	Object
    //   14	46	2	localObject2	Object
    //   66	19	2	localThrowable	Throwable
    //   16	75	3	localObject3	Object
    //   18	28	4	localObject4	Object
    //   61	35	4	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   20	25	61	finally
    //   30	42	61	finally
    //   47	50	61	finally
    //   70	81	61	finally
    //   84	86	61	finally
    //   20	25	66	java/lang/Throwable
    //   30	42	66	java/lang/Throwable
    //   47	50	66	java/lang/Throwable
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/content/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */