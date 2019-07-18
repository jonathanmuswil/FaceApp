package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;

public final class r
  extends Db
{
  private final s c = new s(this, getContext(), "google_app_measurement_local.db");
  private boolean d;
  
  r(aa paramaa)
  {
    super(paramaa);
  }
  
  private final SQLiteDatabase B()
    throws SQLiteException
  {
    if (this.d) {
      return null;
    }
    SQLiteDatabase localSQLiteDatabase = this.c.getWritableDatabase();
    if (localSQLiteDatabase == null)
    {
      this.d = true;
      return null;
    }
    return localSQLiteDatabase;
  }
  
  /* Error */
  private final boolean a(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 46	com/google/android/gms/measurement/internal/r:h	()V
    //   4: aload_0
    //   5: invokevirtual 49	com/google/android/gms/measurement/internal/r:j	()V
    //   8: aload_0
    //   9: getfield 32	com/google/android/gms/measurement/internal/r:d	Z
    //   12: ifeq +5 -> 17
    //   15: iconst_0
    //   16: ireturn
    //   17: new 51	android/content/ContentValues
    //   20: dup
    //   21: invokespecial 53	android/content/ContentValues:<init>	()V
    //   24: astore_3
    //   25: aload_3
    //   26: ldc 55
    //   28: iload_1
    //   29: invokestatic 61	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   32: invokevirtual 65	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   35: aload_3
    //   36: ldc 67
    //   38: aload_2
    //   39: invokevirtual 70	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   42: iconst_0
    //   43: istore 4
    //   45: iconst_5
    //   46: istore 5
    //   48: iload 4
    //   50: iconst_5
    //   51: if_icmpge +571 -> 622
    //   54: aconst_null
    //   55: astore 6
    //   57: aconst_null
    //   58: astore 7
    //   60: aconst_null
    //   61: astore 8
    //   63: aconst_null
    //   64: astore 9
    //   66: aload_0
    //   67: invokespecial 72	com/google/android/gms/measurement/internal/r:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   70: astore_2
    //   71: aload_2
    //   72: ifnonnull +34 -> 106
    //   75: aload_2
    //   76: astore 9
    //   78: aload_0
    //   79: iconst_1
    //   80: putfield 32	com/google/android/gms/measurement/internal/r:d	Z
    //   83: aload_2
    //   84: ifnull +7 -> 91
    //   87: aload_2
    //   88: invokevirtual 77	android/database/sqlite/SQLiteDatabase:close	()V
    //   91: iconst_0
    //   92: ireturn
    //   93: astore 9
    //   95: aconst_null
    //   96: astore 8
    //   98: goto +244 -> 342
    //   101: astore 6
    //   103: goto +415 -> 518
    //   106: aload_2
    //   107: invokevirtual 80	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   110: lconst_0
    //   111: lstore 10
    //   113: aload_2
    //   114: ldc 82
    //   116: aconst_null
    //   117: invokevirtual 86	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   120: astore 8
    //   122: lload 10
    //   124: lstore 12
    //   126: aload 8
    //   128: ifnull +55 -> 183
    //   131: lload 10
    //   133: lstore 12
    //   135: aload 8
    //   137: invokeinterface 92 1 0
    //   142: ifeq +41 -> 183
    //   145: aload 8
    //   147: iconst_0
    //   148: invokeinterface 96 2 0
    //   153: lstore 12
    //   155: goto +28 -> 183
    //   158: astore 9
    //   160: aload_2
    //   161: astore 6
    //   163: aload 8
    //   165: astore_2
    //   166: goto +433 -> 599
    //   169: astore 9
    //   171: goto +171 -> 342
    //   174: astore 6
    //   176: aload 8
    //   178: astore 7
    //   180: goto +338 -> 518
    //   183: lload 12
    //   185: ldc2_w 97
    //   188: lcmp
    //   189: iflt +86 -> 275
    //   192: aload_0
    //   193: invokevirtual 101	com/google/android/gms/measurement/internal/r:c	()Lcom/google/android/gms/measurement/internal/v;
    //   196: invokevirtual 107	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   199: ldc 109
    //   201: invokevirtual 114	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;)V
    //   204: ldc2_w 97
    //   207: lload 12
    //   209: lsub
    //   210: lconst_1
    //   211: ladd
    //   212: lstore 12
    //   214: aload_2
    //   215: ldc 116
    //   217: ldc 118
    //   219: iconst_1
    //   220: anewarray 120	java/lang/String
    //   223: dup
    //   224: iconst_0
    //   225: lload 12
    //   227: invokestatic 126	java/lang/Long:toString	(J)Ljava/lang/String;
    //   230: aastore
    //   231: invokevirtual 130	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   234: i2l
    //   235: lstore 10
    //   237: lload 10
    //   239: lload 12
    //   241: lcmp
    //   242: ifeq +33 -> 275
    //   245: aload_0
    //   246: invokevirtual 101	com/google/android/gms/measurement/internal/r:c	()Lcom/google/android/gms/measurement/internal/v;
    //   249: invokevirtual 107	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   252: ldc -124
    //   254: lload 12
    //   256: invokestatic 135	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   259: lload 10
    //   261: invokestatic 135	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   264: lload 12
    //   266: lload 10
    //   268: lsub
    //   269: invokestatic 135	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   272: invokevirtual 138	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   275: aload_2
    //   276: ldc 116
    //   278: aconst_null
    //   279: aload_3
    //   280: invokevirtual 142	android/database/sqlite/SQLiteDatabase:insertOrThrow	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   283: pop2
    //   284: aload_2
    //   285: invokevirtual 145	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   288: aload_2
    //   289: invokevirtual 148	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   292: aload 8
    //   294: ifnull +10 -> 304
    //   297: aload 8
    //   299: invokeinterface 149 1 0
    //   304: aload_2
    //   305: ifnull +7 -> 312
    //   308: aload_2
    //   309: invokevirtual 77	android/database/sqlite/SQLiteDatabase:close	()V
    //   312: iconst_1
    //   313: ireturn
    //   314: astore 9
    //   316: aload 8
    //   318: astore 6
    //   320: goto +145 -> 465
    //   323: astore 9
    //   325: aconst_null
    //   326: astore 8
    //   328: aload_2
    //   329: astore 6
    //   331: aload 8
    //   333: astore_2
    //   334: goto +265 -> 599
    //   337: astore 9
    //   339: aconst_null
    //   340: astore 8
    //   342: aload 9
    //   344: astore 6
    //   346: aload_2
    //   347: astore 9
    //   349: aload 8
    //   351: astore_2
    //   352: goto +31 -> 383
    //   355: astore 9
    //   357: aconst_null
    //   358: astore 6
    //   360: goto +105 -> 465
    //   363: astore 6
    //   365: goto +153 -> 518
    //   368: astore 9
    //   370: aconst_null
    //   371: astore 6
    //   373: aload 6
    //   375: astore_2
    //   376: goto +223 -> 599
    //   379: astore 6
    //   381: aconst_null
    //   382: astore_2
    //   383: aload 9
    //   385: ifnull +16 -> 401
    //   388: aload 9
    //   390: invokevirtual 152	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   393: ifeq +8 -> 401
    //   396: aload 9
    //   398: invokevirtual 148	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   401: aload_0
    //   402: invokevirtual 101	com/google/android/gms/measurement/internal/r:c	()Lcom/google/android/gms/measurement/internal/v;
    //   405: invokevirtual 107	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   408: ldc -102
    //   410: aload 6
    //   412: invokevirtual 157	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   415: aload_0
    //   416: iconst_1
    //   417: putfield 32	com/google/android/gms/measurement/internal/r:d	Z
    //   420: aload_2
    //   421: ifnull +9 -> 430
    //   424: aload_2
    //   425: invokeinterface 149 1 0
    //   430: iload 5
    //   432: istore_1
    //   433: aload 9
    //   435: ifnull +142 -> 577
    //   438: aload 9
    //   440: invokevirtual 77	android/database/sqlite/SQLiteDatabase:close	()V
    //   443: iload 5
    //   445: istore_1
    //   446: goto +131 -> 577
    //   449: astore 8
    //   451: aload 9
    //   453: astore 6
    //   455: aload 8
    //   457: astore 9
    //   459: goto +140 -> 599
    //   462: astore_2
    //   463: aconst_null
    //   464: astore_2
    //   465: iload 5
    //   467: i2l
    //   468: lstore 12
    //   470: aload 6
    //   472: astore 8
    //   474: aload_2
    //   475: astore 9
    //   477: lload 12
    //   479: invokestatic 163	android/os/SystemClock:sleep	(J)V
    //   482: iinc 5 20
    //   485: aload 6
    //   487: ifnull +10 -> 497
    //   490: aload 6
    //   492: invokeinterface 149 1 0
    //   497: iload 5
    //   499: istore_1
    //   500: aload_2
    //   501: ifnull +76 -> 577
    //   504: aload_2
    //   505: invokevirtual 77	android/database/sqlite/SQLiteDatabase:close	()V
    //   508: iload 5
    //   510: istore_1
    //   511: goto +66 -> 577
    //   514: astore 6
    //   516: aconst_null
    //   517: astore_2
    //   518: aload 7
    //   520: astore 8
    //   522: aload_2
    //   523: astore 9
    //   525: aload_0
    //   526: invokevirtual 101	com/google/android/gms/measurement/internal/r:c	()Lcom/google/android/gms/measurement/internal/v;
    //   529: invokevirtual 107	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   532: ldc -102
    //   534: aload 6
    //   536: invokevirtual 157	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   539: aload 7
    //   541: astore 8
    //   543: aload_2
    //   544: astore 9
    //   546: aload_0
    //   547: iconst_1
    //   548: putfield 32	com/google/android/gms/measurement/internal/r:d	Z
    //   551: aload 7
    //   553: ifnull +10 -> 563
    //   556: aload 7
    //   558: invokeinterface 149 1 0
    //   563: iload 5
    //   565: istore_1
    //   566: aload_2
    //   567: ifnull +10 -> 577
    //   570: aload_2
    //   571: invokevirtual 77	android/database/sqlite/SQLiteDatabase:close	()V
    //   574: iload 5
    //   576: istore_1
    //   577: iinc 4 1
    //   580: iload_1
    //   581: istore 5
    //   583: goto -535 -> 48
    //   586: astore 7
    //   588: aload 8
    //   590: astore_2
    //   591: aload 9
    //   593: astore 6
    //   595: aload 7
    //   597: astore 9
    //   599: aload_2
    //   600: ifnull +9 -> 609
    //   603: aload_2
    //   604: invokeinterface 149 1 0
    //   609: aload 6
    //   611: ifnull +8 -> 619
    //   614: aload 6
    //   616: invokevirtual 77	android/database/sqlite/SQLiteDatabase:close	()V
    //   619: aload 9
    //   621: athrow
    //   622: aload_0
    //   623: invokevirtual 101	com/google/android/gms/measurement/internal/r:c	()Lcom/google/android/gms/measurement/internal/v;
    //   626: invokevirtual 166	com/google/android/gms/measurement/internal/v:v	()Lcom/google/android/gms/measurement/internal/x;
    //   629: ldc -88
    //   631: invokevirtual 114	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;)V
    //   634: iconst_0
    //   635: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	636	0	this	r
    //   0	636	1	paramInt	int
    //   0	636	2	paramArrayOfByte	byte[]
    //   24	256	3	localContentValues	android.content.ContentValues
    //   43	535	4	i	int
    //   46	536	5	j	int
    //   55	1	6	localObject1	Object
    //   101	1	6	localSQLiteFullException1	android.database.sqlite.SQLiteFullException
    //   161	1	6	arrayOfByte1	byte[]
    //   174	1	6	localSQLiteFullException2	android.database.sqlite.SQLiteFullException
    //   318	41	6	localObject2	Object
    //   363	1	6	localSQLiteFullException3	android.database.sqlite.SQLiteFullException
    //   371	3	6	localObject3	Object
    //   379	32	6	localSQLiteException1	SQLiteException
    //   453	38	6	localObject4	Object
    //   514	21	6	localSQLiteFullException4	android.database.sqlite.SQLiteFullException
    //   593	22	6	localObject5	Object
    //   58	499	7	localObject6	Object
    //   586	10	7	localObject7	Object
    //   61	289	8	localCursor	android.database.Cursor
    //   449	7	8	localObject8	Object
    //   472	117	8	localObject9	Object
    //   64	13	9	arrayOfByte2	byte[]
    //   93	1	9	localSQLiteException2	SQLiteException
    //   158	1	9	localObject10	Object
    //   169	1	9	localSQLiteException3	SQLiteException
    //   314	1	9	localSQLiteDatabaseLockedException1	android.database.sqlite.SQLiteDatabaseLockedException
    //   323	1	9	localObject11	Object
    //   337	6	9	localSQLiteException4	SQLiteException
    //   347	1	9	arrayOfByte3	byte[]
    //   355	1	9	localSQLiteDatabaseLockedException2	android.database.sqlite.SQLiteDatabaseLockedException
    //   368	84	9	localObject12	Object
    //   457	163	9	localObject13	Object
    //   111	156	10	l1	long
    //   124	354	12	l2	long
    // Exception table:
    //   from	to	target	type
    //   78	83	93	android/database/sqlite/SQLiteException
    //   78	83	101	android/database/sqlite/SQLiteFullException
    //   135	155	158	finally
    //   192	204	158	finally
    //   214	237	158	finally
    //   245	275	158	finally
    //   275	292	158	finally
    //   135	155	169	android/database/sqlite/SQLiteException
    //   192	204	169	android/database/sqlite/SQLiteException
    //   214	237	169	android/database/sqlite/SQLiteException
    //   245	275	169	android/database/sqlite/SQLiteException
    //   275	292	169	android/database/sqlite/SQLiteException
    //   135	155	174	android/database/sqlite/SQLiteFullException
    //   192	204	174	android/database/sqlite/SQLiteFullException
    //   214	237	174	android/database/sqlite/SQLiteFullException
    //   245	275	174	android/database/sqlite/SQLiteFullException
    //   275	292	174	android/database/sqlite/SQLiteFullException
    //   135	155	314	android/database/sqlite/SQLiteDatabaseLockedException
    //   192	204	314	android/database/sqlite/SQLiteDatabaseLockedException
    //   214	237	314	android/database/sqlite/SQLiteDatabaseLockedException
    //   245	275	314	android/database/sqlite/SQLiteDatabaseLockedException
    //   275	292	314	android/database/sqlite/SQLiteDatabaseLockedException
    //   106	110	323	finally
    //   113	122	323	finally
    //   106	110	337	android/database/sqlite/SQLiteException
    //   113	122	337	android/database/sqlite/SQLiteException
    //   78	83	355	android/database/sqlite/SQLiteDatabaseLockedException
    //   106	110	355	android/database/sqlite/SQLiteDatabaseLockedException
    //   113	122	355	android/database/sqlite/SQLiteDatabaseLockedException
    //   106	110	363	android/database/sqlite/SQLiteFullException
    //   113	122	363	android/database/sqlite/SQLiteFullException
    //   66	71	368	finally
    //   66	71	379	android/database/sqlite/SQLiteException
    //   388	401	449	finally
    //   401	420	449	finally
    //   66	71	462	android/database/sqlite/SQLiteDatabaseLockedException
    //   66	71	514	android/database/sqlite/SQLiteFullException
    //   78	83	586	finally
    //   477	482	586	finally
    //   525	539	586	finally
    //   546	551	586	finally
  }
  
  public final void A()
  {
    h();
    j();
    try
    {
      int i = B().delete("messages", null, null) + 0;
      if (i > 0) {
        c().A().a("Reset local analytics data. records", Integer.valueOf(i));
      }
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      c().s().a("Error resetting local analytics data. error", localSQLiteException);
    }
  }
  
  /* Error */
  public final java.util.List<fq> a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 49	com/google/android/gms/measurement/internal/r:j	()V
    //   4: aload_0
    //   5: invokevirtual 46	com/google/android/gms/measurement/internal/r:h	()V
    //   8: aload_0
    //   9: getfield 32	com/google/android/gms/measurement/internal/r:d	Z
    //   12: ifeq +5 -> 17
    //   15: aconst_null
    //   16: areturn
    //   17: new 185	java/util/ArrayList
    //   20: dup
    //   21: invokespecial 186	java/util/ArrayList:<init>	()V
    //   24: astore_2
    //   25: aload_0
    //   26: invokevirtual 18	com/google/android/gms/measurement/internal/r:getContext	()Landroid/content/Context;
    //   29: ldc 20
    //   31: invokevirtual 192	android/content/Context:getDatabasePath	(Ljava/lang/String;)Ljava/io/File;
    //   34: invokevirtual 197	java/io/File:exists	()Z
    //   37: ifne +5 -> 42
    //   40: aload_2
    //   41: areturn
    //   42: iconst_0
    //   43: istore_1
    //   44: iconst_5
    //   45: istore_3
    //   46: iload_1
    //   47: iconst_5
    //   48: if_icmpge +1206 -> 1254
    //   51: aload_0
    //   52: invokespecial 72	com/google/android/gms/measurement/internal/r:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   55: astore 4
    //   57: aload 4
    //   59: ifnonnull +64 -> 123
    //   62: aload_0
    //   63: iconst_1
    //   64: putfield 32	com/google/android/gms/measurement/internal/r:d	Z
    //   67: aload 4
    //   69: ifnull +8 -> 77
    //   72: aload 4
    //   74: invokevirtual 77	android/database/sqlite/SQLiteDatabase:close	()V
    //   77: aconst_null
    //   78: areturn
    //   79: astore 5
    //   81: aconst_null
    //   82: astore 6
    //   84: aload 4
    //   86: astore 7
    //   88: aload 5
    //   90: astore 4
    //   92: aload 6
    //   94: astore 5
    //   96: goto +1133 -> 1229
    //   99: astore 8
    //   101: aconst_null
    //   102: astore 6
    //   104: aload 4
    //   106: astore 7
    //   108: goto +868 -> 976
    //   111: astore 8
    //   113: aconst_null
    //   114: astore 6
    //   116: aload 4
    //   118: astore 7
    //   120: goto +1026 -> 1146
    //   123: aload 4
    //   125: invokevirtual 80	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   128: bipush 100
    //   130: invokestatic 200	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   133: astore 5
    //   135: aload 4
    //   137: astore 7
    //   139: aload 4
    //   141: ldc 116
    //   143: iconst_3
    //   144: anewarray 120	java/lang/String
    //   147: dup
    //   148: iconst_0
    //   149: ldc -54
    //   151: aastore
    //   152: dup
    //   153: iconst_1
    //   154: ldc 55
    //   156: aastore
    //   157: dup
    //   158: iconst_2
    //   159: ldc 67
    //   161: aastore
    //   162: aconst_null
    //   163: aconst_null
    //   164: aconst_null
    //   165: aconst_null
    //   166: ldc -52
    //   168: aload 5
    //   170: invokevirtual 208	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   173: astore 6
    //   175: ldc2_w 209
    //   178: lstore 9
    //   180: aload 7
    //   182: astore 4
    //   184: aload 6
    //   186: astore 5
    //   188: aload 6
    //   190: invokeinterface 213 1 0
    //   195: ifeq +565 -> 760
    //   198: aload 7
    //   200: astore 4
    //   202: aload 6
    //   204: astore 5
    //   206: aload 6
    //   208: iconst_0
    //   209: invokeinterface 96 2 0
    //   214: lstore 11
    //   216: aload 7
    //   218: astore 4
    //   220: aload 6
    //   222: astore 5
    //   224: aload 6
    //   226: iconst_1
    //   227: invokeinterface 217 2 0
    //   232: istore 13
    //   234: aload 7
    //   236: astore 4
    //   238: aload 6
    //   240: astore 5
    //   242: aload 6
    //   244: iconst_2
    //   245: invokeinterface 221 2 0
    //   250: astore 14
    //   252: iload 13
    //   254: ifne +158 -> 412
    //   257: aload 7
    //   259: astore 4
    //   261: aload 6
    //   263: astore 5
    //   265: invokestatic 227	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   268: astore 8
    //   270: aload 8
    //   272: aload 14
    //   274: iconst_0
    //   275: aload 14
    //   277: arraylength
    //   278: invokevirtual 231	android/os/Parcel:unmarshall	([BII)V
    //   281: aload 8
    //   283: iconst_0
    //   284: invokevirtual 235	android/os/Parcel:setDataPosition	(I)V
    //   287: getstatic 241	com/google/android/gms/measurement/internal/k:CREATOR	Landroid/os/Parcelable$Creator;
    //   290: aload 8
    //   292: invokeinterface 247 2 0
    //   297: checkcast 237	com/google/android/gms/measurement/internal/k
    //   300: astore 15
    //   302: aload 7
    //   304: astore 4
    //   306: aload 6
    //   308: astore 5
    //   310: aload 8
    //   312: invokevirtual 250	android/os/Parcel:recycle	()V
    //   315: lload 11
    //   317: lstore 9
    //   319: aload 15
    //   321: ifnull -141 -> 180
    //   324: aload 7
    //   326: astore 4
    //   328: aload 6
    //   330: astore 5
    //   332: aload_2
    //   333: aload 15
    //   335: invokeinterface 256 2 0
    //   340: pop
    //   341: lload 11
    //   343: lstore 9
    //   345: goto -165 -> 180
    //   348: astore 15
    //   350: goto +38 -> 388
    //   353: astore 4
    //   355: aload_0
    //   356: invokevirtual 101	com/google/android/gms/measurement/internal/r:c	()Lcom/google/android/gms/measurement/internal/v;
    //   359: invokevirtual 107	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   362: ldc_w 258
    //   365: invokevirtual 114	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;)V
    //   368: aload 7
    //   370: astore 4
    //   372: aload 6
    //   374: astore 5
    //   376: aload 8
    //   378: invokevirtual 250	android/os/Parcel:recycle	()V
    //   381: lload 11
    //   383: lstore 9
    //   385: goto -205 -> 180
    //   388: aload 7
    //   390: astore 4
    //   392: aload 6
    //   394: astore 5
    //   396: aload 8
    //   398: invokevirtual 250	android/os/Parcel:recycle	()V
    //   401: aload 7
    //   403: astore 4
    //   405: aload 6
    //   407: astore 5
    //   409: aload 15
    //   411: athrow
    //   412: iload 13
    //   414: iconst_1
    //   415: if_icmpne +157 -> 572
    //   418: aload 7
    //   420: astore 4
    //   422: aload 6
    //   424: astore 5
    //   426: invokestatic 227	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   429: astore 15
    //   431: aload 15
    //   433: aload 14
    //   435: iconst_0
    //   436: aload 14
    //   438: arraylength
    //   439: invokevirtual 231	android/os/Parcel:unmarshall	([BII)V
    //   442: aload 15
    //   444: iconst_0
    //   445: invokevirtual 235	android/os/Parcel:setDataPosition	(I)V
    //   448: getstatic 261	com/google/android/gms/measurement/internal/ec:CREATOR	Landroid/os/Parcelable$Creator;
    //   451: aload 15
    //   453: invokeinterface 247 2 0
    //   458: checkcast 260	com/google/android/gms/measurement/internal/ec
    //   461: astore 8
    //   463: aload 7
    //   465: astore 4
    //   467: aload 6
    //   469: astore 5
    //   471: aload 15
    //   473: invokevirtual 250	android/os/Parcel:recycle	()V
    //   476: goto +39 -> 515
    //   479: astore 8
    //   481: goto +67 -> 548
    //   484: astore 4
    //   486: aload_0
    //   487: invokevirtual 101	com/google/android/gms/measurement/internal/r:c	()Lcom/google/android/gms/measurement/internal/v;
    //   490: invokevirtual 107	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   493: ldc_w 263
    //   496: invokevirtual 114	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;)V
    //   499: aload 7
    //   501: astore 4
    //   503: aload 6
    //   505: astore 5
    //   507: aload 15
    //   509: invokevirtual 250	android/os/Parcel:recycle	()V
    //   512: aconst_null
    //   513: astore 8
    //   515: lload 11
    //   517: lstore 9
    //   519: aload 8
    //   521: ifnull -341 -> 180
    //   524: aload 7
    //   526: astore 4
    //   528: aload 6
    //   530: astore 5
    //   532: aload_2
    //   533: aload 8
    //   535: invokeinterface 256 2 0
    //   540: pop
    //   541: lload 11
    //   543: lstore 9
    //   545: goto -365 -> 180
    //   548: aload 7
    //   550: astore 4
    //   552: aload 6
    //   554: astore 5
    //   556: aload 15
    //   558: invokevirtual 250	android/os/Parcel:recycle	()V
    //   561: aload 7
    //   563: astore 4
    //   565: aload 6
    //   567: astore 5
    //   569: aload 8
    //   571: athrow
    //   572: iload 13
    //   574: iconst_2
    //   575: if_icmpne +157 -> 732
    //   578: aload 7
    //   580: astore 4
    //   582: aload 6
    //   584: astore 5
    //   586: invokestatic 227	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   589: astore 15
    //   591: aload 15
    //   593: aload 14
    //   595: iconst_0
    //   596: aload 14
    //   598: arraylength
    //   599: invokevirtual 231	android/os/Parcel:unmarshall	([BII)V
    //   602: aload 15
    //   604: iconst_0
    //   605: invokevirtual 235	android/os/Parcel:setDataPosition	(I)V
    //   608: getstatic 266	com/google/android/gms/measurement/internal/uc:CREATOR	Landroid/os/Parcelable$Creator;
    //   611: aload 15
    //   613: invokeinterface 247 2 0
    //   618: checkcast 265	com/google/android/gms/measurement/internal/uc
    //   621: astore 8
    //   623: aload 7
    //   625: astore 4
    //   627: aload 6
    //   629: astore 5
    //   631: aload 15
    //   633: invokevirtual 250	android/os/Parcel:recycle	()V
    //   636: goto +39 -> 675
    //   639: astore 8
    //   641: goto +67 -> 708
    //   644: astore 4
    //   646: aload_0
    //   647: invokevirtual 101	com/google/android/gms/measurement/internal/r:c	()Lcom/google/android/gms/measurement/internal/v;
    //   650: invokevirtual 107	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   653: ldc_w 263
    //   656: invokevirtual 114	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;)V
    //   659: aload 7
    //   661: astore 4
    //   663: aload 6
    //   665: astore 5
    //   667: aload 15
    //   669: invokevirtual 250	android/os/Parcel:recycle	()V
    //   672: aconst_null
    //   673: astore 8
    //   675: lload 11
    //   677: lstore 9
    //   679: aload 8
    //   681: ifnull -501 -> 180
    //   684: aload 7
    //   686: astore 4
    //   688: aload 6
    //   690: astore 5
    //   692: aload_2
    //   693: aload 8
    //   695: invokeinterface 256 2 0
    //   700: pop
    //   701: lload 11
    //   703: lstore 9
    //   705: goto -525 -> 180
    //   708: aload 7
    //   710: astore 4
    //   712: aload 6
    //   714: astore 5
    //   716: aload 15
    //   718: invokevirtual 250	android/os/Parcel:recycle	()V
    //   721: aload 7
    //   723: astore 4
    //   725: aload 6
    //   727: astore 5
    //   729: aload 8
    //   731: athrow
    //   732: aload 7
    //   734: astore 4
    //   736: aload 6
    //   738: astore 5
    //   740: aload_0
    //   741: invokevirtual 101	com/google/android/gms/measurement/internal/r:c	()Lcom/google/android/gms/measurement/internal/v;
    //   744: invokevirtual 107	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   747: ldc_w 268
    //   750: invokevirtual 114	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;)V
    //   753: lload 11
    //   755: lstore 9
    //   757: goto -577 -> 180
    //   760: aload 7
    //   762: astore 4
    //   764: aload 6
    //   766: astore 5
    //   768: aload 7
    //   770: ldc 116
    //   772: ldc_w 270
    //   775: iconst_1
    //   776: anewarray 120	java/lang/String
    //   779: dup
    //   780: iconst_0
    //   781: lload 9
    //   783: invokestatic 126	java/lang/Long:toString	(J)Ljava/lang/String;
    //   786: aastore
    //   787: invokevirtual 130	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   790: aload_2
    //   791: invokeinterface 274 1 0
    //   796: if_icmpge +24 -> 820
    //   799: aload 7
    //   801: astore 4
    //   803: aload 6
    //   805: astore 5
    //   807: aload_0
    //   808: invokevirtual 101	com/google/android/gms/measurement/internal/r:c	()Lcom/google/android/gms/measurement/internal/v;
    //   811: invokevirtual 107	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   814: ldc_w 276
    //   817: invokevirtual 114	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;)V
    //   820: aload 7
    //   822: astore 4
    //   824: aload 6
    //   826: astore 5
    //   828: aload 7
    //   830: invokevirtual 145	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   833: aload 7
    //   835: astore 4
    //   837: aload 6
    //   839: astore 5
    //   841: aload 7
    //   843: invokevirtual 148	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   846: aload 6
    //   848: ifnull +10 -> 858
    //   851: aload 6
    //   853: invokeinterface 149 1 0
    //   858: aload 7
    //   860: ifnull +8 -> 868
    //   863: aload 7
    //   865: invokevirtual 77	android/database/sqlite/SQLiteDatabase:close	()V
    //   868: aload_2
    //   869: areturn
    //   870: astore 8
    //   872: goto +104 -> 976
    //   875: astore 8
    //   877: goto +269 -> 1146
    //   880: astore 7
    //   882: goto +15 -> 897
    //   885: astore 8
    //   887: goto +34 -> 921
    //   890: astore 8
    //   892: goto +53 -> 945
    //   895: astore 7
    //   897: aload 4
    //   899: astore 5
    //   901: aconst_null
    //   902: astore 6
    //   904: aload 7
    //   906: astore 4
    //   908: aload 5
    //   910: astore 7
    //   912: aload 6
    //   914: astore 5
    //   916: goto +313 -> 1229
    //   919: astore 8
    //   921: aconst_null
    //   922: astore 6
    //   924: aload 4
    //   926: astore 7
    //   928: goto +48 -> 976
    //   931: astore 7
    //   933: aconst_null
    //   934: astore 6
    //   936: aload 4
    //   938: astore 7
    //   940: goto +146 -> 1086
    //   943: astore 8
    //   945: aconst_null
    //   946: astore 6
    //   948: aload 4
    //   950: astore 7
    //   952: goto +194 -> 1146
    //   955: astore 4
    //   957: aconst_null
    //   958: astore 7
    //   960: aload 7
    //   962: astore 5
    //   964: goto +265 -> 1229
    //   967: astore 8
    //   969: aconst_null
    //   970: astore 7
    //   972: aload 7
    //   974: astore 6
    //   976: aload 7
    //   978: ifnull +32 -> 1010
    //   981: aload 7
    //   983: astore 4
    //   985: aload 6
    //   987: astore 5
    //   989: aload 7
    //   991: invokevirtual 152	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   994: ifeq +16 -> 1010
    //   997: aload 7
    //   999: astore 4
    //   1001: aload 6
    //   1003: astore 5
    //   1005: aload 7
    //   1007: invokevirtual 148	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   1010: aload 7
    //   1012: astore 4
    //   1014: aload 6
    //   1016: astore 5
    //   1018: aload_0
    //   1019: invokevirtual 101	com/google/android/gms/measurement/internal/r:c	()Lcom/google/android/gms/measurement/internal/v;
    //   1022: invokevirtual 107	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   1025: ldc_w 278
    //   1028: aload 8
    //   1030: invokevirtual 157	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   1033: aload 7
    //   1035: astore 4
    //   1037: aload 6
    //   1039: astore 5
    //   1041: aload_0
    //   1042: iconst_1
    //   1043: putfield 32	com/google/android/gms/measurement/internal/r:d	Z
    //   1046: aload 6
    //   1048: ifnull +10 -> 1058
    //   1051: aload 6
    //   1053: invokeinterface 149 1 0
    //   1058: iload_3
    //   1059: istore 13
    //   1061: aload 7
    //   1063: ifnull +147 -> 1210
    //   1066: aload 7
    //   1068: invokevirtual 77	android/database/sqlite/SQLiteDatabase:close	()V
    //   1071: iload_3
    //   1072: istore 13
    //   1074: goto +136 -> 1210
    //   1077: astore 4
    //   1079: aconst_null
    //   1080: astore 7
    //   1082: aload 7
    //   1084: astore 6
    //   1086: iload_3
    //   1087: i2l
    //   1088: lstore 9
    //   1090: aload 7
    //   1092: astore 4
    //   1094: aload 6
    //   1096: astore 5
    //   1098: lload 9
    //   1100: invokestatic 163	android/os/SystemClock:sleep	(J)V
    //   1103: iinc 3 20
    //   1106: aload 6
    //   1108: ifnull +10 -> 1118
    //   1111: aload 6
    //   1113: invokeinterface 149 1 0
    //   1118: iload_3
    //   1119: istore 13
    //   1121: aload 7
    //   1123: ifnull +87 -> 1210
    //   1126: aload 7
    //   1128: invokevirtual 77	android/database/sqlite/SQLiteDatabase:close	()V
    //   1131: iload_3
    //   1132: istore 13
    //   1134: goto +76 -> 1210
    //   1137: astore 8
    //   1139: aconst_null
    //   1140: astore 7
    //   1142: aload 7
    //   1144: astore 6
    //   1146: aload 7
    //   1148: astore 4
    //   1150: aload 6
    //   1152: astore 5
    //   1154: aload_0
    //   1155: invokevirtual 101	com/google/android/gms/measurement/internal/r:c	()Lcom/google/android/gms/measurement/internal/v;
    //   1158: invokevirtual 107	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   1161: ldc_w 278
    //   1164: aload 8
    //   1166: invokevirtual 157	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   1169: aload 7
    //   1171: astore 4
    //   1173: aload 6
    //   1175: astore 5
    //   1177: aload_0
    //   1178: iconst_1
    //   1179: putfield 32	com/google/android/gms/measurement/internal/r:d	Z
    //   1182: aload 6
    //   1184: ifnull +10 -> 1194
    //   1187: aload 6
    //   1189: invokeinterface 149 1 0
    //   1194: iload_3
    //   1195: istore 13
    //   1197: aload 7
    //   1199: ifnull +11 -> 1210
    //   1202: aload 7
    //   1204: invokevirtual 77	android/database/sqlite/SQLiteDatabase:close	()V
    //   1207: iload_3
    //   1208: istore 13
    //   1210: iinc 1 1
    //   1213: iload 13
    //   1215: istore_3
    //   1216: goto -1170 -> 46
    //   1219: astore 6
    //   1221: aload 4
    //   1223: astore 7
    //   1225: aload 6
    //   1227: astore 4
    //   1229: aload 5
    //   1231: ifnull +10 -> 1241
    //   1234: aload 5
    //   1236: invokeinterface 149 1 0
    //   1241: aload 7
    //   1243: ifnull +8 -> 1251
    //   1246: aload 7
    //   1248: invokevirtual 77	android/database/sqlite/SQLiteDatabase:close	()V
    //   1251: aload 4
    //   1253: athrow
    //   1254: aload_0
    //   1255: invokevirtual 101	com/google/android/gms/measurement/internal/r:c	()Lcom/google/android/gms/measurement/internal/v;
    //   1258: invokevirtual 166	com/google/android/gms/measurement/internal/v:v	()Lcom/google/android/gms/measurement/internal/x;
    //   1261: ldc_w 280
    //   1264: invokevirtual 114	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;)V
    //   1267: aconst_null
    //   1268: areturn
    //   1269: astore 7
    //   1271: goto -338 -> 933
    //   1274: astore 4
    //   1276: goto -190 -> 1086
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1279	0	this	r
    //   0	1279	1	paramInt	int
    //   24	845	2	localArrayList	java.util.ArrayList
    //   45	1171	3	i	int
    //   55	272	4	localObject1	Object
    //   353	1	4	locala1	gq.a
    //   370	96	4	localObject2	Object
    //   484	1	4	locala2	gq.a
    //   501	125	4	localObject3	Object
    //   644	1	4	locala3	gq.a
    //   661	288	4	localObject4	Object
    //   955	1	4	localObject5	Object
    //   983	53	4	localObject6	Object
    //   1077	1	4	localSQLiteDatabaseLockedException1	android.database.sqlite.SQLiteDatabaseLockedException
    //   1092	160	4	localObject7	Object
    //   1274	1	4	localSQLiteDatabaseLockedException2	android.database.sqlite.SQLiteDatabaseLockedException
    //   79	10	5	localObject8	Object
    //   94	1141	5	localObject9	Object
    //   82	1106	6	localObject10	Object
    //   1219	7	6	localObject11	Object
    //   86	778	7	localObject12	Object
    //   880	1	7	localObject13	Object
    //   895	10	7	localObject14	Object
    //   910	17	7	localObject15	Object
    //   931	1	7	localSQLiteDatabaseLockedException3	android.database.sqlite.SQLiteDatabaseLockedException
    //   938	309	7	localObject16	Object
    //   1269	1	7	localSQLiteDatabaseLockedException4	android.database.sqlite.SQLiteDatabaseLockedException
    //   99	1	8	localSQLiteException1	SQLiteException
    //   111	1	8	localSQLiteFullException1	android.database.sqlite.SQLiteFullException
    //   268	194	8	localObject17	Object
    //   479	1	8	localObject18	Object
    //   513	109	8	localObject19	Object
    //   639	1	8	localObject20	Object
    //   673	57	8	localObject21	Object
    //   870	1	8	localSQLiteException2	SQLiteException
    //   875	1	8	localSQLiteFullException2	android.database.sqlite.SQLiteFullException
    //   885	1	8	localSQLiteException3	SQLiteException
    //   890	1	8	localSQLiteFullException3	android.database.sqlite.SQLiteFullException
    //   919	1	8	localSQLiteException4	SQLiteException
    //   943	1	8	localSQLiteFullException4	android.database.sqlite.SQLiteFullException
    //   967	62	8	localSQLiteException5	SQLiteException
    //   1137	28	8	localSQLiteFullException5	android.database.sqlite.SQLiteFullException
    //   178	921	9	l1	long
    //   214	540	11	l2	long
    //   232	982	13	j	int
    //   250	347	14	arrayOfByte	byte[]
    //   300	34	15	localk	k
    //   348	62	15	localObject22	Object
    //   429	288	15	localParcel	Parcel
    // Exception table:
    //   from	to	target	type
    //   62	67	79	finally
    //   62	67	99	android/database/sqlite/SQLiteException
    //   62	67	111	android/database/sqlite/SQLiteFullException
    //   270	302	348	finally
    //   355	368	348	finally
    //   270	302	353	gq$a
    //   431	463	479	finally
    //   486	499	479	finally
    //   431	463	484	gq$a
    //   591	623	639	finally
    //   646	659	639	finally
    //   591	623	644	gq$a
    //   188	198	870	android/database/sqlite/SQLiteException
    //   206	216	870	android/database/sqlite/SQLiteException
    //   224	234	870	android/database/sqlite/SQLiteException
    //   242	252	870	android/database/sqlite/SQLiteException
    //   265	270	870	android/database/sqlite/SQLiteException
    //   310	315	870	android/database/sqlite/SQLiteException
    //   332	341	870	android/database/sqlite/SQLiteException
    //   376	381	870	android/database/sqlite/SQLiteException
    //   396	401	870	android/database/sqlite/SQLiteException
    //   409	412	870	android/database/sqlite/SQLiteException
    //   426	431	870	android/database/sqlite/SQLiteException
    //   471	476	870	android/database/sqlite/SQLiteException
    //   507	512	870	android/database/sqlite/SQLiteException
    //   532	541	870	android/database/sqlite/SQLiteException
    //   556	561	870	android/database/sqlite/SQLiteException
    //   569	572	870	android/database/sqlite/SQLiteException
    //   586	591	870	android/database/sqlite/SQLiteException
    //   631	636	870	android/database/sqlite/SQLiteException
    //   667	672	870	android/database/sqlite/SQLiteException
    //   692	701	870	android/database/sqlite/SQLiteException
    //   716	721	870	android/database/sqlite/SQLiteException
    //   729	732	870	android/database/sqlite/SQLiteException
    //   740	753	870	android/database/sqlite/SQLiteException
    //   768	799	870	android/database/sqlite/SQLiteException
    //   807	820	870	android/database/sqlite/SQLiteException
    //   828	833	870	android/database/sqlite/SQLiteException
    //   841	846	870	android/database/sqlite/SQLiteException
    //   188	198	875	android/database/sqlite/SQLiteFullException
    //   206	216	875	android/database/sqlite/SQLiteFullException
    //   224	234	875	android/database/sqlite/SQLiteFullException
    //   242	252	875	android/database/sqlite/SQLiteFullException
    //   265	270	875	android/database/sqlite/SQLiteFullException
    //   310	315	875	android/database/sqlite/SQLiteFullException
    //   332	341	875	android/database/sqlite/SQLiteFullException
    //   376	381	875	android/database/sqlite/SQLiteFullException
    //   396	401	875	android/database/sqlite/SQLiteFullException
    //   409	412	875	android/database/sqlite/SQLiteFullException
    //   426	431	875	android/database/sqlite/SQLiteFullException
    //   471	476	875	android/database/sqlite/SQLiteFullException
    //   507	512	875	android/database/sqlite/SQLiteFullException
    //   532	541	875	android/database/sqlite/SQLiteFullException
    //   556	561	875	android/database/sqlite/SQLiteFullException
    //   569	572	875	android/database/sqlite/SQLiteFullException
    //   586	591	875	android/database/sqlite/SQLiteFullException
    //   631	636	875	android/database/sqlite/SQLiteFullException
    //   667	672	875	android/database/sqlite/SQLiteFullException
    //   692	701	875	android/database/sqlite/SQLiteFullException
    //   716	721	875	android/database/sqlite/SQLiteFullException
    //   729	732	875	android/database/sqlite/SQLiteFullException
    //   740	753	875	android/database/sqlite/SQLiteFullException
    //   768	799	875	android/database/sqlite/SQLiteFullException
    //   807	820	875	android/database/sqlite/SQLiteFullException
    //   828	833	875	android/database/sqlite/SQLiteFullException
    //   841	846	875	android/database/sqlite/SQLiteFullException
    //   139	175	880	finally
    //   139	175	885	android/database/sqlite/SQLiteException
    //   139	175	890	android/database/sqlite/SQLiteFullException
    //   123	135	895	finally
    //   123	135	919	android/database/sqlite/SQLiteException
    //   62	67	931	android/database/sqlite/SQLiteDatabaseLockedException
    //   123	135	931	android/database/sqlite/SQLiteDatabaseLockedException
    //   123	135	943	android/database/sqlite/SQLiteFullException
    //   51	57	955	finally
    //   51	57	967	android/database/sqlite/SQLiteException
    //   51	57	1077	android/database/sqlite/SQLiteDatabaseLockedException
    //   51	57	1137	android/database/sqlite/SQLiteFullException
    //   188	198	1219	finally
    //   206	216	1219	finally
    //   224	234	1219	finally
    //   242	252	1219	finally
    //   265	270	1219	finally
    //   310	315	1219	finally
    //   332	341	1219	finally
    //   376	381	1219	finally
    //   396	401	1219	finally
    //   409	412	1219	finally
    //   426	431	1219	finally
    //   471	476	1219	finally
    //   507	512	1219	finally
    //   532	541	1219	finally
    //   556	561	1219	finally
    //   569	572	1219	finally
    //   586	591	1219	finally
    //   631	636	1219	finally
    //   667	672	1219	finally
    //   692	701	1219	finally
    //   716	721	1219	finally
    //   729	732	1219	finally
    //   740	753	1219	finally
    //   768	799	1219	finally
    //   807	820	1219	finally
    //   828	833	1219	finally
    //   841	846	1219	finally
    //   989	997	1219	finally
    //   1005	1010	1219	finally
    //   1018	1033	1219	finally
    //   1041	1046	1219	finally
    //   1098	1103	1219	finally
    //   1154	1169	1219	finally
    //   1177	1182	1219	finally
    //   139	175	1269	android/database/sqlite/SQLiteDatabaseLockedException
    //   188	198	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   206	216	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   224	234	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   242	252	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   265	270	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   310	315	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   332	341	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   376	381	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   396	401	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   409	412	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   426	431	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   471	476	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   507	512	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   532	541	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   556	561	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   569	572	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   586	591	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   631	636	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   667	672	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   692	701	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   716	721	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   729	732	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   740	753	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   768	799	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   807	820	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   828	833	1274	android/database/sqlite/SQLiteDatabaseLockedException
    //   841	846	1274	android/database/sqlite/SQLiteDatabaseLockedException
  }
  
  public final boolean a(ec paramec)
  {
    Parcel localParcel = Parcel.obtain();
    paramec.writeToParcel(localParcel, 0);
    paramec = localParcel.marshall();
    localParcel.recycle();
    if (paramec.length > 131072)
    {
      c().v().a("User property too long for local database. Sending directly to service");
      return false;
    }
    return a(1, paramec);
  }
  
  public final boolean a(k paramk)
  {
    Parcel localParcel = Parcel.obtain();
    paramk.writeToParcel(localParcel, 0);
    paramk = localParcel.marshall();
    localParcel.recycle();
    if (paramk.length > 131072)
    {
      c().v().a("Event is too long for local database. Sending event directly to service");
      return false;
    }
    return a(0, paramk);
  }
  
  public final boolean a(uc paramuc)
  {
    e();
    paramuc = hc.a(paramuc);
    if (paramuc.length > 131072)
    {
      c().v().a("Conditional user property too long for local database. Sending directly to service");
      return false;
    }
    return a(2, paramuc);
  }
  
  protected final boolean y()
  {
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */