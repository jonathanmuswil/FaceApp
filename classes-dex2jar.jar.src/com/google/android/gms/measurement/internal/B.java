package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class b
{
  private static Set<String> a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    HashSet localHashSet = new HashSet();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 22);
    localStringBuilder.append("SELECT * FROM ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" LIMIT 0");
    paramSQLiteDatabase = paramSQLiteDatabase.rawQuery(localStringBuilder.toString(), null);
    try
    {
      Collections.addAll(localHashSet, paramSQLiteDatabase.getColumnNames());
      return localHashSet;
    }
    finally
    {
      paramSQLiteDatabase.close();
    }
  }
  
  static void a(v paramv, SQLiteDatabase paramSQLiteDatabase)
  {
    if (paramv != null)
    {
      paramSQLiteDatabase = new File(paramSQLiteDatabase.getPath());
      if (!paramSQLiteDatabase.setReadable(false, false)) {
        paramv.v().a("Failed to turn off database read permission");
      }
      if (!paramSQLiteDatabase.setWritable(false, false)) {
        paramv.v().a("Failed to turn off database write permission");
      }
      if (!paramSQLiteDatabase.setReadable(true, true)) {
        paramv.v().a("Failed to turn on database read permission for owner");
      }
      if (!paramSQLiteDatabase.setWritable(true, true)) {
        paramv.v().a("Failed to turn on database write permission for owner");
      }
      return;
    }
    throw new IllegalArgumentException("Monitor must not be null");
  }
  
  static void a(v paramv, SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString)
    throws SQLiteException
  {
    if (paramv != null)
    {
      if (!a(paramv, paramSQLiteDatabase, paramString1)) {
        paramSQLiteDatabase.execSQL(paramString2);
      }
      if (paramv != null) {
        try
        {
          Set localSet = a(paramSQLiteDatabase, paramString1);
          paramString3 = paramString3.split(",");
          int i = paramString3.length;
          int j = 0;
          int k = 0;
          while (k < i)
          {
            paramString2 = paramString3[k];
            if (localSet.remove(paramString2))
            {
              k++;
            }
            else
            {
              paramSQLiteDatabase = new android/database/sqlite/SQLiteException;
              j = String.valueOf(paramString1).length();
              k = String.valueOf(paramString2).length();
              paramString3 = new java/lang/StringBuilder;
              paramString3.<init>(j + 35 + k);
              paramString3.append("Table ");
              paramString3.append(paramString1);
              paramString3.append(" is missing required column: ");
              paramString3.append(paramString2);
              paramSQLiteDatabase.<init>(paramString3.toString());
              throw paramSQLiteDatabase;
            }
          }
          if (paramArrayOfString != null) {
            for (k = j; k < paramArrayOfString.length; k += 2) {
              if (!localSet.remove(paramArrayOfString[k])) {
                paramSQLiteDatabase.execSQL(paramArrayOfString[(k + 1)]);
              }
            }
          }
          if (!localSet.isEmpty()) {
            paramv.v().a("Table has extra columns. table, columns", paramString1, TextUtils.join(", ", localSet));
          }
          return;
        }
        catch (SQLiteException paramSQLiteDatabase) {}
      }
      paramSQLiteDatabase = new java/lang/IllegalArgumentException;
      paramSQLiteDatabase.<init>("Monitor must not be null");
      throw paramSQLiteDatabase;
      paramv.s().a("Failed to verify columns on table that was just created", paramString1);
      throw paramSQLiteDatabase;
    }
    throw new IllegalArgumentException("Monitor must not be null");
  }
  
  /* Error */
  private static boolean a(v paramv, SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +108 -> 109
    //   4: aconst_null
    //   5: astore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: aload_1
    //   10: ldc -98
    //   12: iconst_1
    //   13: anewarray 16	java/lang/String
    //   16: dup
    //   17: iconst_0
    //   18: ldc -96
    //   20: aastore
    //   21: ldc -94
    //   23: iconst_1
    //   24: anewarray 16	java/lang/String
    //   27: dup
    //   28: iconst_0
    //   29: aload_2
    //   30: aastore
    //   31: aconst_null
    //   32: aconst_null
    //   33: aconst_null
    //   34: invokevirtual 166	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   37: astore_1
    //   38: aload_1
    //   39: astore 4
    //   41: aload_1
    //   42: astore_3
    //   43: aload_1
    //   44: invokeinterface 169 1 0
    //   49: istore 5
    //   51: aload_1
    //   52: ifnull +9 -> 61
    //   55: aload_1
    //   56: invokeinterface 60 1 0
    //   61: iload 5
    //   63: ireturn
    //   64: astore_0
    //   65: goto +30 -> 95
    //   68: astore_1
    //   69: aload_3
    //   70: astore 4
    //   72: aload_0
    //   73: invokevirtual 82	com/google/android/gms/measurement/internal/v:v	()Lcom/google/android/gms/measurement/internal/x;
    //   76: ldc -85
    //   78: aload_2
    //   79: aload_1
    //   80: invokevirtual 147	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   83: aload_3
    //   84: ifnull +9 -> 93
    //   87: aload_3
    //   88: invokeinterface 60 1 0
    //   93: iconst_0
    //   94: ireturn
    //   95: aload 4
    //   97: ifnull +10 -> 107
    //   100: aload 4
    //   102: invokeinterface 60 1 0
    //   107: aload_0
    //   108: athrow
    //   109: new 99	java/lang/IllegalArgumentException
    //   112: dup
    //   113: ldc 101
    //   115: invokespecial 102	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   118: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	paramv	v
    //   0	119	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	119	2	paramString	String
    //   5	83	3	localSQLiteDatabase1	SQLiteDatabase
    //   7	94	4	localSQLiteDatabase2	SQLiteDatabase
    //   49	13	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   9	38	64	finally
    //   43	51	64	finally
    //   72	83	64	finally
    //   9	38	68	android/database/sqlite/SQLiteException
    //   43	51	68	android/database/sqlite/SQLiteException
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */