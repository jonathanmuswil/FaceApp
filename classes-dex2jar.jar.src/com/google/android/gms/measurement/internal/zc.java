package com.google.android.gms.measurement.internal;

import BG;
import BG.a;
import JG;
import KG;
import OG;
import SG;
import UG;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.e;
import gK;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kI.a;

final class zc
  extends Wb
{
  private static final String[] d = { "last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;" };
  private static final String[] e = { "origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;" };
  private static final String[] f = { "app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;" };
  private static final String[] g = { "realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;" };
  private static final String[] h = { "has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;" };
  private static final String[] i = { "previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;" };
  private final Cc j = new Cc(this, getContext(), "google_app_measurement.db");
  private final Sb k = new Sb(b());
  
  zc(Xb paramXb)
  {
    super(paramXb);
  }
  
  private final boolean M()
  {
    return getContext().getDatabasePath("google_app_measurement.db").exists();
  }
  
  /* Error */
  private final long a(String paramString, String[] paramArrayOfString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore 5
    //   6: aconst_null
    //   7: astore 6
    //   9: aconst_null
    //   10: astore 7
    //   12: aload 5
    //   14: aload_1
    //   15: aload_2
    //   16: invokevirtual 232	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   19: astore_2
    //   20: aload_2
    //   21: astore 7
    //   23: aload_2
    //   24: astore 6
    //   26: aload_2
    //   27: invokeinterface 237 1 0
    //   32: ifeq +29 -> 61
    //   35: aload_2
    //   36: astore 7
    //   38: aload_2
    //   39: astore 6
    //   41: aload_2
    //   42: iconst_0
    //   43: invokeinterface 241 2 0
    //   48: lstore_3
    //   49: aload_2
    //   50: ifnull +9 -> 59
    //   53: aload_2
    //   54: invokeinterface 244 1 0
    //   59: lload_3
    //   60: lreturn
    //   61: aload_2
    //   62: ifnull +9 -> 71
    //   65: aload_2
    //   66: invokeinterface 244 1 0
    //   71: lload_3
    //   72: lreturn
    //   73: astore_1
    //   74: goto +29 -> 103
    //   77: astore_2
    //   78: aload 6
    //   80: astore 7
    //   82: aload_0
    //   83: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   86: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   89: ldc_w 256
    //   92: aload_1
    //   93: aload_2
    //   94: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   97: aload 6
    //   99: astore 7
    //   101: aload_2
    //   102: athrow
    //   103: aload 7
    //   105: ifnull +10 -> 115
    //   108: aload 7
    //   110: invokeinterface 244 1 0
    //   115: aload_1
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	zc
    //   0	117	1	paramString	String
    //   0	117	2	paramArrayOfString	String[]
    //   0	117	3	paramLong	long
    //   4	9	5	localSQLiteDatabase	SQLiteDatabase
    //   7	91	6	arrayOfString1	String[]
    //   10	99	7	arrayOfString2	String[]
    // Exception table:
    //   from	to	target	type
    //   12	20	73	finally
    //   26	35	73	finally
    //   41	49	73	finally
    //   82	97	73	finally
    //   101	103	73	finally
    //   12	20	77	android/database/sqlite/SQLiteException
    //   26	35	77	android/database/sqlite/SQLiteException
    //   41	49	77	android/database/sqlite/SQLiteException
  }
  
  private final Object a(Cursor paramCursor, int paramInt)
  {
    int m = paramCursor.getType(paramInt);
    if (m != 0)
    {
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3)
          {
            if (m != 4)
            {
              c().s().a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(m));
              return null;
            }
            c().s().a("Loaded invalid blob type value, ignoring it");
            return null;
          }
          return paramCursor.getString(paramInt);
        }
        return Double.valueOf(paramCursor.getDouble(paramInt));
      }
      return Long.valueOf(paramCursor.getLong(paramInt));
    }
    c().s().a("Loaded invalid null value from database");
    return null;
  }
  
  private static void a(ContentValues paramContentValues, String paramString, Object paramObject)
  {
    com.google.android.gms.common.internal.t.b(paramString);
    com.google.android.gms.common.internal.t.a(paramObject);
    if ((paramObject instanceof String))
    {
      paramContentValues.put(paramString, (String)paramObject);
      return;
    }
    if ((paramObject instanceof Long))
    {
      paramContentValues.put(paramString, (Long)paramObject);
      return;
    }
    if ((paramObject instanceof Double))
    {
      paramContentValues.put(paramString, (Double)paramObject);
      return;
    }
    throw new IllegalArgumentException("Invalid value type");
  }
  
  private final boolean a(String paramString, int paramInt, KG paramKG)
  {
    r();
    j();
    com.google.android.gms.common.internal.t.b(paramString);
    com.google.android.gms.common.internal.t.a(paramKG);
    if (TextUtils.isEmpty(paramKG.e))
    {
      c().v().a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", v.a(paramString), Integer.valueOf(paramInt), String.valueOf(paramKG.d));
      return false;
    }
    byte[] arrayOfByte = gK.a(paramKG);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramString);
    localContentValues.put("audience_id", Integer.valueOf(paramInt));
    localContentValues.put("filter_id", paramKG.d);
    localContentValues.put("event_name", paramKG.e);
    localContentValues.put("data", arrayOfByte);
    try
    {
      if (w().insertWithOnConflict("event_filters", null, localContentValues, 5) == -1L) {
        c().s().a("Failed to insert event filter (got -1). appId", v.a(paramString));
      }
      return true;
    }
    catch (SQLiteException paramKG)
    {
      c().s().a("Error storing event filter. appId", v.a(paramString), paramKG);
    }
    return false;
  }
  
  private final boolean a(String paramString, int paramInt, OG paramOG)
  {
    r();
    j();
    com.google.android.gms.common.internal.t.b(paramString);
    com.google.android.gms.common.internal.t.a(paramOG);
    if (TextUtils.isEmpty(paramOG.e))
    {
      c().v().a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", v.a(paramString), Integer.valueOf(paramInt), String.valueOf(paramOG.d));
      return false;
    }
    byte[] arrayOfByte = gK.a(paramOG);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramString);
    localContentValues.put("audience_id", Integer.valueOf(paramInt));
    localContentValues.put("filter_id", paramOG.d);
    localContentValues.put("property_name", paramOG.e);
    localContentValues.put("data", arrayOfByte);
    try
    {
      if (w().insertWithOnConflict("property_filters", null, localContentValues, 5) == -1L)
      {
        c().s().a("Failed to insert property filter (got -1). appId", v.a(paramString));
        return false;
      }
      return true;
    }
    catch (SQLiteException paramOG)
    {
      c().s().a("Error storing property filter. appId", v.a(paramString), paramOG);
    }
    return false;
  }
  
  private final boolean a(String paramString, List<Integer> paramList)
  {
    com.google.android.gms.common.internal.t.b(paramString);
    r();
    j();
    SQLiteDatabase localSQLiteDatabase = w();
    try
    {
      long l = b("select count(1) from audience_filter_values where app_id=?", new String[] { paramString });
      int m = Math.max(0, Math.min(2000, g().b(paramString, m.T)));
      if (l <= m) {
        return false;
      }
      Object localObject = new ArrayList();
      int n = 0;
      while (n < paramList.size())
      {
        Integer localInteger = (Integer)paramList.get(n);
        if ((localInteger != null) && ((localInteger instanceof Integer)))
        {
          ((List)localObject).add(Integer.toString(localInteger.intValue()));
          n++;
        }
        else
        {
          return false;
        }
      }
      localObject = TextUtils.join(",", (Iterable)localObject);
      paramList = new StringBuilder(String.valueOf(localObject).length() + 2);
      paramList.append("(");
      paramList.append((String)localObject);
      paramList.append(")");
      paramList = paramList.toString();
      localObject = new StringBuilder(String.valueOf(paramList).length() + 140);
      ((StringBuilder)localObject).append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
      ((StringBuilder)localObject).append(paramList);
      ((StringBuilder)localObject).append(" order by rowid desc limit -1 offset ?)");
      return localSQLiteDatabase.delete("audience_filter_values", ((StringBuilder)localObject).toString(), new String[] { paramString, Integer.toString(m) }) > 0;
    }
    catch (SQLiteException paramList)
    {
      c().s().a("Database error querying filters. appId", v.a(paramString), paramList);
    }
    return false;
  }
  
  /* Error */
  private final long b(String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore_3
    //   5: aconst_null
    //   6: astore 4
    //   8: aconst_null
    //   9: astore 5
    //   11: aload_3
    //   12: aload_1
    //   13: aload_2
    //   14: invokevirtual 232	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   17: astore_2
    //   18: aload_2
    //   19: astore 5
    //   21: aload_2
    //   22: astore 4
    //   24: aload_2
    //   25: invokeinterface 237 1 0
    //   30: ifeq +31 -> 61
    //   33: aload_2
    //   34: astore 5
    //   36: aload_2
    //   37: astore 4
    //   39: aload_2
    //   40: iconst_0
    //   41: invokeinterface 241 2 0
    //   46: lstore 6
    //   48: aload_2
    //   49: ifnull +9 -> 58
    //   52: aload_2
    //   53: invokeinterface 244 1 0
    //   58: lload 6
    //   60: lreturn
    //   61: aload_2
    //   62: astore 5
    //   64: aload_2
    //   65: astore 4
    //   67: new 222	android/database/sqlite/SQLiteException
    //   70: astore_3
    //   71: aload_2
    //   72: astore 5
    //   74: aload_2
    //   75: astore 4
    //   77: aload_3
    //   78: ldc_w 507
    //   81: invokespecial 508	android/database/sqlite/SQLiteException:<init>	(Ljava/lang/String;)V
    //   84: aload_2
    //   85: astore 5
    //   87: aload_2
    //   88: astore 4
    //   90: aload_3
    //   91: athrow
    //   92: astore_1
    //   93: goto +29 -> 122
    //   96: astore_2
    //   97: aload 4
    //   99: astore 5
    //   101: aload_0
    //   102: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   105: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   108: ldc_w 256
    //   111: aload_1
    //   112: aload_2
    //   113: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   116: aload 4
    //   118: astore 5
    //   120: aload_2
    //   121: athrow
    //   122: aload 5
    //   124: ifnull +10 -> 134
    //   127: aload 5
    //   129: invokeinterface 244 1 0
    //   134: aload_1
    //   135: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	136	0	this	zc
    //   0	136	1	paramString	String
    //   0	136	2	paramArrayOfString	String[]
    //   4	87	3	localObject	Object
    //   6	111	4	arrayOfString1	String[]
    //   9	119	5	arrayOfString2	String[]
    //   46	13	6	l	long
    // Exception table:
    //   from	to	target	type
    //   11	18	92	finally
    //   24	33	92	finally
    //   39	48	92	finally
    //   67	71	92	finally
    //   77	84	92	finally
    //   90	92	92	finally
    //   101	116	92	finally
    //   120	122	92	finally
    //   11	18	96	android/database/sqlite/SQLiteException
    //   24	33	96	android/database/sqlite/SQLiteException
    //   39	48	96	android/database/sqlite/SQLiteException
    //   67	71	96	android/database/sqlite/SQLiteException
    //   77	84	96	android/database/sqlite/SQLiteException
    //   90	92	96	android/database/sqlite/SQLiteException
  }
  
  final void A()
  {
    j();
    r();
    if (!M()) {
      return;
    }
    long l1 = f().i.a();
    long l2 = b().b();
    if (Math.abs(l2 - l1) > ((Long)m.M.a(null)).longValue())
    {
      f().i.a(l2);
      j();
      r();
      if (M())
      {
        int m = w().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[] { String.valueOf(b().a()), String.valueOf(wc.r()) });
        if (m > 0) {
          c().A().a("Deleted stale rows. rowsDeleted", Integer.valueOf(m));
        }
      }
    }
  }
  
  public final long B()
  {
    return a("select max(bundle_end_timestamp) from queue", null, 0L);
  }
  
  public final long C()
  {
    return a("select max(timestamp) from raw_events", null, 0L);
  }
  
  public final boolean D()
  {
    return b("select count(1) > 0 from raw_events", null) != 0L;
  }
  
  public final boolean E()
  {
    return b("select count(1) > 0 from raw_events where realtime = 1", null) != 0L;
  }
  
  /* Error */
  public final long F()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   8: ldc_w 574
    //   11: aconst_null
    //   12: invokevirtual 232	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   15: astore_3
    //   16: aload_3
    //   17: astore_2
    //   18: aload_3
    //   19: astore_1
    //   20: aload_3
    //   21: invokeinterface 237 1 0
    //   26: istore 4
    //   28: iload 4
    //   30: ifne +17 -> 47
    //   33: aload_3
    //   34: ifnull +9 -> 43
    //   37: aload_3
    //   38: invokeinterface 244 1 0
    //   43: ldc2_w 394
    //   46: lreturn
    //   47: aload_3
    //   48: astore_2
    //   49: aload_3
    //   50: astore_1
    //   51: aload_3
    //   52: iconst_0
    //   53: invokeinterface 241 2 0
    //   58: lstore 5
    //   60: aload_3
    //   61: ifnull +9 -> 70
    //   64: aload_3
    //   65: invokeinterface 244 1 0
    //   70: lload 5
    //   72: lreturn
    //   73: astore_1
    //   74: goto +34 -> 108
    //   77: astore_3
    //   78: aload_1
    //   79: astore_2
    //   80: aload_0
    //   81: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   84: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   87: ldc_w 576
    //   90: aload_3
    //   91: invokevirtual 278	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   94: aload_1
    //   95: ifnull +9 -> 104
    //   98: aload_1
    //   99: invokeinterface 244 1 0
    //   104: ldc2_w 394
    //   107: lreturn
    //   108: aload_2
    //   109: ifnull +9 -> 118
    //   112: aload_2
    //   113: invokeinterface 244 1 0
    //   118: aload_1
    //   119: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	zc
    //   1	50	1	localObject1	Object
    //   73	46	1	localObject2	Object
    //   3	110	2	localObject3	Object
    //   15	50	3	localCursor	Cursor
    //   77	14	3	localSQLiteException	SQLiteException
    //   26	3	4	bool	boolean
    //   58	13	5	l	long
    // Exception table:
    //   from	to	target	type
    //   4	16	73	finally
    //   20	28	73	finally
    //   51	60	73	finally
    //   80	94	73	finally
    //   4	16	77	android/database/sqlite/SQLiteException
    //   20	28	77	android/database/sqlite/SQLiteException
    //   51	60	77	android/database/sqlite/SQLiteException
  }
  
  public final long a(UG paramUG)
    throws IOException
  {
    j();
    r();
    com.google.android.gms.common.internal.t.a(paramUG);
    com.google.android.gms.common.internal.t.b(paramUG.r);
    byte[] arrayOfByte = gK.a(paramUG);
    long l = l().a(arrayOfByte);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramUG.r);
    localContentValues.put("metadata_fingerprint", Long.valueOf(l));
    localContentValues.put("metadata", arrayOfByte);
    try
    {
      w().insertWithOnConflict("raw_events_metadata", null, localContentValues, 4);
      return l;
    }
    catch (SQLiteException localSQLiteException)
    {
      c().s().a("Error storing raw event metadata. appId", v.a(paramUG.r), localSQLiteException);
      throw localSQLiteException;
    }
  }
  
  /* Error */
  public final android.util.Pair<SG, Long> a(String paramString, Long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   4: aload_0
    //   5: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   8: aload_0
    //   9: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   12: ldc_w 606
    //   15: iconst_2
    //   16: anewarray 19	java/lang/String
    //   19: dup
    //   20: iconst_0
    //   21: aload_1
    //   22: aastore
    //   23: dup
    //   24: iconst_1
    //   25: aload_2
    //   26: invokestatic 361	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   29: aastore
    //   30: invokevirtual 232	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   33: astore_3
    //   34: aload_3
    //   35: astore 4
    //   37: aload_3
    //   38: invokeinterface 237 1 0
    //   43: ifne +31 -> 74
    //   46: aload_3
    //   47: astore 4
    //   49: aload_0
    //   50: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   53: invokevirtual 555	com/google/android/gms/measurement/internal/v:A	()Lcom/google/android/gms/measurement/internal/x;
    //   56: ldc_w 608
    //   59: invokevirtual 283	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;)V
    //   62: aload_3
    //   63: ifnull +9 -> 72
    //   66: aload_3
    //   67: invokeinterface 244 1 0
    //   72: aconst_null
    //   73: areturn
    //   74: aload_3
    //   75: astore 4
    //   77: aload_3
    //   78: iconst_0
    //   79: invokeinterface 612 2 0
    //   84: astore 5
    //   86: aload_3
    //   87: astore 4
    //   89: aload_3
    //   90: iconst_1
    //   91: invokeinterface 241 2 0
    //   96: lstore 6
    //   98: aload_3
    //   99: astore 4
    //   101: aload 5
    //   103: invokestatic 617	SG:a	([B)LSG;
    //   106: astore 5
    //   108: aload_3
    //   109: astore 4
    //   111: aload 5
    //   113: lload 6
    //   115: invokestatic 301	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   118: invokestatic 623	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   121: astore_1
    //   122: aload_3
    //   123: ifnull +9 -> 132
    //   126: aload_3
    //   127: invokeinterface 244 1 0
    //   132: aload_1
    //   133: areturn
    //   134: astore 5
    //   136: aload_3
    //   137: astore 4
    //   139: aload_0
    //   140: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   143: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   146: ldc_w 625
    //   149: aload_1
    //   150: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   153: aload_2
    //   154: aload 5
    //   156: invokevirtual 364	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   159: aload_3
    //   160: ifnull +9 -> 169
    //   163: aload_3
    //   164: invokeinterface 244 1 0
    //   169: aconst_null
    //   170: areturn
    //   171: astore_2
    //   172: aload_3
    //   173: astore_1
    //   174: goto +13 -> 187
    //   177: astore_1
    //   178: aconst_null
    //   179: astore 4
    //   181: goto +36 -> 217
    //   184: astore_2
    //   185: aconst_null
    //   186: astore_1
    //   187: aload_1
    //   188: astore 4
    //   190: aload_0
    //   191: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   194: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   197: ldc_w 627
    //   200: aload_2
    //   201: invokevirtual 278	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   204: aload_1
    //   205: ifnull +9 -> 214
    //   208: aload_1
    //   209: invokeinterface 244 1 0
    //   214: aconst_null
    //   215: areturn
    //   216: astore_1
    //   217: aload 4
    //   219: ifnull +10 -> 229
    //   222: aload 4
    //   224: invokeinterface 244 1 0
    //   229: aload_1
    //   230: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	231	0	this	zc
    //   0	231	1	paramString	String
    //   0	231	2	paramLong	Long
    //   33	140	3	localCursor	Cursor
    //   35	188	4	localObject1	Object
    //   84	28	5	localObject2	Object
    //   134	21	5	localIOException	IOException
    //   96	18	6	l	long
    // Exception table:
    //   from	to	target	type
    //   101	108	134	java/io/IOException
    //   37	46	171	android/database/sqlite/SQLiteException
    //   49	62	171	android/database/sqlite/SQLiteException
    //   77	86	171	android/database/sqlite/SQLiteException
    //   89	98	171	android/database/sqlite/SQLiteException
    //   101	108	171	android/database/sqlite/SQLiteException
    //   111	122	171	android/database/sqlite/SQLiteException
    //   139	159	171	android/database/sqlite/SQLiteException
    //   8	34	177	finally
    //   8	34	184	android/database/sqlite/SQLiteException
    //   37	46	216	finally
    //   49	62	216	finally
    //   77	86	216	finally
    //   89	98	216	finally
    //   101	108	216	finally
    //   111	122	216	finally
    //   139	159	216	finally
    //   190	204	216	finally
  }
  
  /* Error */
  public final Ac a(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    // Byte code:
    //   0: aload_3
    //   1: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   9: aload_0
    //   10: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   13: new 631	com/google/android/gms/measurement/internal/Ac
    //   16: dup
    //   17: invokespecial 632	com/google/android/gms/measurement/internal/Ac:<init>	()V
    //   20: astore 9
    //   22: aconst_null
    //   23: astore 10
    //   25: aconst_null
    //   26: astore 11
    //   28: aload 11
    //   30: astore 12
    //   32: aload 10
    //   34: astore 13
    //   36: aload_0
    //   37: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   40: astore 14
    //   42: aload 11
    //   44: astore 12
    //   46: aload 10
    //   48: astore 13
    //   50: aload 14
    //   52: ldc_w 634
    //   55: bipush 6
    //   57: anewarray 19	java/lang/String
    //   60: dup
    //   61: iconst_0
    //   62: ldc 73
    //   64: aastore
    //   65: dup
    //   66: iconst_1
    //   67: ldc 81
    //   69: aastore
    //   70: dup
    //   71: iconst_2
    //   72: ldc 77
    //   74: aastore
    //   75: dup
    //   76: iconst_3
    //   77: ldc 85
    //   79: aastore
    //   80: dup
    //   81: iconst_4
    //   82: ldc 109
    //   84: aastore
    //   85: dup
    //   86: iconst_5
    //   87: ldc 113
    //   89: aastore
    //   90: ldc_w 636
    //   93: iconst_1
    //   94: anewarray 19	java/lang/String
    //   97: dup
    //   98: iconst_0
    //   99: aload_3
    //   100: aastore
    //   101: aconst_null
    //   102: aconst_null
    //   103: aconst_null
    //   104: invokevirtual 640	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   107: astore 11
    //   109: aload 11
    //   111: astore 12
    //   113: aload 11
    //   115: astore 13
    //   117: aload 11
    //   119: invokeinterface 237 1 0
    //   124: ifne +43 -> 167
    //   127: aload 11
    //   129: astore 12
    //   131: aload 11
    //   133: astore 13
    //   135: aload_0
    //   136: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   139: invokevirtual 350	com/google/android/gms/measurement/internal/v:v	()Lcom/google/android/gms/measurement/internal/x;
    //   142: ldc_w 642
    //   145: aload_3
    //   146: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   149: invokevirtual 278	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   152: aload 11
    //   154: ifnull +10 -> 164
    //   157: aload 11
    //   159: invokeinterface 244 1 0
    //   164: aload 9
    //   166: areturn
    //   167: aload 11
    //   169: astore 12
    //   171: aload 11
    //   173: astore 13
    //   175: aload 11
    //   177: iconst_0
    //   178: invokeinterface 241 2 0
    //   183: lload_1
    //   184: lcmp
    //   185: ifne +108 -> 293
    //   188: aload 11
    //   190: astore 12
    //   192: aload 11
    //   194: astore 13
    //   196: aload 9
    //   198: aload 11
    //   200: iconst_1
    //   201: invokeinterface 241 2 0
    //   206: putfield 644	com/google/android/gms/measurement/internal/Ac:b	J
    //   209: aload 11
    //   211: astore 12
    //   213: aload 11
    //   215: astore 13
    //   217: aload 9
    //   219: aload 11
    //   221: iconst_2
    //   222: invokeinterface 241 2 0
    //   227: putfield 646	com/google/android/gms/measurement/internal/Ac:a	J
    //   230: aload 11
    //   232: astore 12
    //   234: aload 11
    //   236: astore 13
    //   238: aload 9
    //   240: aload 11
    //   242: iconst_3
    //   243: invokeinterface 241 2 0
    //   248: putfield 648	com/google/android/gms/measurement/internal/Ac:c	J
    //   251: aload 11
    //   253: astore 12
    //   255: aload 11
    //   257: astore 13
    //   259: aload 9
    //   261: aload 11
    //   263: iconst_4
    //   264: invokeinterface 241 2 0
    //   269: putfield 650	com/google/android/gms/measurement/internal/Ac:d	J
    //   272: aload 11
    //   274: astore 12
    //   276: aload 11
    //   278: astore 13
    //   280: aload 9
    //   282: aload 11
    //   284: iconst_5
    //   285: invokeinterface 241 2 0
    //   290: putfield 652	com/google/android/gms/measurement/internal/Ac:e	J
    //   293: iload 4
    //   295: ifeq +23 -> 318
    //   298: aload 11
    //   300: astore 12
    //   302: aload 11
    //   304: astore 13
    //   306: aload 9
    //   308: aload 9
    //   310: getfield 644	com/google/android/gms/measurement/internal/Ac:b	J
    //   313: lconst_1
    //   314: ladd
    //   315: putfield 644	com/google/android/gms/measurement/internal/Ac:b	J
    //   318: iload 5
    //   320: ifeq +23 -> 343
    //   323: aload 11
    //   325: astore 12
    //   327: aload 11
    //   329: astore 13
    //   331: aload 9
    //   333: aload 9
    //   335: getfield 646	com/google/android/gms/measurement/internal/Ac:a	J
    //   338: lconst_1
    //   339: ladd
    //   340: putfield 646	com/google/android/gms/measurement/internal/Ac:a	J
    //   343: iload 6
    //   345: ifeq +23 -> 368
    //   348: aload 11
    //   350: astore 12
    //   352: aload 11
    //   354: astore 13
    //   356: aload 9
    //   358: aload 9
    //   360: getfield 648	com/google/android/gms/measurement/internal/Ac:c	J
    //   363: lconst_1
    //   364: ladd
    //   365: putfield 648	com/google/android/gms/measurement/internal/Ac:c	J
    //   368: iload 7
    //   370: ifeq +23 -> 393
    //   373: aload 11
    //   375: astore 12
    //   377: aload 11
    //   379: astore 13
    //   381: aload 9
    //   383: aload 9
    //   385: getfield 650	com/google/android/gms/measurement/internal/Ac:d	J
    //   388: lconst_1
    //   389: ladd
    //   390: putfield 650	com/google/android/gms/measurement/internal/Ac:d	J
    //   393: iload 8
    //   395: ifeq +23 -> 418
    //   398: aload 11
    //   400: astore 12
    //   402: aload 11
    //   404: astore 13
    //   406: aload 9
    //   408: aload 9
    //   410: getfield 652	com/google/android/gms/measurement/internal/Ac:e	J
    //   413: lconst_1
    //   414: ladd
    //   415: putfield 652	com/google/android/gms/measurement/internal/Ac:e	J
    //   418: aload 11
    //   420: astore 12
    //   422: aload 11
    //   424: astore 13
    //   426: new 314	android/content/ContentValues
    //   429: astore 10
    //   431: aload 11
    //   433: astore 12
    //   435: aload 11
    //   437: astore 13
    //   439: aload 10
    //   441: invokespecial 371	android/content/ContentValues:<init>	()V
    //   444: aload 11
    //   446: astore 12
    //   448: aload 11
    //   450: astore 13
    //   452: aload 10
    //   454: ldc 73
    //   456: lload_1
    //   457: invokestatic 301	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   460: invokevirtual 321	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   463: aload 11
    //   465: astore 12
    //   467: aload 11
    //   469: astore 13
    //   471: aload 10
    //   473: ldc 77
    //   475: aload 9
    //   477: getfield 646	com/google/android/gms/measurement/internal/Ac:a	J
    //   480: invokestatic 301	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   483: invokevirtual 321	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   486: aload 11
    //   488: astore 12
    //   490: aload 11
    //   492: astore 13
    //   494: aload 10
    //   496: ldc 81
    //   498: aload 9
    //   500: getfield 644	com/google/android/gms/measurement/internal/Ac:b	J
    //   503: invokestatic 301	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   506: invokevirtual 321	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   509: aload 11
    //   511: astore 12
    //   513: aload 11
    //   515: astore 13
    //   517: aload 10
    //   519: ldc 85
    //   521: aload 9
    //   523: getfield 648	com/google/android/gms/measurement/internal/Ac:c	J
    //   526: invokestatic 301	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   529: invokevirtual 321	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   532: aload 11
    //   534: astore 12
    //   536: aload 11
    //   538: astore 13
    //   540: aload 10
    //   542: ldc 109
    //   544: aload 9
    //   546: getfield 650	com/google/android/gms/measurement/internal/Ac:d	J
    //   549: invokestatic 301	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   552: invokevirtual 321	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   555: aload 11
    //   557: astore 12
    //   559: aload 11
    //   561: astore 13
    //   563: aload 10
    //   565: ldc 113
    //   567: aload 9
    //   569: getfield 652	com/google/android/gms/measurement/internal/Ac:e	J
    //   572: invokestatic 301	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   575: invokevirtual 321	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   578: aload 11
    //   580: astore 12
    //   582: aload 11
    //   584: astore 13
    //   586: aload 14
    //   588: ldc_w 634
    //   591: aload 10
    //   593: ldc_w 636
    //   596: iconst_1
    //   597: anewarray 19	java/lang/String
    //   600: dup
    //   601: iconst_0
    //   602: aload_3
    //   603: aastore
    //   604: invokevirtual 656	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   607: pop
    //   608: aload 11
    //   610: ifnull +10 -> 620
    //   613: aload 11
    //   615: invokeinterface 244 1 0
    //   620: aload 9
    //   622: areturn
    //   623: astore_3
    //   624: goto +43 -> 667
    //   627: astore 11
    //   629: aload 13
    //   631: astore 12
    //   633: aload_0
    //   634: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   637: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   640: ldc_w 658
    //   643: aload_3
    //   644: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   647: aload 11
    //   649: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   652: aload 13
    //   654: ifnull +10 -> 664
    //   657: aload 13
    //   659: invokeinterface 244 1 0
    //   664: aload 9
    //   666: areturn
    //   667: aload 12
    //   669: ifnull +10 -> 679
    //   672: aload 12
    //   674: invokeinterface 244 1 0
    //   679: aload_3
    //   680: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	681	0	this	zc
    //   0	681	1	paramLong	long
    //   0	681	3	paramString	String
    //   0	681	4	paramBoolean1	boolean
    //   0	681	5	paramBoolean2	boolean
    //   0	681	6	paramBoolean3	boolean
    //   0	681	7	paramBoolean4	boolean
    //   0	681	8	paramBoolean5	boolean
    //   20	645	9	localAc	Ac
    //   23	569	10	localContentValues	ContentValues
    //   26	588	11	localCursor	Cursor
    //   627	21	11	localSQLiteException	SQLiteException
    //   30	643	12	localObject1	Object
    //   34	624	13	localObject2	Object
    //   40	547	14	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   36	42	623	finally
    //   50	109	623	finally
    //   117	127	623	finally
    //   135	152	623	finally
    //   175	188	623	finally
    //   196	209	623	finally
    //   217	230	623	finally
    //   238	251	623	finally
    //   259	272	623	finally
    //   280	293	623	finally
    //   306	318	623	finally
    //   331	343	623	finally
    //   356	368	623	finally
    //   381	393	623	finally
    //   406	418	623	finally
    //   426	431	623	finally
    //   439	444	623	finally
    //   452	463	623	finally
    //   471	486	623	finally
    //   494	509	623	finally
    //   517	532	623	finally
    //   540	555	623	finally
    //   563	578	623	finally
    //   586	608	623	finally
    //   633	652	623	finally
    //   36	42	627	android/database/sqlite/SQLiteException
    //   50	109	627	android/database/sqlite/SQLiteException
    //   117	127	627	android/database/sqlite/SQLiteException
    //   135	152	627	android/database/sqlite/SQLiteException
    //   175	188	627	android/database/sqlite/SQLiteException
    //   196	209	627	android/database/sqlite/SQLiteException
    //   217	230	627	android/database/sqlite/SQLiteException
    //   238	251	627	android/database/sqlite/SQLiteException
    //   259	272	627	android/database/sqlite/SQLiteException
    //   280	293	627	android/database/sqlite/SQLiteException
    //   306	318	627	android/database/sqlite/SQLiteException
    //   331	343	627	android/database/sqlite/SQLiteException
    //   356	368	627	android/database/sqlite/SQLiteException
    //   381	393	627	android/database/sqlite/SQLiteException
    //   406	418	627	android/database/sqlite/SQLiteException
    //   426	431	627	android/database/sqlite/SQLiteException
    //   439	444	627	android/database/sqlite/SQLiteException
    //   452	463	627	android/database/sqlite/SQLiteException
    //   471	486	627	android/database/sqlite/SQLiteException
    //   494	509	627	android/database/sqlite/SQLiteException
    //   517	532	627	android/database/sqlite/SQLiteException
    //   540	555	627	android/database/sqlite/SQLiteException
    //   563	578	627	android/database/sqlite/SQLiteException
    //   586	608	627	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final String a(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   4: aload_0
    //   5: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   8: aload_0
    //   9: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   12: ldc_w 660
    //   15: iconst_1
    //   16: anewarray 19	java/lang/String
    //   19: dup
    //   20: iconst_0
    //   21: lload_1
    //   22: invokestatic 551	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   25: aastore
    //   26: invokevirtual 232	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   29: astore_3
    //   30: aload_3
    //   31: astore 4
    //   33: aload_3
    //   34: invokeinterface 237 1 0
    //   39: ifne +31 -> 70
    //   42: aload_3
    //   43: astore 4
    //   45: aload_0
    //   46: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   49: invokevirtual 555	com/google/android/gms/measurement/internal/v:A	()Lcom/google/android/gms/measurement/internal/x;
    //   52: ldc_w 662
    //   55: invokevirtual 283	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;)V
    //   58: aload_3
    //   59: ifnull +9 -> 68
    //   62: aload_3
    //   63: invokeinterface 244 1 0
    //   68: aconst_null
    //   69: areturn
    //   70: aload_3
    //   71: astore 4
    //   73: aload_3
    //   74: iconst_0
    //   75: invokeinterface 287 2 0
    //   80: astore 5
    //   82: aload_3
    //   83: ifnull +9 -> 92
    //   86: aload_3
    //   87: invokeinterface 244 1 0
    //   92: aload 5
    //   94: areturn
    //   95: astore 5
    //   97: goto +14 -> 111
    //   100: astore_3
    //   101: aconst_null
    //   102: astore 4
    //   104: goto +38 -> 142
    //   107: astore 5
    //   109: aconst_null
    //   110: astore_3
    //   111: aload_3
    //   112: astore 4
    //   114: aload_0
    //   115: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   118: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   121: ldc_w 664
    //   124: aload 5
    //   126: invokevirtual 278	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   129: aload_3
    //   130: ifnull +9 -> 139
    //   133: aload_3
    //   134: invokeinterface 244 1 0
    //   139: aconst_null
    //   140: areturn
    //   141: astore_3
    //   142: aload 4
    //   144: ifnull +10 -> 154
    //   147: aload 4
    //   149: invokeinterface 244 1 0
    //   154: aload_3
    //   155: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	156	0	this	zc
    //   0	156	1	paramLong	long
    //   29	58	3	localCursor	Cursor
    //   100	1	3	localObject1	Object
    //   110	24	3	localObject2	Object
    //   141	14	3	localObject3	Object
    //   31	117	4	localObject4	Object
    //   80	13	5	str	String
    //   95	1	5	localSQLiteException1	SQLiteException
    //   107	18	5	localSQLiteException2	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   33	42	95	android/database/sqlite/SQLiteException
    //   45	58	95	android/database/sqlite/SQLiteException
    //   73	82	95	android/database/sqlite/SQLiteException
    //   8	30	100	finally
    //   8	30	107	android/database/sqlite/SQLiteException
    //   33	42	141	finally
    //   45	58	141	finally
    //   73	82	141	finally
    //   114	129	141	finally
  }
  
  /* Error */
  public final List<gc> a(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   9: aload_0
    //   10: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   13: new 445	java/util/ArrayList
    //   16: dup
    //   17: invokespecial 446	java/util/ArrayList:<init>	()V
    //   20: astore_2
    //   21: aload_0
    //   22: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   25: ldc_w 667
    //   28: iconst_4
    //   29: anewarray 19	java/lang/String
    //   32: dup
    //   33: iconst_0
    //   34: ldc_w 669
    //   37: aastore
    //   38: dup
    //   39: iconst_1
    //   40: ldc 43
    //   42: aastore
    //   43: dup
    //   44: iconst_2
    //   45: ldc_w 671
    //   48: aastore
    //   49: dup
    //   50: iconst_3
    //   51: ldc_w 673
    //   54: aastore
    //   55: ldc_w 636
    //   58: iconst_1
    //   59: anewarray 19	java/lang/String
    //   62: dup
    //   63: iconst_0
    //   64: aload_1
    //   65: aastore
    //   66: aconst_null
    //   67: aconst_null
    //   68: ldc_w 675
    //   71: ldc_w 677
    //   74: invokevirtual 680	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   77: astore_3
    //   78: aload_3
    //   79: astore 4
    //   81: aload_3
    //   82: invokeinterface 237 1 0
    //   87: istore 5
    //   89: iload 5
    //   91: ifne +15 -> 106
    //   94: aload_3
    //   95: ifnull +9 -> 104
    //   98: aload_3
    //   99: invokeinterface 244 1 0
    //   104: aload_2
    //   105: areturn
    //   106: aload_3
    //   107: astore 4
    //   109: aload_3
    //   110: iconst_0
    //   111: invokeinterface 287 2 0
    //   116: astore 6
    //   118: aload_3
    //   119: astore 4
    //   121: aload_3
    //   122: iconst_1
    //   123: invokeinterface 287 2 0
    //   128: astore 7
    //   130: aload 7
    //   132: astore 8
    //   134: aload 7
    //   136: ifnonnull +8 -> 144
    //   139: ldc_w 682
    //   142: astore 8
    //   144: aload_3
    //   145: astore 4
    //   147: aload_3
    //   148: iconst_2
    //   149: invokeinterface 241 2 0
    //   154: lstore 9
    //   156: aload_3
    //   157: astore 4
    //   159: aload_0
    //   160: aload_3
    //   161: iconst_3
    //   162: invokespecial 684	com/google/android/gms/measurement/internal/zc:a	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   165: astore 7
    //   167: aload 7
    //   169: ifnonnull +26 -> 195
    //   172: aload_3
    //   173: astore 4
    //   175: aload_0
    //   176: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   179: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   182: ldc_w 686
    //   185: aload_1
    //   186: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   189: invokevirtual 278	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   192: goto +40 -> 232
    //   195: aload_3
    //   196: astore 4
    //   198: new 688	com/google/android/gms/measurement/internal/gc
    //   201: astore 11
    //   203: aload_3
    //   204: astore 4
    //   206: aload 11
    //   208: aload_1
    //   209: aload 8
    //   211: aload 6
    //   213: lload 9
    //   215: aload 7
    //   217: invokespecial 691	com/google/android/gms/measurement/internal/gc:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   220: aload_3
    //   221: astore 4
    //   223: aload_2
    //   224: aload 11
    //   226: invokeinterface 466 2 0
    //   231: pop
    //   232: aload_3
    //   233: astore 4
    //   235: aload_3
    //   236: invokeinterface 694 1 0
    //   241: istore 5
    //   243: iload 5
    //   245: ifne -139 -> 106
    //   248: aload_3
    //   249: ifnull +9 -> 258
    //   252: aload_3
    //   253: invokeinterface 244 1 0
    //   258: aload_2
    //   259: areturn
    //   260: astore 8
    //   262: goto +14 -> 276
    //   265: astore_1
    //   266: aconst_null
    //   267: astore 4
    //   269: goto +42 -> 311
    //   272: astore 8
    //   274: aconst_null
    //   275: astore_3
    //   276: aload_3
    //   277: astore 4
    //   279: aload_0
    //   280: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   283: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   286: ldc_w 696
    //   289: aload_1
    //   290: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   293: aload 8
    //   295: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   298: aload_3
    //   299: ifnull +9 -> 308
    //   302: aload_3
    //   303: invokeinterface 244 1 0
    //   308: aconst_null
    //   309: areturn
    //   310: astore_1
    //   311: aload 4
    //   313: ifnull +10 -> 323
    //   316: aload 4
    //   318: invokeinterface 244 1 0
    //   323: aload_1
    //   324: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	325	0	this	zc
    //   0	325	1	paramString	String
    //   20	239	2	localArrayList	ArrayList
    //   77	226	3	localCursor1	Cursor
    //   79	238	4	localCursor2	Cursor
    //   87	157	5	bool	boolean
    //   116	96	6	str	String
    //   128	88	7	localObject1	Object
    //   132	78	8	localObject2	Object
    //   260	1	8	localSQLiteException1	SQLiteException
    //   272	22	8	localSQLiteException2	SQLiteException
    //   154	60	9	l	long
    //   201	24	11	localgc	gc
    // Exception table:
    //   from	to	target	type
    //   81	89	260	android/database/sqlite/SQLiteException
    //   109	118	260	android/database/sqlite/SQLiteException
    //   121	130	260	android/database/sqlite/SQLiteException
    //   147	156	260	android/database/sqlite/SQLiteException
    //   159	167	260	android/database/sqlite/SQLiteException
    //   175	192	260	android/database/sqlite/SQLiteException
    //   198	203	260	android/database/sqlite/SQLiteException
    //   206	220	260	android/database/sqlite/SQLiteException
    //   223	232	260	android/database/sqlite/SQLiteException
    //   235	243	260	android/database/sqlite/SQLiteException
    //   21	78	265	finally
    //   21	78	272	android/database/sqlite/SQLiteException
    //   81	89	310	finally
    //   109	118	310	finally
    //   121	130	310	finally
    //   147	156	310	finally
    //   159	167	310	finally
    //   175	192	310	finally
    //   198	203	310	finally
    //   206	220	310	finally
    //   223	232	310	finally
    //   235	243	310	finally
    //   279	298	310	finally
  }
  
  /* Error */
  public final List<android.util.Pair<UG, Long>> a(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   4: aload_0
    //   5: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   8: iload_2
    //   9: ifle +9 -> 18
    //   12: iconst_1
    //   13: istore 4
    //   15: goto +6 -> 21
    //   18: iconst_0
    //   19: istore 4
    //   21: iload 4
    //   23: invokestatic 701	com/google/android/gms/common/internal/t:a	(Z)V
    //   26: iload_3
    //   27: ifle +9 -> 36
    //   30: iconst_1
    //   31: istore 4
    //   33: goto +6 -> 39
    //   36: iconst_0
    //   37: istore 4
    //   39: iload 4
    //   41: invokestatic 701	com/google/android/gms/common/internal/t:a	(Z)V
    //   44: aload_1
    //   45: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   48: pop
    //   49: aconst_null
    //   50: astore 5
    //   52: aconst_null
    //   53: astore 6
    //   55: aload_0
    //   56: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   59: ldc_w 545
    //   62: iconst_3
    //   63: anewarray 19	java/lang/String
    //   66: dup
    //   67: iconst_0
    //   68: ldc_w 675
    //   71: aastore
    //   72: dup
    //   73: iconst_1
    //   74: ldc_w 384
    //   77: aastore
    //   78: dup
    //   79: iconst_2
    //   80: ldc -99
    //   82: aastore
    //   83: ldc_w 636
    //   86: iconst_1
    //   87: anewarray 19	java/lang/String
    //   90: dup
    //   91: iconst_0
    //   92: aload_1
    //   93: aastore
    //   94: aconst_null
    //   95: aconst_null
    //   96: ldc_w 675
    //   99: iload_2
    //   100: invokestatic 703	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   103: invokevirtual 680	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   106: astore 7
    //   108: aload 7
    //   110: astore 6
    //   112: aload 7
    //   114: astore 5
    //   116: aload 7
    //   118: invokeinterface 237 1 0
    //   123: ifne +31 -> 154
    //   126: aload 7
    //   128: astore 6
    //   130: aload 7
    //   132: astore 5
    //   134: invokestatic 709	java/util/Collections:emptyList	()Ljava/util/List;
    //   137: astore 8
    //   139: aload 7
    //   141: ifnull +10 -> 151
    //   144: aload 7
    //   146: invokeinterface 244 1 0
    //   151: aload 8
    //   153: areturn
    //   154: aload 7
    //   156: astore 6
    //   158: aload 7
    //   160: astore 5
    //   162: new 445	java/util/ArrayList
    //   165: astore 8
    //   167: aload 7
    //   169: astore 6
    //   171: aload 7
    //   173: astore 5
    //   175: aload 8
    //   177: invokespecial 446	java/util/ArrayList:<init>	()V
    //   180: iconst_0
    //   181: istore_2
    //   182: aload 7
    //   184: astore 6
    //   186: aload 7
    //   188: astore 5
    //   190: aload 7
    //   192: iconst_0
    //   193: invokeinterface 241 2 0
    //   198: lstore 9
    //   200: aload 7
    //   202: astore 6
    //   204: aload 7
    //   206: astore 5
    //   208: aload 7
    //   210: iconst_1
    //   211: invokeinterface 612 2 0
    //   216: astore 11
    //   218: aload 7
    //   220: astore 6
    //   222: aload 7
    //   224: astore 5
    //   226: aload_0
    //   227: invokevirtual 589	com/google/android/gms/measurement/internal/Vb:l	()Lcom/google/android/gms/measurement/internal/cc;
    //   230: aload 11
    //   232: invokevirtual 712	com/google/android/gms/measurement/internal/cc:b	([B)[B
    //   235: astore 12
    //   237: aload 7
    //   239: astore 6
    //   241: aload 7
    //   243: astore 5
    //   245: aload 8
    //   247: invokeinterface 714 1 0
    //   252: ifne +24 -> 276
    //   255: aload 7
    //   257: astore 6
    //   259: aload 7
    //   261: astore 5
    //   263: aload 12
    //   265: arraylength
    //   266: istore 13
    //   268: iload 13
    //   270: iload_2
    //   271: iadd
    //   272: iload_3
    //   273: if_icmpgt +203 -> 476
    //   276: aload 7
    //   278: astore 6
    //   280: aload 7
    //   282: astore 5
    //   284: aload 12
    //   286: invokestatic 717	UG:a	([B)LUG;
    //   289: astore 11
    //   291: aload 7
    //   293: astore 6
    //   295: aload 7
    //   297: astore 5
    //   299: aload 7
    //   301: iconst_2
    //   302: invokeinterface 721 2 0
    //   307: ifne +27 -> 334
    //   310: aload 7
    //   312: astore 6
    //   314: aload 7
    //   316: astore 5
    //   318: aload 11
    //   320: aload 7
    //   322: iconst_2
    //   323: invokeinterface 724 2 0
    //   328: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   331: putfield 727	UG:N	Ljava/lang/Integer;
    //   334: aload 7
    //   336: astore 6
    //   338: aload 7
    //   340: astore 5
    //   342: iload_2
    //   343: aload 12
    //   345: arraylength
    //   346: iadd
    //   347: istore 13
    //   349: aload 7
    //   351: astore 6
    //   353: aload 7
    //   355: astore 5
    //   357: aload 8
    //   359: aload 11
    //   361: lload 9
    //   363: invokestatic 301	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   366: invokestatic 623	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   369: invokeinterface 466 2 0
    //   374: pop
    //   375: goto +70 -> 445
    //   378: astore 11
    //   380: aload 7
    //   382: astore 6
    //   384: aload 7
    //   386: astore 5
    //   388: aload_0
    //   389: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   392: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   395: ldc_w 729
    //   398: aload_1
    //   399: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   402: aload 11
    //   404: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   407: iload_2
    //   408: istore 13
    //   410: goto +35 -> 445
    //   413: astore 11
    //   415: aload 7
    //   417: astore 6
    //   419: aload 7
    //   421: astore 5
    //   423: aload_0
    //   424: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   427: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   430: ldc_w 731
    //   433: aload_1
    //   434: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   437: aload 11
    //   439: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   442: iload_2
    //   443: istore 13
    //   445: aload 7
    //   447: astore 6
    //   449: aload 7
    //   451: astore 5
    //   453: aload 7
    //   455: invokeinterface 694 1 0
    //   460: istore 4
    //   462: iload 4
    //   464: ifeq +12 -> 476
    //   467: iload 13
    //   469: istore_2
    //   470: iload 13
    //   472: iload_3
    //   473: if_icmple -291 -> 182
    //   476: aload 7
    //   478: ifnull +10 -> 488
    //   481: aload 7
    //   483: invokeinterface 244 1 0
    //   488: aload 8
    //   490: areturn
    //   491: astore_1
    //   492: goto +50 -> 542
    //   495: astore 7
    //   497: aload 5
    //   499: astore 6
    //   501: aload_0
    //   502: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   505: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   508: ldc_w 733
    //   511: aload_1
    //   512: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   515: aload 7
    //   517: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   520: aload 5
    //   522: astore 6
    //   524: invokestatic 709	java/util/Collections:emptyList	()Ljava/util/List;
    //   527: astore_1
    //   528: aload 5
    //   530: ifnull +10 -> 540
    //   533: aload 5
    //   535: invokeinterface 244 1 0
    //   540: aload_1
    //   541: areturn
    //   542: aload 6
    //   544: ifnull +10 -> 554
    //   547: aload 6
    //   549: invokeinterface 244 1 0
    //   554: aload_1
    //   555: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	556	0	this	zc
    //   0	556	1	paramString	String
    //   0	556	2	paramInt1	int
    //   0	556	3	paramInt2	int
    //   13	450	4	bool	boolean
    //   50	484	5	localObject1	Object
    //   53	495	6	localObject2	Object
    //   106	376	7	localCursor	Cursor
    //   495	21	7	localSQLiteException	SQLiteException
    //   137	352	8	localObject3	Object
    //   198	164	9	l	long
    //   216	144	11	localObject4	Object
    //   378	25	11	localIOException1	IOException
    //   413	25	11	localIOException2	IOException
    //   235	109	12	arrayOfByte	byte[]
    //   266	208	13	m	int
    // Exception table:
    //   from	to	target	type
    //   284	291	378	java/io/IOException
    //   208	218	413	java/io/IOException
    //   226	237	413	java/io/IOException
    //   55	108	491	finally
    //   116	126	491	finally
    //   134	139	491	finally
    //   162	167	491	finally
    //   175	180	491	finally
    //   190	200	491	finally
    //   208	218	491	finally
    //   226	237	491	finally
    //   245	255	491	finally
    //   263	268	491	finally
    //   284	291	491	finally
    //   299	310	491	finally
    //   318	334	491	finally
    //   342	349	491	finally
    //   357	375	491	finally
    //   388	407	491	finally
    //   423	442	491	finally
    //   453	462	491	finally
    //   501	520	491	finally
    //   524	528	491	finally
    //   55	108	495	android/database/sqlite/SQLiteException
    //   116	126	495	android/database/sqlite/SQLiteException
    //   134	139	495	android/database/sqlite/SQLiteException
    //   162	167	495	android/database/sqlite/SQLiteException
    //   175	180	495	android/database/sqlite/SQLiteException
    //   190	200	495	android/database/sqlite/SQLiteException
    //   208	218	495	android/database/sqlite/SQLiteException
    //   226	237	495	android/database/sqlite/SQLiteException
    //   245	255	495	android/database/sqlite/SQLiteException
    //   263	268	495	android/database/sqlite/SQLiteException
    //   284	291	495	android/database/sqlite/SQLiteException
    //   299	310	495	android/database/sqlite/SQLiteException
    //   318	334	495	android/database/sqlite/SQLiteException
    //   342	349	495	android/database/sqlite/SQLiteException
    //   357	375	495	android/database/sqlite/SQLiteException
    //   388	407	495	android/database/sqlite/SQLiteException
    //   423	442	495	android/database/sqlite/SQLiteException
    //   453	462	495	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final List<gc> a(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   9: aload_0
    //   10: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   13: new 445	java/util/ArrayList
    //   16: dup
    //   17: invokespecial 446	java/util/ArrayList:<init>	()V
    //   20: astore 4
    //   22: aconst_null
    //   23: astore 5
    //   25: new 445	java/util/ArrayList
    //   28: astore 6
    //   30: aload 6
    //   32: iconst_3
    //   33: invokespecial 736	java/util/ArrayList:<init>	(I)V
    //   36: aload 6
    //   38: aload_1
    //   39: invokeinterface 466 2 0
    //   44: pop
    //   45: new 474	java/lang/StringBuilder
    //   48: astore 7
    //   50: aload 7
    //   52: ldc_w 636
    //   55: invokespecial 737	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   58: aload_2
    //   59: invokestatic 347	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   62: istore 8
    //   64: iload 8
    //   66: ifne +24 -> 90
    //   69: aload 6
    //   71: aload_2
    //   72: invokeinterface 466 2 0
    //   77: pop
    //   78: aload 7
    //   80: ldc_w 739
    //   83: invokevirtual 486	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: goto +3 -> 90
    //   90: aload_2
    //   91: astore 9
    //   93: aload_3
    //   94: invokestatic 347	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   97: ifne +30 -> 127
    //   100: aload 6
    //   102: aload_3
    //   103: invokestatic 361	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   106: ldc_w 741
    //   109: invokevirtual 744	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   112: invokeinterface 466 2 0
    //   117: pop
    //   118: aload 7
    //   120: ldc_w 746
    //   123: invokevirtual 486	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: aload 6
    //   129: aload 6
    //   131: invokeinterface 452 1 0
    //   136: anewarray 19	java/lang/String
    //   139: invokeinterface 750 2 0
    //   144: checkcast 751	[Ljava/lang/String;
    //   147: astore 10
    //   149: aload_0
    //   150: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   153: astore 6
    //   155: aload 7
    //   157: invokevirtual 491	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: astore 7
    //   162: aload 6
    //   164: ldc_w 667
    //   167: iconst_4
    //   168: anewarray 19	java/lang/String
    //   171: dup
    //   172: iconst_0
    //   173: ldc_w 669
    //   176: aastore
    //   177: dup
    //   178: iconst_1
    //   179: ldc_w 671
    //   182: aastore
    //   183: dup
    //   184: iconst_2
    //   185: ldc_w 673
    //   188: aastore
    //   189: dup
    //   190: iconst_3
    //   191: ldc 43
    //   193: aastore
    //   194: aload 7
    //   196: aload 10
    //   198: aconst_null
    //   199: aconst_null
    //   200: ldc_w 675
    //   203: ldc_w 753
    //   206: invokevirtual 680	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   209: astore 6
    //   211: aload 9
    //   213: astore 5
    //   215: aload 6
    //   217: invokeinterface 237 1 0
    //   222: istore 8
    //   224: aload 9
    //   226: astore_2
    //   227: iload 8
    //   229: ifne +18 -> 247
    //   232: aload 6
    //   234: ifnull +10 -> 244
    //   237: aload 6
    //   239: invokeinterface 244 1 0
    //   244: aload 4
    //   246: areturn
    //   247: aload_2
    //   248: astore 5
    //   250: aload 4
    //   252: invokeinterface 452 1 0
    //   257: sipush 1000
    //   260: if_icmplt +28 -> 288
    //   263: aload_2
    //   264: astore 5
    //   266: aload_0
    //   267: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   270: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   273: ldc_w 755
    //   276: sipush 1000
    //   279: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   282: invokevirtual 278	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   285: goto +144 -> 429
    //   288: aload_2
    //   289: astore 5
    //   291: aload 6
    //   293: iconst_0
    //   294: invokeinterface 287 2 0
    //   299: astore 7
    //   301: aload_2
    //   302: astore 5
    //   304: aload 6
    //   306: iconst_1
    //   307: invokeinterface 241 2 0
    //   312: lstore 11
    //   314: aload 6
    //   316: astore 9
    //   318: aload_0
    //   319: aload 6
    //   321: iconst_2
    //   322: invokespecial 684	com/google/android/gms/measurement/internal/zc:a	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   325: astore 10
    //   327: aload 6
    //   329: astore 9
    //   331: aload 6
    //   333: iconst_3
    //   334: invokeinterface 287 2 0
    //   339: astore 5
    //   341: aload 10
    //   343: ifnonnull +30 -> 373
    //   346: aload 6
    //   348: astore 9
    //   350: aload_0
    //   351: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   354: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   357: ldc_w 757
    //   360: aload_1
    //   361: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   364: aload 5
    //   366: aload_3
    //   367: invokevirtual 364	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   370: goto +41 -> 411
    //   373: aload 6
    //   375: astore 9
    //   377: new 688	com/google/android/gms/measurement/internal/gc
    //   380: astore_2
    //   381: aload 6
    //   383: astore 9
    //   385: aload_2
    //   386: aload_1
    //   387: aload 5
    //   389: aload 7
    //   391: lload 11
    //   393: aload 10
    //   395: invokespecial 691	com/google/android/gms/measurement/internal/gc:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   398: aload 6
    //   400: astore 9
    //   402: aload 4
    //   404: aload_2
    //   405: invokeinterface 466 2 0
    //   410: pop
    //   411: aload 6
    //   413: astore 9
    //   415: aload 6
    //   417: invokeinterface 694 1 0
    //   422: istore 8
    //   424: iload 8
    //   426: ifne +18 -> 444
    //   429: aload 6
    //   431: ifnull +10 -> 441
    //   434: aload 6
    //   436: invokeinterface 244 1 0
    //   441: aload 4
    //   443: areturn
    //   444: aload 5
    //   446: astore_2
    //   447: goto -200 -> 247
    //   450: astore_3
    //   451: aload 5
    //   453: astore_2
    //   454: goto +37 -> 491
    //   457: astore_3
    //   458: goto +33 -> 491
    //   461: astore_1
    //   462: goto +71 -> 533
    //   465: astore_3
    //   466: aload 5
    //   468: astore_2
    //   469: goto +22 -> 491
    //   472: astore_3
    //   473: goto +15 -> 488
    //   476: astore_3
    //   477: goto +11 -> 488
    //   480: astore_1
    //   481: aload 5
    //   483: astore_2
    //   484: goto +52 -> 536
    //   487: astore_3
    //   488: aconst_null
    //   489: astore 6
    //   491: aload 6
    //   493: astore 9
    //   495: aload_0
    //   496: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   499: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   502: ldc_w 759
    //   505: aload_1
    //   506: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   509: aload_2
    //   510: aload_3
    //   511: invokevirtual 364	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   514: aload 6
    //   516: ifnull +10 -> 526
    //   519: aload 6
    //   521: invokeinterface 244 1 0
    //   526: aconst_null
    //   527: areturn
    //   528: astore_1
    //   529: aload 9
    //   531: astore 6
    //   533: aload 6
    //   535: astore_2
    //   536: aload_2
    //   537: ifnull +9 -> 546
    //   540: aload_2
    //   541: invokeinterface 244 1 0
    //   546: aload_1
    //   547: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	548	0	this	zc
    //   0	548	1	paramString1	String
    //   0	548	2	paramString2	String
    //   0	548	3	paramString3	String
    //   20	422	4	localArrayList	ArrayList
    //   23	459	5	localObject1	Object
    //   28	506	6	localObject2	Object
    //   48	342	7	localObject3	Object
    //   62	363	8	bool	boolean
    //   91	439	9	localObject4	Object
    //   147	247	10	localObject5	Object
    //   312	80	11	l	long
    // Exception table:
    //   from	to	target	type
    //   350	370	450	android/database/sqlite/SQLiteException
    //   377	381	450	android/database/sqlite/SQLiteException
    //   385	398	450	android/database/sqlite/SQLiteException
    //   402	411	450	android/database/sqlite/SQLiteException
    //   415	424	450	android/database/sqlite/SQLiteException
    //   318	327	457	android/database/sqlite/SQLiteException
    //   331	341	457	android/database/sqlite/SQLiteException
    //   215	224	461	finally
    //   250	263	461	finally
    //   266	285	461	finally
    //   291	301	461	finally
    //   304	314	461	finally
    //   215	224	465	android/database/sqlite/SQLiteException
    //   250	263	465	android/database/sqlite/SQLiteException
    //   266	285	465	android/database/sqlite/SQLiteException
    //   291	301	465	android/database/sqlite/SQLiteException
    //   304	314	465	android/database/sqlite/SQLiteException
    //   69	87	472	android/database/sqlite/SQLiteException
    //   93	127	472	android/database/sqlite/SQLiteException
    //   127	211	472	android/database/sqlite/SQLiteException
    //   36	64	476	android/database/sqlite/SQLiteException
    //   25	36	480	finally
    //   36	64	480	finally
    //   69	87	480	finally
    //   93	127	480	finally
    //   127	211	480	finally
    //   25	36	487	android/database/sqlite/SQLiteException
    //   318	327	528	finally
    //   331	341	528	finally
    //   350	370	528	finally
    //   377	381	528	finally
    //   385	398	528	finally
    //   402	411	528	finally
    //   415	424	528	finally
    //   495	514	528	finally
  }
  
  /* Error */
  public final List<uc> a(String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   4: aload_0
    //   5: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   8: new 445	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 446	java/util/ArrayList:<init>	()V
    //   15: astore_3
    //   16: aconst_null
    //   17: astore 4
    //   19: aconst_null
    //   20: astore 5
    //   22: aload_0
    //   23: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   26: ldc_w 763
    //   29: bipush 13
    //   31: anewarray 19	java/lang/String
    //   34: dup
    //   35: iconst_0
    //   36: ldc_w 373
    //   39: aastore
    //   40: dup
    //   41: iconst_1
    //   42: ldc 43
    //   44: aastore
    //   45: dup
    //   46: iconst_2
    //   47: ldc_w 669
    //   50: aastore
    //   51: dup
    //   52: iconst_3
    //   53: ldc_w 673
    //   56: aastore
    //   57: dup
    //   58: iconst_4
    //   59: ldc_w 765
    //   62: aastore
    //   63: dup
    //   64: iconst_5
    //   65: ldc_w 767
    //   68: aastore
    //   69: dup
    //   70: bipush 6
    //   72: ldc_w 769
    //   75: aastore
    //   76: dup
    //   77: bipush 7
    //   79: ldc_w 771
    //   82: aastore
    //   83: dup
    //   84: bipush 8
    //   86: ldc_w 773
    //   89: aastore
    //   90: dup
    //   91: bipush 9
    //   93: ldc_w 775
    //   96: aastore
    //   97: dup
    //   98: bipush 10
    //   100: ldc_w 777
    //   103: aastore
    //   104: dup
    //   105: bipush 11
    //   107: ldc_w 779
    //   110: aastore
    //   111: dup
    //   112: bipush 12
    //   114: ldc_w 781
    //   117: aastore
    //   118: aload_1
    //   119: aload_2
    //   120: aconst_null
    //   121: aconst_null
    //   122: ldc_w 675
    //   125: ldc_w 753
    //   128: invokevirtual 680	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   131: astore_1
    //   132: aload_1
    //   133: astore 5
    //   135: aload_1
    //   136: astore 4
    //   138: aload_1
    //   139: invokeinterface 237 1 0
    //   144: istore 6
    //   146: iload 6
    //   148: ifne +15 -> 163
    //   151: aload_1
    //   152: ifnull +9 -> 161
    //   155: aload_1
    //   156: invokeinterface 244 1 0
    //   161: aload_3
    //   162: areturn
    //   163: aload_1
    //   164: astore 5
    //   166: aload_1
    //   167: astore 4
    //   169: aload_3
    //   170: invokeinterface 452 1 0
    //   175: sipush 1000
    //   178: if_icmplt +31 -> 209
    //   181: aload_1
    //   182: astore 5
    //   184: aload_1
    //   185: astore 4
    //   187: aload_0
    //   188: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   191: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   194: ldc_w 783
    //   197: sipush 1000
    //   200: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   203: invokevirtual 278	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   206: goto +356 -> 562
    //   209: iconst_0
    //   210: istore 6
    //   212: aload_1
    //   213: astore 5
    //   215: aload_1
    //   216: astore 4
    //   218: aload_1
    //   219: iconst_0
    //   220: invokeinterface 287 2 0
    //   225: astore_2
    //   226: aload_1
    //   227: astore 5
    //   229: aload_1
    //   230: astore 4
    //   232: aload_1
    //   233: iconst_1
    //   234: invokeinterface 287 2 0
    //   239: astore 7
    //   241: aload_1
    //   242: astore 5
    //   244: aload_1
    //   245: astore 4
    //   247: aload_1
    //   248: iconst_2
    //   249: invokeinterface 287 2 0
    //   254: astore 8
    //   256: aload_1
    //   257: astore 5
    //   259: aload_1
    //   260: astore 4
    //   262: aload_0
    //   263: aload_1
    //   264: iconst_3
    //   265: invokespecial 684	com/google/android/gms/measurement/internal/zc:a	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   268: astore 9
    //   270: aload_1
    //   271: astore 5
    //   273: aload_1
    //   274: astore 4
    //   276: aload_1
    //   277: iconst_4
    //   278: invokeinterface 724 2 0
    //   283: ifeq +6 -> 289
    //   286: iconst_1
    //   287: istore 6
    //   289: aload_1
    //   290: astore 5
    //   292: aload_1
    //   293: astore 4
    //   295: aload_1
    //   296: iconst_5
    //   297: invokeinterface 287 2 0
    //   302: astore 10
    //   304: aload_1
    //   305: astore 5
    //   307: aload_1
    //   308: astore 4
    //   310: aload_1
    //   311: bipush 6
    //   313: invokeinterface 241 2 0
    //   318: lstore 11
    //   320: aload_1
    //   321: astore 5
    //   323: aload_1
    //   324: astore 4
    //   326: aload_0
    //   327: invokevirtual 589	com/google/android/gms/measurement/internal/Vb:l	()Lcom/google/android/gms/measurement/internal/cc;
    //   330: aload_1
    //   331: bipush 7
    //   333: invokeinterface 612 2 0
    //   338: getstatic 789	com/google/android/gms/measurement/internal/k:CREATOR	Landroid/os/Parcelable$Creator;
    //   341: invokevirtual 792	com/google/android/gms/measurement/internal/cc:a	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   344: checkcast 785	com/google/android/gms/measurement/internal/k
    //   347: astore 13
    //   349: aload_1
    //   350: astore 5
    //   352: aload_1
    //   353: astore 4
    //   355: aload_1
    //   356: bipush 8
    //   358: invokeinterface 241 2 0
    //   363: lstore 14
    //   365: aload_1
    //   366: astore 5
    //   368: aload_1
    //   369: astore 4
    //   371: aload_0
    //   372: invokevirtual 589	com/google/android/gms/measurement/internal/Vb:l	()Lcom/google/android/gms/measurement/internal/cc;
    //   375: aload_1
    //   376: bipush 9
    //   378: invokeinterface 612 2 0
    //   383: getstatic 789	com/google/android/gms/measurement/internal/k:CREATOR	Landroid/os/Parcelable$Creator;
    //   386: invokevirtual 792	com/google/android/gms/measurement/internal/cc:a	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   389: checkcast 785	com/google/android/gms/measurement/internal/k
    //   392: astore 16
    //   394: aload_1
    //   395: astore 5
    //   397: aload_1
    //   398: astore 4
    //   400: aload_1
    //   401: bipush 10
    //   403: invokeinterface 241 2 0
    //   408: lstore 17
    //   410: aload_1
    //   411: astore 5
    //   413: aload_1
    //   414: astore 4
    //   416: aload_1
    //   417: bipush 11
    //   419: invokeinterface 241 2 0
    //   424: lstore 19
    //   426: aload_1
    //   427: astore 5
    //   429: aload_1
    //   430: astore 4
    //   432: aload_0
    //   433: invokevirtual 589	com/google/android/gms/measurement/internal/Vb:l	()Lcom/google/android/gms/measurement/internal/cc;
    //   436: aload_1
    //   437: bipush 12
    //   439: invokeinterface 612 2 0
    //   444: getstatic 789	com/google/android/gms/measurement/internal/k:CREATOR	Landroid/os/Parcelable$Creator;
    //   447: invokevirtual 792	com/google/android/gms/measurement/internal/cc:a	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   450: checkcast 785	com/google/android/gms/measurement/internal/k
    //   453: astore 21
    //   455: aload_1
    //   456: astore 5
    //   458: aload_1
    //   459: astore 4
    //   461: new 794	com/google/android/gms/measurement/internal/ec
    //   464: astore 22
    //   466: aload_1
    //   467: astore 5
    //   469: aload_1
    //   470: astore 4
    //   472: aload 22
    //   474: aload 8
    //   476: lload 17
    //   478: aload 9
    //   480: aload 7
    //   482: invokespecial 797	com/google/android/gms/measurement/internal/ec:<init>	(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
    //   485: aload_1
    //   486: astore 5
    //   488: aload_1
    //   489: astore 4
    //   491: new 799	com/google/android/gms/measurement/internal/uc
    //   494: astore 9
    //   496: aload_1
    //   497: astore 5
    //   499: aload_1
    //   500: astore 4
    //   502: aload 9
    //   504: aload_2
    //   505: aload 7
    //   507: aload 22
    //   509: lload 14
    //   511: iload 6
    //   513: aload 10
    //   515: aload 13
    //   517: lload 11
    //   519: aload 16
    //   521: lload 19
    //   523: aload 21
    //   525: invokespecial 802	com/google/android/gms/measurement/internal/uc:<init>	(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/ec;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/k;JLcom/google/android/gms/measurement/internal/k;JLcom/google/android/gms/measurement/internal/k;)V
    //   528: aload_1
    //   529: astore 5
    //   531: aload_1
    //   532: astore 4
    //   534: aload_3
    //   535: aload 9
    //   537: invokeinterface 466 2 0
    //   542: pop
    //   543: aload_1
    //   544: astore 5
    //   546: aload_1
    //   547: astore 4
    //   549: aload_1
    //   550: invokeinterface 694 1 0
    //   555: istore 6
    //   557: iload 6
    //   559: ifne -396 -> 163
    //   562: aload_1
    //   563: ifnull +9 -> 572
    //   566: aload_1
    //   567: invokeinterface 244 1 0
    //   572: aload_3
    //   573: areturn
    //   574: astore_1
    //   575: goto +44 -> 619
    //   578: astore_1
    //   579: aload 4
    //   581: astore 5
    //   583: aload_0
    //   584: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   587: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   590: ldc_w 804
    //   593: aload_1
    //   594: invokevirtual 278	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   597: aload 4
    //   599: astore 5
    //   601: invokestatic 709	java/util/Collections:emptyList	()Ljava/util/List;
    //   604: astore_1
    //   605: aload 4
    //   607: ifnull +10 -> 617
    //   610: aload 4
    //   612: invokeinterface 244 1 0
    //   617: aload_1
    //   618: areturn
    //   619: aload 5
    //   621: ifnull +10 -> 631
    //   624: aload 5
    //   626: invokeinterface 244 1 0
    //   631: aload_1
    //   632: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	633	0	this	zc
    //   0	633	1	paramString	String
    //   0	633	2	paramArrayOfString	String[]
    //   15	558	3	localArrayList	ArrayList
    //   17	594	4	str1	String
    //   20	605	5	str2	String
    //   144	414	6	bool	boolean
    //   239	267	7	str3	String
    //   254	221	8	str4	String
    //   268	268	9	localObject	Object
    //   302	212	10	str5	String
    //   318	200	11	l1	long
    //   347	169	13	localk1	k
    //   363	147	14	l2	long
    //   392	128	16	localk2	k
    //   408	69	17	l3	long
    //   424	98	19	l4	long
    //   453	71	21	localk3	k
    //   464	44	22	localec	ec
    // Exception table:
    //   from	to	target	type
    //   22	132	574	finally
    //   138	146	574	finally
    //   169	181	574	finally
    //   187	206	574	finally
    //   218	226	574	finally
    //   232	241	574	finally
    //   247	256	574	finally
    //   262	270	574	finally
    //   276	286	574	finally
    //   295	304	574	finally
    //   310	320	574	finally
    //   326	349	574	finally
    //   355	365	574	finally
    //   371	394	574	finally
    //   400	410	574	finally
    //   416	426	574	finally
    //   432	455	574	finally
    //   461	466	574	finally
    //   472	485	574	finally
    //   491	496	574	finally
    //   502	528	574	finally
    //   534	543	574	finally
    //   549	557	574	finally
    //   583	597	574	finally
    //   601	605	574	finally
    //   22	132	578	android/database/sqlite/SQLiteException
    //   138	146	578	android/database/sqlite/SQLiteException
    //   169	181	578	android/database/sqlite/SQLiteException
    //   187	206	578	android/database/sqlite/SQLiteException
    //   218	226	578	android/database/sqlite/SQLiteException
    //   232	241	578	android/database/sqlite/SQLiteException
    //   247	256	578	android/database/sqlite/SQLiteException
    //   262	270	578	android/database/sqlite/SQLiteException
    //   276	286	578	android/database/sqlite/SQLiteException
    //   295	304	578	android/database/sqlite/SQLiteException
    //   310	320	578	android/database/sqlite/SQLiteException
    //   326	349	578	android/database/sqlite/SQLiteException
    //   355	365	578	android/database/sqlite/SQLiteException
    //   371	394	578	android/database/sqlite/SQLiteException
    //   400	410	578	android/database/sqlite/SQLiteException
    //   416	426	578	android/database/sqlite/SQLiteException
    //   432	455	578	android/database/sqlite/SQLiteException
    //   461	466	578	android/database/sqlite/SQLiteException
    //   472	485	578	android/database/sqlite/SQLiteException
    //   491	496	578	android/database/sqlite/SQLiteException
    //   502	528	578	android/database/sqlite/SQLiteException
    //   534	543	578	android/database/sqlite/SQLiteException
    //   549	557	578	android/database/sqlite/SQLiteException
  }
  
  public final void a(dc paramdc)
  {
    com.google.android.gms.common.internal.t.a(paramdc);
    j();
    r();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramdc.f());
    localContentValues.put("app_instance_id", paramdc.a());
    localContentValues.put("gmp_app_id", paramdc.c());
    localContentValues.put("resettable_device_id_hash", paramdc.h());
    localContentValues.put("last_bundle_index", Long.valueOf(paramdc.q()));
    localContentValues.put("last_bundle_start_timestamp", Long.valueOf(paramdc.i()));
    localContentValues.put("last_bundle_end_timestamp", Long.valueOf(paramdc.j()));
    localContentValues.put("app_version", paramdc.k());
    localContentValues.put("app_store", paramdc.m());
    localContentValues.put("gmp_version", Long.valueOf(paramdc.n()));
    localContentValues.put("dev_cert_hash", Long.valueOf(paramdc.o()));
    localContentValues.put("measurement_enabled", Boolean.valueOf(paramdc.d()));
    localContentValues.put("day", Long.valueOf(paramdc.u()));
    localContentValues.put("daily_public_events_count", Long.valueOf(paramdc.v()));
    localContentValues.put("daily_events_count", Long.valueOf(paramdc.w()));
    localContentValues.put("daily_conversions_count", Long.valueOf(paramdc.x()));
    localContentValues.put("config_fetched_time", Long.valueOf(paramdc.r()));
    localContentValues.put("failed_config_fetch_time", Long.valueOf(paramdc.s()));
    localContentValues.put("app_version_int", Long.valueOf(paramdc.l()));
    localContentValues.put("firebase_instance_id", paramdc.b());
    localContentValues.put("daily_error_events_count", Long.valueOf(paramdc.z()));
    localContentValues.put("daily_realtime_events_count", Long.valueOf(paramdc.y()));
    localContentValues.put("health_monitor_sample", paramdc.A());
    localContentValues.put("android_id", Long.valueOf(paramdc.C()));
    localContentValues.put("adid_reporting_enabled", Boolean.valueOf(paramdc.D()));
    localContentValues.put("ssaid_reporting_enabled", Boolean.valueOf(paramdc.E()));
    localContentValues.put("admob_app_id", paramdc.g());
    localContentValues.put("dynamite_version", Long.valueOf(paramdc.p()));
    try
    {
      SQLiteDatabase localSQLiteDatabase = w();
      if ((localSQLiteDatabase.update("apps", localContentValues, "app_id = ?", new String[] { paramdc.f() }) == 0L) && (localSQLiteDatabase.insertWithOnConflict("apps", null, localContentValues, 5) == -1L)) {
        c().s().a("Failed to insert/update app (got -1). appId", v.a(paramdc.f()));
      }
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      c().s().a("Error storing app. appId", v.a(paramdc.f()), localSQLiteException);
    }
  }
  
  public final void a(g paramg)
  {
    com.google.android.gms.common.internal.t.a(paramg);
    j();
    r();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramg.a);
    localContentValues.put("name", paramg.b);
    localContentValues.put("lifetime_count", Long.valueOf(paramg.c));
    localContentValues.put("current_bundle_count", Long.valueOf(paramg.d));
    localContentValues.put("last_fire_timestamp", Long.valueOf(paramg.e));
    localContentValues.put("last_bundled_timestamp", Long.valueOf(paramg.f));
    localContentValues.put("last_bundled_day", paramg.g);
    localContentValues.put("last_sampled_complex_event_id", paramg.h);
    localContentValues.put("last_sampling_rate", paramg.i);
    Object localObject = paramg.j;
    if ((localObject != null) && (((Boolean)localObject).booleanValue())) {
      localObject = Long.valueOf(1L);
    } else {
      localObject = null;
    }
    localContentValues.put("last_exempt_from_sampling", (Long)localObject);
    try
    {
      if (w().insertWithOnConflict("events", null, localContentValues, 5) == -1L) {
        c().s().a("Failed to insert/update event aggregates (got -1). appId", v.a(paramg.a));
      }
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      c().s().a("Error storing event aggregates. appId", v.a(paramg.a), localSQLiteException);
    }
  }
  
  final void a(String paramString, JG[] paramArrayOfJG)
  {
    r();
    j();
    com.google.android.gms.common.internal.t.b(paramString);
    com.google.android.gms.common.internal.t.a(paramArrayOfJG);
    SQLiteDatabase localSQLiteDatabase = w();
    localSQLiteDatabase.beginTransaction();
    try
    {
      r();
      j();
      com.google.android.gms.common.internal.t.b(paramString);
      Object localObject1 = w();
      int m = 0;
      ((SQLiteDatabase)localObject1).delete("property_filters", "app_id=?", new String[] { paramString });
      ((SQLiteDatabase)localObject1).delete("event_filters", "app_id=?", new String[] { paramString });
      int n = paramArrayOfJG.length;
      for (int i1 = 0; i1 < n; i1++)
      {
        localObject1 = paramArrayOfJG[i1];
        r();
        j();
        com.google.android.gms.common.internal.t.b(paramString);
        com.google.android.gms.common.internal.t.a(localObject1);
        com.google.android.gms.common.internal.t.a(((JG)localObject1).f);
        com.google.android.gms.common.internal.t.a(((JG)localObject1).e);
        if (((JG)localObject1).d == null) {
          c().v().a("Audience with no ID. appId", v.a(paramString));
        }
        for (;;)
        {
          break;
          int i2 = ((JG)localObject1).d.intValue();
          Object localObject2 = ((JG)localObject1).f;
          int i3 = localObject2.length;
          for (i4 = 0;; i4++)
          {
            if (i4 >= i3) {
              break label248;
            }
            if (localObject2[i4].d == null)
            {
              c().v().a("Event filter with no ID. Audience definition ignored. appId, audienceId", v.a(paramString), ((JG)localObject1).d);
              break;
            }
          }
          label248:
          localObject2 = ((JG)localObject1).e;
          i3 = localObject2.length;
          for (i4 = 0;; i4++)
          {
            if (i4 >= i3) {
              break label312;
            }
            if (localObject2[i4].d == null)
            {
              c().v().a("Property filter with no ID. Audience definition ignored. appId, audienceId", v.a(paramString), ((JG)localObject1).d);
              break;
            }
          }
          label312:
          localObject2 = ((JG)localObject1).f;
          i3 = localObject2.length;
          for (i4 = 0; i4 < i3; i4++) {
            if (!a(paramString, i2, localObject2[i4]))
            {
              i4 = 0;
              break label364;
            }
          }
          i4 = 1;
          label364:
          int i5 = i4;
          if (i4 != 0)
          {
            localObject1 = ((JG)localObject1).e;
            int i6 = localObject1.length;
            for (i3 = 0;; i3++)
            {
              i5 = i4;
              if (i3 >= i6) {
                break;
              }
              if (!a(paramString, i2, localObject1[i3]))
              {
                i5 = 0;
                break;
              }
            }
          }
          if (i5 == 0)
          {
            r();
            j();
            com.google.android.gms.common.internal.t.b(paramString);
            localObject1 = w();
            ((SQLiteDatabase)localObject1).delete("property_filters", "app_id=? and audience_id=?", new String[] { paramString, String.valueOf(i2) });
            ((SQLiteDatabase)localObject1).delete("event_filters", "app_id=? and audience_id=?", new String[] { paramString, String.valueOf(i2) });
          }
        }
      }
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      i1 = paramArrayOfJG.length;
      for (int i4 = m; i4 < i1; i4++) {
        ((List)localObject1).add(paramArrayOfJG[i4].d);
      }
      a(paramString, (List)localObject1);
      localSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  final void a(List<Long> paramList)
  {
    j();
    r();
    com.google.android.gms.common.internal.t.a(paramList);
    com.google.android.gms.common.internal.t.a(paramList.size());
    if (!M()) {
      return;
    }
    paramList = TextUtils.join(",", paramList);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramList).length() + 2);
    localStringBuilder.append("(");
    localStringBuilder.append(paramList);
    localStringBuilder.append(")");
    paramList = localStringBuilder.toString();
    localStringBuilder = new StringBuilder(String.valueOf(paramList).length() + 80);
    localStringBuilder.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
    localStringBuilder.append(paramList);
    localStringBuilder.append(" AND retry_count =  2147483647 LIMIT 1");
    if (b(localStringBuilder.toString(), null) > 0L) {
      c().v().a("The number of upload retries exceeds the limit. Will remain unchanged.");
    }
    try
    {
      SQLiteDatabase localSQLiteDatabase = w();
      int m = String.valueOf(paramList).length();
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(m + 127);
      localStringBuilder.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
      localStringBuilder.append(paramList);
      localStringBuilder.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
      localSQLiteDatabase.execSQL(localStringBuilder.toString());
      return;
    }
    catch (SQLiteException paramList)
    {
      c().s().a("Error incrementing retry count. error", paramList);
    }
  }
  
  public final boolean a(UG paramUG, boolean paramBoolean)
  {
    j();
    r();
    com.google.android.gms.common.internal.t.a(paramUG);
    com.google.android.gms.common.internal.t.b(paramUG.r);
    com.google.android.gms.common.internal.t.a(paramUG.i);
    A();
    long l = b().a();
    if ((paramUG.i.longValue() < l - wc.r()) || (paramUG.i.longValue() > wc.r() + l)) {
      c().v().a("Storing bundle outside of the max uploading time span. appId, now, timestamp", v.a(paramUG.r), Long.valueOf(l), paramUG.i);
    }
    Object localObject1 = gK.a(paramUG);
    try
    {
      Object localObject2 = l().c((byte[])localObject1);
      c().A().a("Saving bundle, size", Integer.valueOf(localObject2.length));
      localObject1 = new ContentValues();
      ((ContentValues)localObject1).put("app_id", paramUG.r);
      ((ContentValues)localObject1).put("bundle_end_timestamp", paramUG.i);
      ((ContentValues)localObject1).put("data", (byte[])localObject2);
      ((ContentValues)localObject1).put("has_realtime", Integer.valueOf(paramBoolean));
      localObject2 = paramUG.N;
      if (localObject2 != null) {
        ((ContentValues)localObject1).put("retry_count", (Integer)localObject2);
      }
      try
      {
        if (w().insert("queue", null, (ContentValues)localObject1) == -1L)
        {
          c().s().a("Failed to insert bundle (got -1). appId", v.a(paramUG.r));
          return false;
        }
        return true;
      }
      catch (SQLiteException localSQLiteException)
      {
        c().s().a("Error storing bundle. appId", v.a(paramUG.r), localSQLiteException);
        return false;
      }
      return false;
    }
    catch (IOException localIOException)
    {
      c().s().a("Data loss. Failed to serialize bundle. appId", v.a(paramUG.r), localIOException);
    }
  }
  
  public final boolean a(f paramf, long paramLong, boolean paramBoolean)
  {
    j();
    r();
    com.google.android.gms.common.internal.t.a(paramf);
    com.google.android.gms.common.internal.t.b(paramf.a);
    SG localSG = new SG();
    localSG.g = Long.valueOf(paramf.e);
    localSG.d = new BG[paramf.f.size()];
    Object localObject1 = paramf.f.iterator();
    for (int m = 0; ((Iterator)localObject1).hasNext(); m++)
    {
      Object localObject2 = (String)((Iterator)localObject1).next();
      localObject3 = BG.u();
      ((BG.a)localObject3).a((String)localObject2);
      localObject2 = paramf.f.b((String)localObject2);
      l().a((BG.a)localObject3, localObject2);
      localSG.d[m] = ((BG)((kI.a)localObject3).J());
    }
    Object localObject3 = gK.a(localSG);
    c().A().a("Saving event, name, data size", d().a(paramf.b), Integer.valueOf(localObject3.length));
    localObject1 = new ContentValues();
    ((ContentValues)localObject1).put("app_id", paramf.a);
    ((ContentValues)localObject1).put("name", paramf.b);
    ((ContentValues)localObject1).put("timestamp", Long.valueOf(paramf.d));
    ((ContentValues)localObject1).put("metadata_fingerprint", Long.valueOf(paramLong));
    ((ContentValues)localObject1).put("data", (byte[])localObject3);
    ((ContentValues)localObject1).put("realtime", Integer.valueOf(paramBoolean));
    try
    {
      if (w().insert("raw_events", null, (ContentValues)localObject1) == -1L)
      {
        c().s().a("Failed to insert raw event (got -1). appId", v.a(paramf.a));
        return false;
      }
      return true;
    }
    catch (SQLiteException localSQLiteException)
    {
      c().s().a("Error storing raw event. appId", v.a(paramf.a), localSQLiteException);
    }
    return false;
  }
  
  public final boolean a(gc paramgc)
  {
    com.google.android.gms.common.internal.t.a(paramgc);
    j();
    r();
    if (d(paramgc.a, paramgc.c) == null) {
      if (hc.a(paramgc.c))
      {
        if (b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[] { paramgc.a }) >= 25L) {
          return false;
        }
      }
      else if (g().e(paramgc.a, m.ya))
      {
        if (!"_npa".equals(paramgc.c)) {
          if (b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[] { paramgc.a, paramgc.b }) >= 25L) {
            return false;
          }
        }
      }
      else if (b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[] { paramgc.a, paramgc.b }) >= 25L) {
        return false;
      }
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramgc.a);
    localContentValues.put("origin", paramgc.b);
    localContentValues.put("name", paramgc.c);
    localContentValues.put("set_timestamp", Long.valueOf(paramgc.d));
    a(localContentValues, "value", paramgc.e);
    try
    {
      if (w().insertWithOnConflict("user_attributes", null, localContentValues, 5) == -1L) {
        c().s().a("Failed to insert/update user property (got -1). appId", v.a(paramgc.a));
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      c().s().a("Error storing user property. appId", v.a(paramgc.a), localSQLiteException);
    }
    return true;
  }
  
  public final boolean a(uc paramuc)
  {
    com.google.android.gms.common.internal.t.a(paramuc);
    j();
    r();
    if (d(paramuc.a, paramuc.c.b) == null) {
      if (b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[] { paramuc.a }) >= 1000L) {
        return false;
      }
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramuc.a);
    localContentValues.put("origin", paramuc.b);
    localContentValues.put("name", paramuc.c.b);
    a(localContentValues, "value", paramuc.c.y());
    localContentValues.put("active", Boolean.valueOf(paramuc.e));
    localContentValues.put("trigger_event_name", paramuc.f);
    localContentValues.put("trigger_timeout", Long.valueOf(paramuc.h));
    e();
    localContentValues.put("timed_out_event", hc.a(paramuc.g));
    localContentValues.put("creation_timestamp", Long.valueOf(paramuc.d));
    e();
    localContentValues.put("triggered_event", hc.a(paramuc.i));
    localContentValues.put("triggered_timestamp", Long.valueOf(paramuc.c.c));
    localContentValues.put("time_to_live", Long.valueOf(paramuc.j));
    e();
    localContentValues.put("expired_event", hc.a(paramuc.k));
    try
    {
      if (w().insertWithOnConflict("conditional_properties", null, localContentValues, 5) == -1L) {
        c().s().a("Failed to insert/update conditional user property (got -1)", v.a(paramuc.a));
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      c().s().a("Error storing conditional user property", v.a(paramuc.a), localSQLiteException);
    }
    return true;
  }
  
  public final boolean a(String paramString, Long paramLong, long paramLong1, SG paramSG)
  {
    j();
    r();
    com.google.android.gms.common.internal.t.a(paramSG);
    com.google.android.gms.common.internal.t.b(paramString);
    com.google.android.gms.common.internal.t.a(paramLong);
    byte[] arrayOfByte = gK.a(paramSG);
    c().A().a("Saving complex main event, appId, data size", d().a(paramString), Integer.valueOf(arrayOfByte.length));
    paramSG = new ContentValues();
    paramSG.put("app_id", paramString);
    paramSG.put("event_id", paramLong);
    paramSG.put("children_to_process", Long.valueOf(paramLong1));
    paramSG.put("main_event", arrayOfByte);
    try
    {
      if (w().insertWithOnConflict("main_event_params", null, paramSG, 5) == -1L)
      {
        c().s().a("Failed to insert complex main event (got -1). appId", v.a(paramString));
        return false;
      }
      return true;
    }
    catch (SQLiteException paramLong)
    {
      c().s().a("Error storing complex main event. appId", v.a(paramString), paramLong);
    }
    return false;
  }
  
  /* Error */
  public final dc b(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   9: aload_0
    //   10: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   13: aload_0
    //   14: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   17: astore_2
    //   18: iconst_1
    //   19: istore_3
    //   20: aload_2
    //   21: ldc_w 634
    //   24: bipush 27
    //   26: anewarray 19	java/lang/String
    //   29: dup
    //   30: iconst_0
    //   31: ldc_w 812
    //   34: aastore
    //   35: dup
    //   36: iconst_1
    //   37: ldc_w 816
    //   40: aastore
    //   41: dup
    //   42: iconst_2
    //   43: ldc_w 820
    //   46: aastore
    //   47: dup
    //   48: iconst_3
    //   49: ldc_w 824
    //   52: aastore
    //   53: dup
    //   54: iconst_4
    //   55: ldc 69
    //   57: aastore
    //   58: dup
    //   59: iconst_5
    //   60: ldc_w 831
    //   63: aastore
    //   64: dup
    //   65: bipush 6
    //   67: ldc 49
    //   69: aastore
    //   70: dup
    //   71: bipush 7
    //   73: ldc 53
    //   75: aastore
    //   76: dup
    //   77: bipush 8
    //   79: ldc 57
    //   81: aastore
    //   82: dup
    //   83: bipush 9
    //   85: ldc 61
    //   87: aastore
    //   88: dup
    //   89: bipush 10
    //   91: ldc 65
    //   93: aastore
    //   94: dup
    //   95: bipush 11
    //   97: ldc 73
    //   99: aastore
    //   100: dup
    //   101: bipush 12
    //   103: ldc 77
    //   105: aastore
    //   106: dup
    //   107: bipush 13
    //   109: ldc 81
    //   111: aastore
    //   112: dup
    //   113: bipush 14
    //   115: ldc 85
    //   117: aastore
    //   118: dup
    //   119: bipush 15
    //   121: ldc 93
    //   123: aastore
    //   124: dup
    //   125: bipush 16
    //   127: ldc 97
    //   129: aastore
    //   130: dup
    //   131: bipush 17
    //   133: ldc 101
    //   135: aastore
    //   136: dup
    //   137: bipush 18
    //   139: ldc 105
    //   141: aastore
    //   142: dup
    //   143: bipush 19
    //   145: ldc 109
    //   147: aastore
    //   148: dup
    //   149: bipush 20
    //   151: ldc 113
    //   153: aastore
    //   154: dup
    //   155: bipush 21
    //   157: ldc 117
    //   159: aastore
    //   160: dup
    //   161: bipush 22
    //   163: ldc 121
    //   165: aastore
    //   166: dup
    //   167: bipush 23
    //   169: ldc 125
    //   171: aastore
    //   172: dup
    //   173: bipush 24
    //   175: ldc -127
    //   177: aastore
    //   178: dup
    //   179: bipush 25
    //   181: ldc -123
    //   183: aastore
    //   184: dup
    //   185: bipush 26
    //   187: ldc -115
    //   189: aastore
    //   190: ldc_w 636
    //   193: iconst_1
    //   194: anewarray 19	java/lang/String
    //   197: dup
    //   198: iconst_0
    //   199: aload_1
    //   200: aastore
    //   201: aconst_null
    //   202: aconst_null
    //   203: aconst_null
    //   204: invokevirtual 640	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   207: astore_2
    //   208: aload_2
    //   209: invokeinterface 237 1 0
    //   214: istore 4
    //   216: iload 4
    //   218: ifne +15 -> 233
    //   221: aload_2
    //   222: ifnull +9 -> 231
    //   225: aload_2
    //   226: invokeinterface 244 1 0
    //   231: aconst_null
    //   232: areturn
    //   233: new 808	com/google/android/gms/measurement/internal/dc
    //   236: astore 5
    //   238: aload_2
    //   239: astore 6
    //   241: aload 5
    //   243: aload_0
    //   244: getfield 1175	com/google/android/gms/measurement/internal/Vb:b	Lcom/google/android/gms/measurement/internal/Xb;
    //   247: invokevirtual 1180	com/google/android/gms/measurement/internal/Xb:s	()Lcom/google/android/gms/measurement/internal/aa;
    //   250: aload_1
    //   251: invokespecial 1183	com/google/android/gms/measurement/internal/dc:<init>	(Lcom/google/android/gms/measurement/internal/aa;Ljava/lang/String;)V
    //   254: aload_2
    //   255: astore 6
    //   257: aload 5
    //   259: aload_2
    //   260: iconst_0
    //   261: invokeinterface 287 2 0
    //   266: invokevirtual 1184	com/google/android/gms/measurement/internal/dc:a	(Ljava/lang/String;)V
    //   269: aload_2
    //   270: astore 6
    //   272: aload 5
    //   274: aload_2
    //   275: iconst_1
    //   276: invokeinterface 287 2 0
    //   281: invokevirtual 1186	com/google/android/gms/measurement/internal/dc:b	(Ljava/lang/String;)V
    //   284: aload_2
    //   285: astore 6
    //   287: aload 5
    //   289: aload_2
    //   290: iconst_2
    //   291: invokeinterface 287 2 0
    //   296: invokevirtual 1188	com/google/android/gms/measurement/internal/dc:d	(Ljava/lang/String;)V
    //   299: aload_2
    //   300: astore 6
    //   302: aload 5
    //   304: aload_2
    //   305: iconst_3
    //   306: invokeinterface 241 2 0
    //   311: invokevirtual 1190	com/google/android/gms/measurement/internal/dc:g	(J)V
    //   314: aload_2
    //   315: astore 6
    //   317: aload 5
    //   319: aload_2
    //   320: iconst_4
    //   321: invokeinterface 241 2 0
    //   326: invokevirtual 1191	com/google/android/gms/measurement/internal/dc:a	(J)V
    //   329: aload_2
    //   330: astore 6
    //   332: aload 5
    //   334: aload_2
    //   335: iconst_5
    //   336: invokeinterface 241 2 0
    //   341: invokevirtual 1193	com/google/android/gms/measurement/internal/dc:b	(J)V
    //   344: aload_2
    //   345: astore 6
    //   347: aload 5
    //   349: aload_2
    //   350: bipush 6
    //   352: invokeinterface 287 2 0
    //   357: invokevirtual 1195	com/google/android/gms/measurement/internal/dc:f	(Ljava/lang/String;)V
    //   360: aload_2
    //   361: astore 6
    //   363: aload 5
    //   365: aload_2
    //   366: bipush 7
    //   368: invokeinterface 287 2 0
    //   373: invokevirtual 1197	com/google/android/gms/measurement/internal/dc:g	(Ljava/lang/String;)V
    //   376: aload_2
    //   377: astore 6
    //   379: aload 5
    //   381: aload_2
    //   382: bipush 8
    //   384: invokeinterface 241 2 0
    //   389: invokevirtual 1199	com/google/android/gms/measurement/internal/dc:d	(J)V
    //   392: aload_2
    //   393: astore 6
    //   395: aload 5
    //   397: aload_2
    //   398: bipush 9
    //   400: invokeinterface 241 2 0
    //   405: invokevirtual 1201	com/google/android/gms/measurement/internal/dc:e	(J)V
    //   408: aload_2
    //   409: astore 6
    //   411: aload_2
    //   412: bipush 10
    //   414: invokeinterface 721 2 0
    //   419: ifne +26 -> 445
    //   422: aload_2
    //   423: astore 6
    //   425: aload_2
    //   426: bipush 10
    //   428: invokeinterface 724 2 0
    //   433: ifeq +6 -> 439
    //   436: goto +9 -> 445
    //   439: iconst_0
    //   440: istore 4
    //   442: goto +6 -> 448
    //   445: iconst_1
    //   446: istore 4
    //   448: aload_2
    //   449: astore 6
    //   451: aload 5
    //   453: iload 4
    //   455: invokevirtual 1202	com/google/android/gms/measurement/internal/dc:a	(Z)V
    //   458: aload_2
    //   459: astore 6
    //   461: aload 5
    //   463: aload_2
    //   464: bipush 11
    //   466: invokeinterface 241 2 0
    //   471: invokevirtual 1204	com/google/android/gms/measurement/internal/dc:j	(J)V
    //   474: aload_2
    //   475: astore 6
    //   477: aload 5
    //   479: aload_2
    //   480: bipush 12
    //   482: invokeinterface 241 2 0
    //   487: invokevirtual 1206	com/google/android/gms/measurement/internal/dc:k	(J)V
    //   490: aload_2
    //   491: astore 6
    //   493: aload 5
    //   495: aload_2
    //   496: bipush 13
    //   498: invokeinterface 241 2 0
    //   503: invokevirtual 1208	com/google/android/gms/measurement/internal/dc:l	(J)V
    //   506: aload_2
    //   507: astore 6
    //   509: aload 5
    //   511: aload_2
    //   512: bipush 14
    //   514: invokeinterface 241 2 0
    //   519: invokevirtual 1210	com/google/android/gms/measurement/internal/dc:m	(J)V
    //   522: aload_2
    //   523: astore 6
    //   525: aload 5
    //   527: aload_2
    //   528: bipush 15
    //   530: invokeinterface 241 2 0
    //   535: invokevirtual 1212	com/google/android/gms/measurement/internal/dc:h	(J)V
    //   538: aload_2
    //   539: astore 6
    //   541: aload 5
    //   543: aload_2
    //   544: bipush 16
    //   546: invokeinterface 241 2 0
    //   551: invokevirtual 1214	com/google/android/gms/measurement/internal/dc:i	(J)V
    //   554: aload_2
    //   555: astore 6
    //   557: aload_2
    //   558: bipush 17
    //   560: invokeinterface 721 2 0
    //   565: ifeq +11 -> 576
    //   568: ldc2_w 1215
    //   571: lstore 7
    //   573: goto +17 -> 590
    //   576: aload_2
    //   577: astore 6
    //   579: aload_2
    //   580: bipush 17
    //   582: invokeinterface 724 2 0
    //   587: i2l
    //   588: lstore 7
    //   590: aload_2
    //   591: astore 6
    //   593: aload 5
    //   595: lload 7
    //   597: invokevirtual 1218	com/google/android/gms/measurement/internal/dc:c	(J)V
    //   600: aload_2
    //   601: astore 6
    //   603: aload 5
    //   605: aload_2
    //   606: bipush 18
    //   608: invokeinterface 287 2 0
    //   613: invokevirtual 1220	com/google/android/gms/measurement/internal/dc:e	(Ljava/lang/String;)V
    //   616: aload_2
    //   617: astore 6
    //   619: aload 5
    //   621: aload_2
    //   622: bipush 19
    //   624: invokeinterface 241 2 0
    //   629: invokevirtual 1222	com/google/android/gms/measurement/internal/dc:o	(J)V
    //   632: aload_2
    //   633: astore 6
    //   635: aload 5
    //   637: aload_2
    //   638: bipush 20
    //   640: invokeinterface 241 2 0
    //   645: invokevirtual 1224	com/google/android/gms/measurement/internal/dc:n	(J)V
    //   648: aload_2
    //   649: astore 6
    //   651: aload 5
    //   653: aload_2
    //   654: bipush 21
    //   656: invokeinterface 287 2 0
    //   661: invokevirtual 1226	com/google/android/gms/measurement/internal/dc:h	(Ljava/lang/String;)V
    //   664: aload_2
    //   665: astore 6
    //   667: aload_2
    //   668: bipush 22
    //   670: invokeinterface 721 2 0
    //   675: istore 4
    //   677: lconst_0
    //   678: lstore 9
    //   680: iload 4
    //   682: ifeq +9 -> 691
    //   685: lconst_0
    //   686: lstore 7
    //   688: goto +16 -> 704
    //   691: aload_2
    //   692: astore 6
    //   694: aload_2
    //   695: bipush 22
    //   697: invokeinterface 241 2 0
    //   702: lstore 7
    //   704: aload_2
    //   705: astore 6
    //   707: aload 5
    //   709: lload 7
    //   711: invokevirtual 1228	com/google/android/gms/measurement/internal/dc:p	(J)V
    //   714: aload_2
    //   715: astore 6
    //   717: aload_2
    //   718: bipush 23
    //   720: invokeinterface 721 2 0
    //   725: ifne +26 -> 751
    //   728: aload_2
    //   729: astore 6
    //   731: aload_2
    //   732: bipush 23
    //   734: invokeinterface 724 2 0
    //   739: ifeq +6 -> 745
    //   742: goto +9 -> 751
    //   745: iconst_0
    //   746: istore 4
    //   748: goto +6 -> 754
    //   751: iconst_1
    //   752: istore 4
    //   754: aload_2
    //   755: astore 6
    //   757: aload 5
    //   759: iload 4
    //   761: invokevirtual 1230	com/google/android/gms/measurement/internal/dc:b	(Z)V
    //   764: iload_3
    //   765: istore 4
    //   767: aload_2
    //   768: astore 6
    //   770: aload_2
    //   771: bipush 24
    //   773: invokeinterface 721 2 0
    //   778: ifne +26 -> 804
    //   781: aload_2
    //   782: astore 6
    //   784: aload_2
    //   785: bipush 24
    //   787: invokeinterface 724 2 0
    //   792: ifeq +9 -> 801
    //   795: iload_3
    //   796: istore 4
    //   798: goto +6 -> 804
    //   801: iconst_0
    //   802: istore 4
    //   804: aload_2
    //   805: astore 6
    //   807: aload 5
    //   809: iload 4
    //   811: invokevirtual 1232	com/google/android/gms/measurement/internal/dc:c	(Z)V
    //   814: aload_2
    //   815: astore 6
    //   817: aload 5
    //   819: aload_2
    //   820: bipush 25
    //   822: invokeinterface 287 2 0
    //   827: invokevirtual 1234	com/google/android/gms/measurement/internal/dc:c	(Ljava/lang/String;)V
    //   830: aload_2
    //   831: astore 6
    //   833: aload_2
    //   834: bipush 26
    //   836: invokeinterface 721 2 0
    //   841: ifeq +10 -> 851
    //   844: lload 9
    //   846: lstore 7
    //   848: goto +16 -> 864
    //   851: aload_2
    //   852: astore 6
    //   854: aload_2
    //   855: bipush 26
    //   857: invokeinterface 241 2 0
    //   862: lstore 7
    //   864: aload_2
    //   865: astore 6
    //   867: aload 5
    //   869: lload 7
    //   871: invokevirtual 1236	com/google/android/gms/measurement/internal/dc:f	(J)V
    //   874: aload_2
    //   875: astore 6
    //   877: aload 5
    //   879: invokevirtual 1238	com/google/android/gms/measurement/internal/dc:e	()V
    //   882: aload_2
    //   883: astore 6
    //   885: aload_2
    //   886: invokeinterface 694 1 0
    //   891: ifeq +23 -> 914
    //   894: aload_2
    //   895: astore 6
    //   897: aload_0
    //   898: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   901: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   904: ldc_w 1240
    //   907: aload_1
    //   908: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   911: invokevirtual 278	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   914: aload_2
    //   915: ifnull +9 -> 924
    //   918: aload_2
    //   919: invokeinterface 244 1 0
    //   924: aload 5
    //   926: areturn
    //   927: astore 5
    //   929: goto +22 -> 951
    //   932: astore_1
    //   933: goto +56 -> 989
    //   936: astore 5
    //   938: goto +13 -> 951
    //   941: astore_1
    //   942: aconst_null
    //   943: astore_2
    //   944: goto +45 -> 989
    //   947: astore 5
    //   949: aconst_null
    //   950: astore_2
    //   951: aload_2
    //   952: astore 6
    //   954: aload_0
    //   955: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   958: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   961: ldc_w 1242
    //   964: aload_1
    //   965: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   968: aload 5
    //   970: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   973: aload_2
    //   974: ifnull +9 -> 983
    //   977: aload_2
    //   978: invokeinterface 244 1 0
    //   983: aconst_null
    //   984: areturn
    //   985: astore_1
    //   986: aload 6
    //   988: astore_2
    //   989: aload_2
    //   990: ifnull +9 -> 999
    //   993: aload_2
    //   994: invokeinterface 244 1 0
    //   999: aload_1
    //   1000: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1001	0	this	zc
    //   0	1001	1	paramString	String
    //   17	977	2	localObject1	Object
    //   19	777	3	bool1	boolean
    //   214	596	4	bool2	boolean
    //   236	689	5	localdc	dc
    //   927	1	5	localSQLiteException1	SQLiteException
    //   936	1	5	localSQLiteException2	SQLiteException
    //   947	22	5	localSQLiteException3	SQLiteException
    //   239	748	6	localObject2	Object
    //   571	299	7	l1	long
    //   678	167	9	l2	long
    // Exception table:
    //   from	to	target	type
    //   241	254	927	android/database/sqlite/SQLiteException
    //   257	269	927	android/database/sqlite/SQLiteException
    //   272	284	927	android/database/sqlite/SQLiteException
    //   287	299	927	android/database/sqlite/SQLiteException
    //   302	314	927	android/database/sqlite/SQLiteException
    //   317	329	927	android/database/sqlite/SQLiteException
    //   332	344	927	android/database/sqlite/SQLiteException
    //   347	360	927	android/database/sqlite/SQLiteException
    //   363	376	927	android/database/sqlite/SQLiteException
    //   379	392	927	android/database/sqlite/SQLiteException
    //   395	408	927	android/database/sqlite/SQLiteException
    //   411	422	927	android/database/sqlite/SQLiteException
    //   425	436	927	android/database/sqlite/SQLiteException
    //   451	458	927	android/database/sqlite/SQLiteException
    //   461	474	927	android/database/sqlite/SQLiteException
    //   477	490	927	android/database/sqlite/SQLiteException
    //   493	506	927	android/database/sqlite/SQLiteException
    //   509	522	927	android/database/sqlite/SQLiteException
    //   525	538	927	android/database/sqlite/SQLiteException
    //   541	554	927	android/database/sqlite/SQLiteException
    //   557	568	927	android/database/sqlite/SQLiteException
    //   579	590	927	android/database/sqlite/SQLiteException
    //   593	600	927	android/database/sqlite/SQLiteException
    //   603	616	927	android/database/sqlite/SQLiteException
    //   619	632	927	android/database/sqlite/SQLiteException
    //   635	648	927	android/database/sqlite/SQLiteException
    //   651	664	927	android/database/sqlite/SQLiteException
    //   667	677	927	android/database/sqlite/SQLiteException
    //   694	704	927	android/database/sqlite/SQLiteException
    //   707	714	927	android/database/sqlite/SQLiteException
    //   717	728	927	android/database/sqlite/SQLiteException
    //   731	742	927	android/database/sqlite/SQLiteException
    //   757	764	927	android/database/sqlite/SQLiteException
    //   770	781	927	android/database/sqlite/SQLiteException
    //   784	795	927	android/database/sqlite/SQLiteException
    //   807	814	927	android/database/sqlite/SQLiteException
    //   817	830	927	android/database/sqlite/SQLiteException
    //   833	844	927	android/database/sqlite/SQLiteException
    //   854	864	927	android/database/sqlite/SQLiteException
    //   867	874	927	android/database/sqlite/SQLiteException
    //   877	882	927	android/database/sqlite/SQLiteException
    //   885	894	927	android/database/sqlite/SQLiteException
    //   897	914	927	android/database/sqlite/SQLiteException
    //   208	216	932	finally
    //   233	238	932	finally
    //   208	216	936	android/database/sqlite/SQLiteException
    //   233	238	936	android/database/sqlite/SQLiteException
    //   13	18	941	finally
    //   20	208	941	finally
    //   13	18	947	android/database/sqlite/SQLiteException
    //   20	208	947	android/database/sqlite/SQLiteException
    //   241	254	985	finally
    //   257	269	985	finally
    //   272	284	985	finally
    //   287	299	985	finally
    //   302	314	985	finally
    //   317	329	985	finally
    //   332	344	985	finally
    //   347	360	985	finally
    //   363	376	985	finally
    //   379	392	985	finally
    //   395	408	985	finally
    //   411	422	985	finally
    //   425	436	985	finally
    //   451	458	985	finally
    //   461	474	985	finally
    //   477	490	985	finally
    //   493	506	985	finally
    //   509	522	985	finally
    //   525	538	985	finally
    //   541	554	985	finally
    //   557	568	985	finally
    //   579	590	985	finally
    //   593	600	985	finally
    //   603	616	985	finally
    //   619	632	985	finally
    //   635	648	985	finally
    //   651	664	985	finally
    //   667	677	985	finally
    //   694	704	985	finally
    //   707	714	985	finally
    //   717	728	985	finally
    //   731	742	985	finally
    //   757	764	985	finally
    //   770	781	985	finally
    //   784	795	985	finally
    //   807	814	985	finally
    //   817	830	985	finally
    //   833	844	985	finally
    //   854	864	985	finally
    //   867	874	985	finally
    //   877	882	985	finally
    //   885	894	985	finally
    //   897	914	985	finally
    //   954	973	985	finally
  }
  
  /* Error */
  public final g b(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_2
    //   6: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   9: pop
    //   10: aload_0
    //   11: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   14: aload_0
    //   15: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   18: aload_0
    //   19: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   22: astore_3
    //   23: iconst_0
    //   24: istore 4
    //   26: aload_3
    //   27: ldc_w 929
    //   30: bipush 8
    //   32: anewarray 19	java/lang/String
    //   35: dup
    //   36: iconst_0
    //   37: ldc_w 905
    //   40: aastore
    //   41: dup
    //   42: iconst_1
    //   43: ldc_w 908
    //   46: aastore
    //   47: dup
    //   48: iconst_2
    //   49: ldc_w 911
    //   52: aastore
    //   53: dup
    //   54: iconst_3
    //   55: ldc 21
    //   57: aastore
    //   58: dup
    //   59: iconst_4
    //   60: ldc 25
    //   62: aastore
    //   63: dup
    //   64: iconst_5
    //   65: ldc 29
    //   67: aastore
    //   68: dup
    //   69: bipush 6
    //   71: ldc 33
    //   73: aastore
    //   74: dup
    //   75: bipush 7
    //   77: ldc 37
    //   79: aastore
    //   80: ldc_w 1245
    //   83: iconst_2
    //   84: anewarray 19	java/lang/String
    //   87: dup
    //   88: iconst_0
    //   89: aload_1
    //   90: aastore
    //   91: dup
    //   92: iconst_1
    //   93: aload_2
    //   94: aastore
    //   95: aconst_null
    //   96: aconst_null
    //   97: aconst_null
    //   98: invokevirtual 640	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   101: astore_3
    //   102: aload_3
    //   103: invokeinterface 237 1 0
    //   108: istore 5
    //   110: iload 5
    //   112: ifne +15 -> 127
    //   115: aload_3
    //   116: ifnull +9 -> 125
    //   119: aload_3
    //   120: invokeinterface 244 1 0
    //   125: aconst_null
    //   126: areturn
    //   127: aload_3
    //   128: iconst_0
    //   129: invokeinterface 241 2 0
    //   134: lstore 6
    //   136: aload_3
    //   137: iconst_1
    //   138: invokeinterface 241 2 0
    //   143: lstore 8
    //   145: aload_3
    //   146: iconst_2
    //   147: invokeinterface 241 2 0
    //   152: lstore 10
    //   154: aload_3
    //   155: iconst_3
    //   156: invokeinterface 721 2 0
    //   161: ifeq +9 -> 170
    //   164: lconst_0
    //   165: lstore 12
    //   167: goto +12 -> 179
    //   170: aload_3
    //   171: iconst_3
    //   172: invokeinterface 241 2 0
    //   177: lstore 12
    //   179: aload_3
    //   180: iconst_4
    //   181: invokeinterface 721 2 0
    //   186: ifeq +9 -> 195
    //   189: aconst_null
    //   190: astore 14
    //   192: goto +15 -> 207
    //   195: aload_3
    //   196: iconst_4
    //   197: invokeinterface 241 2 0
    //   202: invokestatic 301	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   205: astore 14
    //   207: aload_3
    //   208: iconst_5
    //   209: invokeinterface 721 2 0
    //   214: ifeq +9 -> 223
    //   217: aconst_null
    //   218: astore 15
    //   220: goto +15 -> 235
    //   223: aload_3
    //   224: iconst_5
    //   225: invokeinterface 241 2 0
    //   230: invokestatic 301	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   233: astore 15
    //   235: aload_3
    //   236: bipush 6
    //   238: invokeinterface 721 2 0
    //   243: ifeq +9 -> 252
    //   246: aconst_null
    //   247: astore 16
    //   249: goto +16 -> 265
    //   252: aload_3
    //   253: bipush 6
    //   255: invokeinterface 241 2 0
    //   260: invokestatic 301	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   263: astore 16
    //   265: aload_3
    //   266: bipush 7
    //   268: invokeinterface 721 2 0
    //   273: ifne +29 -> 302
    //   276: aload_3
    //   277: bipush 7
    //   279: invokeinterface 241 2 0
    //   284: lconst_1
    //   285: lcmp
    //   286: ifne +6 -> 292
    //   289: iconst_1
    //   290: istore 4
    //   292: iload 4
    //   294: invokestatic 851	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   297: astore 17
    //   299: goto +6 -> 305
    //   302: aconst_null
    //   303: astore 17
    //   305: new 899	com/google/android/gms/measurement/internal/g
    //   308: astore 18
    //   310: aload_3
    //   311: astore 19
    //   313: aload 18
    //   315: aload_1
    //   316: aload_2
    //   317: lload 6
    //   319: lload 8
    //   321: lload 10
    //   323: lload 12
    //   325: aload 14
    //   327: aload 15
    //   329: aload 16
    //   331: aload 17
    //   333: invokespecial 1248	com/google/android/gms/measurement/internal/g:<init>	(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
    //   336: aload_3
    //   337: astore 19
    //   339: aload_3
    //   340: invokeinterface 694 1 0
    //   345: ifeq +23 -> 368
    //   348: aload_3
    //   349: astore 19
    //   351: aload_0
    //   352: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   355: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   358: ldc_w 1250
    //   361: aload_1
    //   362: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   365: invokevirtual 278	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   368: aload_3
    //   369: ifnull +9 -> 378
    //   372: aload_3
    //   373: invokeinterface 244 1 0
    //   378: aload 18
    //   380: areturn
    //   381: astore 14
    //   383: goto +26 -> 409
    //   386: astore_1
    //   387: aload_3
    //   388: astore 19
    //   390: goto +62 -> 452
    //   393: astore 14
    //   395: goto +14 -> 409
    //   398: astore_1
    //   399: aconst_null
    //   400: astore 19
    //   402: goto +50 -> 452
    //   405: astore 14
    //   407: aconst_null
    //   408: astore_3
    //   409: aload_3
    //   410: astore 19
    //   412: aload_0
    //   413: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   416: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   419: ldc_w 1252
    //   422: aload_1
    //   423: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   426: aload_0
    //   427: invokevirtual 1061	com/google/android/gms/measurement/internal/wa:d	()Lcom/google/android/gms/measurement/internal/t;
    //   430: aload_2
    //   431: invokevirtual 1066	com/google/android/gms/measurement/internal/t:a	(Ljava/lang/String;)Ljava/lang/String;
    //   434: aload 14
    //   436: invokevirtual 364	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   439: aload_3
    //   440: ifnull +9 -> 449
    //   443: aload_3
    //   444: invokeinterface 244 1 0
    //   449: aconst_null
    //   450: areturn
    //   451: astore_1
    //   452: aload 19
    //   454: ifnull +10 -> 464
    //   457: aload 19
    //   459: invokeinterface 244 1 0
    //   464: aload_1
    //   465: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	466	0	this	zc
    //   0	466	1	paramString1	String
    //   0	466	2	paramString2	String
    //   22	422	3	localObject1	Object
    //   24	269	4	bool1	boolean
    //   108	3	5	bool2	boolean
    //   134	184	6	l1	long
    //   143	177	8	l2	long
    //   152	170	10	l3	long
    //   165	159	12	l4	long
    //   190	136	14	localLong1	Long
    //   381	1	14	localSQLiteException1	SQLiteException
    //   393	1	14	localSQLiteException2	SQLiteException
    //   405	30	14	localSQLiteException3	SQLiteException
    //   218	110	15	localLong2	Long
    //   247	83	16	localLong3	Long
    //   297	35	17	localBoolean	Boolean
    //   308	71	18	localg	g
    //   311	147	19	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   313	336	381	android/database/sqlite/SQLiteException
    //   339	348	381	android/database/sqlite/SQLiteException
    //   351	368	381	android/database/sqlite/SQLiteException
    //   102	110	386	finally
    //   127	164	386	finally
    //   170	179	386	finally
    //   179	189	386	finally
    //   195	207	386	finally
    //   207	217	386	finally
    //   223	235	386	finally
    //   235	246	386	finally
    //   252	265	386	finally
    //   265	276	386	finally
    //   276	289	386	finally
    //   292	299	386	finally
    //   305	310	386	finally
    //   102	110	393	android/database/sqlite/SQLiteException
    //   127	164	393	android/database/sqlite/SQLiteException
    //   170	179	393	android/database/sqlite/SQLiteException
    //   179	189	393	android/database/sqlite/SQLiteException
    //   195	207	393	android/database/sqlite/SQLiteException
    //   207	217	393	android/database/sqlite/SQLiteException
    //   223	235	393	android/database/sqlite/SQLiteException
    //   235	246	393	android/database/sqlite/SQLiteException
    //   252	265	393	android/database/sqlite/SQLiteException
    //   265	276	393	android/database/sqlite/SQLiteException
    //   276	289	393	android/database/sqlite/SQLiteException
    //   292	299	393	android/database/sqlite/SQLiteException
    //   305	310	393	android/database/sqlite/SQLiteException
    //   18	23	398	finally
    //   26	102	398	finally
    //   18	23	405	android/database/sqlite/SQLiteException
    //   26	102	405	android/database/sqlite/SQLiteException
    //   313	336	451	finally
    //   339	348	451	finally
    //   351	368	451	finally
    //   412	439	451	finally
  }
  
  public final List<uc> b(String paramString1, String paramString2, String paramString3)
  {
    com.google.android.gms.common.internal.t.b(paramString1);
    j();
    r();
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(paramString1);
    paramString1 = new StringBuilder("app_id=?");
    if (!TextUtils.isEmpty(paramString2))
    {
      localArrayList.add(paramString2);
      paramString1.append(" and origin=?");
    }
    if (!TextUtils.isEmpty(paramString3))
    {
      localArrayList.add(String.valueOf(paramString3).concat("*"));
      paramString1.append(" and name glob ?");
    }
    paramString2 = (String[])localArrayList.toArray(new String[localArrayList.size()]);
    return a(paramString1.toString(), paramString2);
  }
  
  public final long c(String paramString)
  {
    com.google.android.gms.common.internal.t.b(paramString);
    j();
    r();
    try
    {
      int m = w().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[] { paramString, String.valueOf(Math.max(0, Math.min(1000000, g().b(paramString, m.D)))) });
      return m;
    }
    catch (SQLiteException localSQLiteException)
    {
      c().s().a("Error deleting over the limit events. appId", v.a(paramString), localSQLiteException);
    }
    return 0L;
  }
  
  public final void c(String paramString1, String paramString2)
  {
    com.google.android.gms.common.internal.t.b(paramString1);
    com.google.android.gms.common.internal.t.b(paramString2);
    j();
    r();
    try
    {
      int m = w().delete("user_attributes", "app_id=? and name=?", new String[] { paramString1, paramString2 });
      c().A().a("Deleted user attribute rows", Integer.valueOf(m));
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      c().s().a("Error deleting user attribute. appId", v.a(paramString1), d().c(paramString2), localSQLiteException);
    }
  }
  
  /* Error */
  public final gc d(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_2
    //   6: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   9: pop
    //   10: aload_0
    //   11: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   14: aload_0
    //   15: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   18: aload_0
    //   19: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   22: ldc_w 667
    //   25: iconst_3
    //   26: anewarray 19	java/lang/String
    //   29: dup
    //   30: iconst_0
    //   31: ldc_w 671
    //   34: aastore
    //   35: dup
    //   36: iconst_1
    //   37: ldc_w 673
    //   40: aastore
    //   41: dup
    //   42: iconst_2
    //   43: ldc 43
    //   45: aastore
    //   46: ldc_w 1245
    //   49: iconst_2
    //   50: anewarray 19	java/lang/String
    //   53: dup
    //   54: iconst_0
    //   55: aload_1
    //   56: aastore
    //   57: dup
    //   58: iconst_1
    //   59: aload_2
    //   60: aastore
    //   61: aconst_null
    //   62: aconst_null
    //   63: aconst_null
    //   64: invokevirtual 640	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   67: astore_3
    //   68: aload_3
    //   69: invokeinterface 237 1 0
    //   74: istore 4
    //   76: iload 4
    //   78: ifne +15 -> 93
    //   81: aload_3
    //   82: ifnull +9 -> 91
    //   85: aload_3
    //   86: invokeinterface 244 1 0
    //   91: aconst_null
    //   92: areturn
    //   93: aload_3
    //   94: iconst_0
    //   95: invokeinterface 241 2 0
    //   100: lstore 5
    //   102: aload_3
    //   103: astore 7
    //   105: aload_0
    //   106: aload_3
    //   107: iconst_1
    //   108: invokespecial 684	com/google/android/gms/measurement/internal/zc:a	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   111: astore 8
    //   113: aload_3
    //   114: astore 7
    //   116: aload_3
    //   117: iconst_2
    //   118: invokeinterface 287 2 0
    //   123: astore 9
    //   125: aload_3
    //   126: astore 7
    //   128: new 688	com/google/android/gms/measurement/internal/gc
    //   131: astore 10
    //   133: aload_3
    //   134: astore 7
    //   136: aload 10
    //   138: aload_1
    //   139: aload 9
    //   141: aload_2
    //   142: lload 5
    //   144: aload 8
    //   146: invokespecial 691	com/google/android/gms/measurement/internal/gc:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   149: aload_3
    //   150: astore 7
    //   152: aload_3
    //   153: invokeinterface 694 1 0
    //   158: ifeq +23 -> 181
    //   161: aload_3
    //   162: astore 7
    //   164: aload_0
    //   165: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   168: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   171: ldc_w 1271
    //   174: aload_1
    //   175: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   178: invokevirtual 278	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   181: aload_3
    //   182: ifnull +9 -> 191
    //   185: aload_3
    //   186: invokeinterface 244 1 0
    //   191: aload 10
    //   193: areturn
    //   194: astore 9
    //   196: goto +22 -> 218
    //   199: astore_1
    //   200: goto +64 -> 264
    //   203: astore 9
    //   205: goto +13 -> 218
    //   208: astore_1
    //   209: aconst_null
    //   210: astore_3
    //   211: goto +53 -> 264
    //   214: astore 9
    //   216: aconst_null
    //   217: astore_3
    //   218: aload_3
    //   219: astore 7
    //   221: aload_0
    //   222: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   225: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   228: ldc_w 1273
    //   231: aload_1
    //   232: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   235: aload_0
    //   236: invokevirtual 1061	com/google/android/gms/measurement/internal/wa:d	()Lcom/google/android/gms/measurement/internal/t;
    //   239: aload_2
    //   240: invokevirtual 1269	com/google/android/gms/measurement/internal/t:c	(Ljava/lang/String;)Ljava/lang/String;
    //   243: aload 9
    //   245: invokevirtual 364	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   248: aload_3
    //   249: ifnull +9 -> 258
    //   252: aload_3
    //   253: invokeinterface 244 1 0
    //   258: aconst_null
    //   259: areturn
    //   260: astore_1
    //   261: aload 7
    //   263: astore_3
    //   264: aload_3
    //   265: ifnull +9 -> 274
    //   268: aload_3
    //   269: invokeinterface 244 1 0
    //   274: aload_1
    //   275: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	276	0	this	zc
    //   0	276	1	paramString1	String
    //   0	276	2	paramString2	String
    //   67	202	3	localObject1	Object
    //   74	3	4	bool	boolean
    //   100	43	5	l	long
    //   103	159	7	localObject2	Object
    //   111	34	8	localObject3	Object
    //   123	17	9	str	String
    //   194	1	9	localSQLiteException1	SQLiteException
    //   203	1	9	localSQLiteException2	SQLiteException
    //   214	30	9	localSQLiteException3	SQLiteException
    //   131	61	10	localgc	gc
    // Exception table:
    //   from	to	target	type
    //   105	113	194	android/database/sqlite/SQLiteException
    //   116	125	194	android/database/sqlite/SQLiteException
    //   128	133	194	android/database/sqlite/SQLiteException
    //   136	149	194	android/database/sqlite/SQLiteException
    //   152	161	194	android/database/sqlite/SQLiteException
    //   164	181	194	android/database/sqlite/SQLiteException
    //   68	76	199	finally
    //   93	102	199	finally
    //   68	76	203	android/database/sqlite/SQLiteException
    //   93	102	203	android/database/sqlite/SQLiteException
    //   18	68	208	finally
    //   18	68	214	android/database/sqlite/SQLiteException
    //   105	113	260	finally
    //   116	125	260	finally
    //   128	133	260	finally
    //   136	149	260	finally
    //   152	161	260	finally
    //   164	181	260	finally
    //   221	248	260	finally
  }
  
  /* Error */
  public final byte[] d(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   9: aload_0
    //   10: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   13: aload_0
    //   14: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   17: ldc_w 634
    //   20: iconst_1
    //   21: anewarray 19	java/lang/String
    //   24: dup
    //   25: iconst_0
    //   26: ldc 89
    //   28: aastore
    //   29: ldc_w 636
    //   32: iconst_1
    //   33: anewarray 19	java/lang/String
    //   36: dup
    //   37: iconst_0
    //   38: aload_1
    //   39: aastore
    //   40: aconst_null
    //   41: aconst_null
    //   42: aconst_null
    //   43: invokevirtual 640	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   46: astore_2
    //   47: aload_2
    //   48: astore_3
    //   49: aload_2
    //   50: invokeinterface 237 1 0
    //   55: istore 4
    //   57: iload 4
    //   59: ifne +15 -> 74
    //   62: aload_2
    //   63: ifnull +9 -> 72
    //   66: aload_2
    //   67: invokeinterface 244 1 0
    //   72: aconst_null
    //   73: areturn
    //   74: aload_2
    //   75: astore_3
    //   76: aload_2
    //   77: iconst_0
    //   78: invokeinterface 612 2 0
    //   83: astore 5
    //   85: aload_2
    //   86: astore_3
    //   87: aload_2
    //   88: invokeinterface 694 1 0
    //   93: ifeq +22 -> 115
    //   96: aload_2
    //   97: astore_3
    //   98: aload_0
    //   99: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   102: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   105: ldc_w 1276
    //   108: aload_1
    //   109: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   112: invokevirtual 278	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   115: aload_2
    //   116: ifnull +9 -> 125
    //   119: aload_2
    //   120: invokeinterface 244 1 0
    //   125: aload 5
    //   127: areturn
    //   128: astore 5
    //   130: goto +13 -> 143
    //   133: astore_1
    //   134: aconst_null
    //   135: astore_3
    //   136: goto +41 -> 177
    //   139: astore 5
    //   141: aconst_null
    //   142: astore_2
    //   143: aload_2
    //   144: astore_3
    //   145: aload_0
    //   146: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   149: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   152: ldc_w 1278
    //   155: aload_1
    //   156: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   159: aload 5
    //   161: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   164: aload_2
    //   165: ifnull +9 -> 174
    //   168: aload_2
    //   169: invokeinterface 244 1 0
    //   174: aconst_null
    //   175: areturn
    //   176: astore_1
    //   177: aload_3
    //   178: ifnull +9 -> 187
    //   181: aload_3
    //   182: invokeinterface 244 1 0
    //   187: aload_1
    //   188: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	189	0	this	zc
    //   0	189	1	paramString	String
    //   46	123	2	localCursor1	Cursor
    //   48	134	3	localCursor2	Cursor
    //   55	3	4	bool	boolean
    //   83	43	5	arrayOfByte	byte[]
    //   128	1	5	localSQLiteException1	SQLiteException
    //   139	21	5	localSQLiteException2	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   49	57	128	android/database/sqlite/SQLiteException
    //   76	85	128	android/database/sqlite/SQLiteException
    //   87	96	128	android/database/sqlite/SQLiteException
    //   98	115	128	android/database/sqlite/SQLiteException
    //   13	47	133	finally
    //   13	47	139	android/database/sqlite/SQLiteException
    //   49	57	176	finally
    //   76	85	176	finally
    //   87	96	176	finally
    //   98	115	176	finally
    //   145	164	176	finally
  }
  
  /* Error */
  public final uc e(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_2
    //   6: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   9: pop
    //   10: aload_0
    //   11: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   14: aload_0
    //   15: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   18: aload_0
    //   19: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   22: ldc_w 763
    //   25: bipush 11
    //   27: anewarray 19	java/lang/String
    //   30: dup
    //   31: iconst_0
    //   32: ldc 43
    //   34: aastore
    //   35: dup
    //   36: iconst_1
    //   37: ldc_w 673
    //   40: aastore
    //   41: dup
    //   42: iconst_2
    //   43: ldc_w 765
    //   46: aastore
    //   47: dup
    //   48: iconst_3
    //   49: ldc_w 767
    //   52: aastore
    //   53: dup
    //   54: iconst_4
    //   55: ldc_w 769
    //   58: aastore
    //   59: dup
    //   60: iconst_5
    //   61: ldc_w 771
    //   64: aastore
    //   65: dup
    //   66: bipush 6
    //   68: ldc_w 773
    //   71: aastore
    //   72: dup
    //   73: bipush 7
    //   75: ldc_w 775
    //   78: aastore
    //   79: dup
    //   80: bipush 8
    //   82: ldc_w 777
    //   85: aastore
    //   86: dup
    //   87: bipush 9
    //   89: ldc_w 779
    //   92: aastore
    //   93: dup
    //   94: bipush 10
    //   96: ldc_w 781
    //   99: aastore
    //   100: ldc_w 1245
    //   103: iconst_2
    //   104: anewarray 19	java/lang/String
    //   107: dup
    //   108: iconst_0
    //   109: aload_1
    //   110: aastore
    //   111: dup
    //   112: iconst_1
    //   113: aload_2
    //   114: aastore
    //   115: aconst_null
    //   116: aconst_null
    //   117: aconst_null
    //   118: invokevirtual 640	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   121: astore_3
    //   122: aload_3
    //   123: invokeinterface 237 1 0
    //   128: istore 4
    //   130: iload 4
    //   132: ifne +15 -> 147
    //   135: aload_3
    //   136: ifnull +9 -> 145
    //   139: aload_3
    //   140: invokeinterface 244 1 0
    //   145: aconst_null
    //   146: areturn
    //   147: aload_3
    //   148: iconst_0
    //   149: invokeinterface 287 2 0
    //   154: astore 5
    //   156: aload_3
    //   157: astore 6
    //   159: aload_0
    //   160: aload_3
    //   161: iconst_1
    //   162: invokespecial 684	com/google/android/gms/measurement/internal/zc:a	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   165: astore 7
    //   167: aload_3
    //   168: astore 6
    //   170: aload_3
    //   171: iconst_2
    //   172: invokeinterface 724 2 0
    //   177: ifeq +9 -> 186
    //   180: iconst_1
    //   181: istore 4
    //   183: goto +6 -> 189
    //   186: iconst_0
    //   187: istore 4
    //   189: aload_3
    //   190: astore 6
    //   192: aload_3
    //   193: iconst_3
    //   194: invokeinterface 287 2 0
    //   199: astore 8
    //   201: aload_3
    //   202: astore 6
    //   204: aload_3
    //   205: iconst_4
    //   206: invokeinterface 241 2 0
    //   211: lstore 9
    //   213: aload_3
    //   214: astore 6
    //   216: aload_0
    //   217: invokevirtual 589	com/google/android/gms/measurement/internal/Vb:l	()Lcom/google/android/gms/measurement/internal/cc;
    //   220: aload_3
    //   221: iconst_5
    //   222: invokeinterface 612 2 0
    //   227: getstatic 789	com/google/android/gms/measurement/internal/k:CREATOR	Landroid/os/Parcelable$Creator;
    //   230: invokevirtual 792	com/google/android/gms/measurement/internal/cc:a	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   233: checkcast 785	com/google/android/gms/measurement/internal/k
    //   236: astore 11
    //   238: aload_3
    //   239: astore 6
    //   241: aload_3
    //   242: bipush 6
    //   244: invokeinterface 241 2 0
    //   249: lstore 12
    //   251: aload_3
    //   252: astore 6
    //   254: aload_0
    //   255: invokevirtual 589	com/google/android/gms/measurement/internal/Vb:l	()Lcom/google/android/gms/measurement/internal/cc;
    //   258: aload_3
    //   259: bipush 7
    //   261: invokeinterface 612 2 0
    //   266: getstatic 789	com/google/android/gms/measurement/internal/k:CREATOR	Landroid/os/Parcelable$Creator;
    //   269: invokevirtual 792	com/google/android/gms/measurement/internal/cc:a	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   272: checkcast 785	com/google/android/gms/measurement/internal/k
    //   275: astore 14
    //   277: aload_3
    //   278: astore 6
    //   280: aload_3
    //   281: bipush 8
    //   283: invokeinterface 241 2 0
    //   288: lstore 15
    //   290: aload_3
    //   291: astore 6
    //   293: aload_3
    //   294: bipush 9
    //   296: invokeinterface 241 2 0
    //   301: lstore 17
    //   303: aload_3
    //   304: astore 6
    //   306: aload_0
    //   307: invokevirtual 589	com/google/android/gms/measurement/internal/Vb:l	()Lcom/google/android/gms/measurement/internal/cc;
    //   310: aload_3
    //   311: bipush 10
    //   313: invokeinterface 612 2 0
    //   318: getstatic 789	com/google/android/gms/measurement/internal/k:CREATOR	Landroid/os/Parcelable$Creator;
    //   321: invokevirtual 792	com/google/android/gms/measurement/internal/cc:a	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   324: checkcast 785	com/google/android/gms/measurement/internal/k
    //   327: astore 19
    //   329: aload_3
    //   330: astore 6
    //   332: new 794	com/google/android/gms/measurement/internal/ec
    //   335: astore 20
    //   337: aload_3
    //   338: astore 6
    //   340: aload 20
    //   342: aload_2
    //   343: lload 15
    //   345: aload 7
    //   347: aload 5
    //   349: invokespecial 797	com/google/android/gms/measurement/internal/ec:<init>	(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
    //   352: aload_3
    //   353: astore 6
    //   355: new 799	com/google/android/gms/measurement/internal/uc
    //   358: astore 7
    //   360: aload_3
    //   361: astore 6
    //   363: aload 7
    //   365: aload_1
    //   366: aload 5
    //   368: aload 20
    //   370: lload 12
    //   372: iload 4
    //   374: aload 8
    //   376: aload 11
    //   378: lload 9
    //   380: aload 14
    //   382: lload 17
    //   384: aload 19
    //   386: invokespecial 802	com/google/android/gms/measurement/internal/uc:<init>	(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/ec;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/k;JLcom/google/android/gms/measurement/internal/k;JLcom/google/android/gms/measurement/internal/k;)V
    //   389: aload_3
    //   390: astore 6
    //   392: aload_3
    //   393: invokeinterface 694 1 0
    //   398: ifeq +31 -> 429
    //   401: aload_3
    //   402: astore 6
    //   404: aload_0
    //   405: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   408: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   411: ldc_w 1281
    //   414: aload_1
    //   415: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   418: aload_0
    //   419: invokevirtual 1061	com/google/android/gms/measurement/internal/wa:d	()Lcom/google/android/gms/measurement/internal/t;
    //   422: aload_2
    //   423: invokevirtual 1269	com/google/android/gms/measurement/internal/t:c	(Ljava/lang/String;)Ljava/lang/String;
    //   426: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   429: aload_3
    //   430: ifnull +9 -> 439
    //   433: aload_3
    //   434: invokeinterface 244 1 0
    //   439: aload 7
    //   441: areturn
    //   442: astore 5
    //   444: goto +22 -> 466
    //   447: astore_1
    //   448: goto +64 -> 512
    //   451: astore 5
    //   453: goto +13 -> 466
    //   456: astore_1
    //   457: aconst_null
    //   458: astore_3
    //   459: goto +53 -> 512
    //   462: astore 5
    //   464: aconst_null
    //   465: astore_3
    //   466: aload_3
    //   467: astore 6
    //   469: aload_0
    //   470: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   473: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   476: ldc_w 1283
    //   479: aload_1
    //   480: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   483: aload_0
    //   484: invokevirtual 1061	com/google/android/gms/measurement/internal/wa:d	()Lcom/google/android/gms/measurement/internal/t;
    //   487: aload_2
    //   488: invokevirtual 1269	com/google/android/gms/measurement/internal/t:c	(Ljava/lang/String;)Ljava/lang/String;
    //   491: aload 5
    //   493: invokevirtual 364	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   496: aload_3
    //   497: ifnull +9 -> 506
    //   500: aload_3
    //   501: invokeinterface 244 1 0
    //   506: aconst_null
    //   507: areturn
    //   508: astore_1
    //   509: aload 6
    //   511: astore_3
    //   512: aload_3
    //   513: ifnull +9 -> 522
    //   516: aload_3
    //   517: invokeinterface 244 1 0
    //   522: aload_1
    //   523: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	524	0	this	zc
    //   0	524	1	paramString1	String
    //   0	524	2	paramString2	String
    //   121	396	3	localObject1	Object
    //   128	245	4	bool	boolean
    //   154	213	5	str1	String
    //   442	1	5	localSQLiteException1	SQLiteException
    //   451	1	5	localSQLiteException2	SQLiteException
    //   462	30	5	localSQLiteException3	SQLiteException
    //   157	353	6	localObject2	Object
    //   165	275	7	localObject3	Object
    //   199	176	8	str2	String
    //   211	168	9	l1	long
    //   236	141	11	localk1	k
    //   249	122	12	l2	long
    //   275	106	14	localk2	k
    //   288	56	15	l3	long
    //   301	82	17	l4	long
    //   327	58	19	localk3	k
    //   335	34	20	localec	ec
    // Exception table:
    //   from	to	target	type
    //   159	167	442	android/database/sqlite/SQLiteException
    //   170	180	442	android/database/sqlite/SQLiteException
    //   192	201	442	android/database/sqlite/SQLiteException
    //   204	213	442	android/database/sqlite/SQLiteException
    //   216	238	442	android/database/sqlite/SQLiteException
    //   241	251	442	android/database/sqlite/SQLiteException
    //   254	277	442	android/database/sqlite/SQLiteException
    //   280	290	442	android/database/sqlite/SQLiteException
    //   293	303	442	android/database/sqlite/SQLiteException
    //   306	329	442	android/database/sqlite/SQLiteException
    //   332	337	442	android/database/sqlite/SQLiteException
    //   340	352	442	android/database/sqlite/SQLiteException
    //   355	360	442	android/database/sqlite/SQLiteException
    //   363	389	442	android/database/sqlite/SQLiteException
    //   392	401	442	android/database/sqlite/SQLiteException
    //   404	429	442	android/database/sqlite/SQLiteException
    //   122	130	447	finally
    //   147	156	447	finally
    //   122	130	451	android/database/sqlite/SQLiteException
    //   147	156	451	android/database/sqlite/SQLiteException
    //   18	122	456	finally
    //   18	122	462	android/database/sqlite/SQLiteException
    //   159	167	508	finally
    //   170	180	508	finally
    //   192	201	508	finally
    //   204	213	508	finally
    //   216	238	508	finally
    //   241	251	508	finally
    //   254	277	508	finally
    //   280	290	508	finally
    //   293	303	508	finally
    //   306	329	508	finally
    //   332	337	508	finally
    //   340	352	508	finally
    //   355	360	508	finally
    //   363	389	508	finally
    //   392	401	508	finally
    //   404	429	508	finally
    //   469	496	508	finally
  }
  
  /* Error */
  final java.util.Map<Integer, DG> e(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   4: aload_0
    //   5: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   8: aload_1
    //   9: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_0
    //   14: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   17: astore_2
    //   18: aload_2
    //   19: ldc_w 497
    //   22: iconst_2
    //   23: anewarray 19	java/lang/String
    //   26: dup
    //   27: iconst_0
    //   28: ldc_w 375
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: ldc_w 1286
    //   37: aastore
    //   38: ldc_w 636
    //   41: iconst_1
    //   42: anewarray 19	java/lang/String
    //   45: dup
    //   46: iconst_0
    //   47: aload_1
    //   48: aastore
    //   49: aconst_null
    //   50: aconst_null
    //   51: aconst_null
    //   52: invokevirtual 640	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   55: astore_3
    //   56: aload_3
    //   57: astore_2
    //   58: aload_3
    //   59: invokeinterface 237 1 0
    //   64: istore 4
    //   66: iload 4
    //   68: ifne +15 -> 83
    //   71: aload_3
    //   72: ifnull +9 -> 81
    //   75: aload_3
    //   76: invokeinterface 244 1 0
    //   81: aconst_null
    //   82: areturn
    //   83: aload_3
    //   84: astore_2
    //   85: new 1288	gd
    //   88: astore 5
    //   90: aload_3
    //   91: astore_2
    //   92: aload 5
    //   94: invokespecial 1289	gd:<init>	()V
    //   97: aload_3
    //   98: astore_2
    //   99: aload_3
    //   100: iconst_0
    //   101: invokeinterface 724 2 0
    //   106: istore 6
    //   108: aload_3
    //   109: astore_2
    //   110: aload_3
    //   111: iconst_1
    //   112: invokeinterface 612 2 0
    //   117: astore 7
    //   119: aload_3
    //   120: astore_2
    //   121: aload 7
    //   123: invokestatic 1294	YH:c	()LYH;
    //   126: invokestatic 1299	DG:a	([BLYH;)LDG;
    //   129: astore 7
    //   131: aload_3
    //   132: astore_2
    //   133: aload 5
    //   135: iload 6
    //   137: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   140: aload 7
    //   142: invokeinterface 1304 3 0
    //   147: pop
    //   148: goto +31 -> 179
    //   151: astore 7
    //   153: aload_3
    //   154: astore_2
    //   155: aload_0
    //   156: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   159: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   162: ldc_w 1306
    //   165: aload_1
    //   166: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   169: iload 6
    //   171: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   174: aload 7
    //   176: invokevirtual 364	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   179: aload_3
    //   180: astore_2
    //   181: aload_3
    //   182: invokeinterface 694 1 0
    //   187: istore 4
    //   189: iload 4
    //   191: ifne -94 -> 97
    //   194: aload_3
    //   195: ifnull +9 -> 204
    //   198: aload_3
    //   199: invokeinterface 244 1 0
    //   204: aload 5
    //   206: areturn
    //   207: astore 5
    //   209: goto +13 -> 222
    //   212: astore_1
    //   213: aconst_null
    //   214: astore_2
    //   215: goto +41 -> 256
    //   218: astore 5
    //   220: aconst_null
    //   221: astore_3
    //   222: aload_3
    //   223: astore_2
    //   224: aload_0
    //   225: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   228: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   231: ldc_w 1308
    //   234: aload_1
    //   235: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   238: aload 5
    //   240: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   243: aload_3
    //   244: ifnull +9 -> 253
    //   247: aload_3
    //   248: invokeinterface 244 1 0
    //   253: aconst_null
    //   254: areturn
    //   255: astore_1
    //   256: aload_2
    //   257: ifnull +9 -> 266
    //   260: aload_2
    //   261: invokeinterface 244 1 0
    //   266: aload_1
    //   267: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	268	0	this	zc
    //   0	268	1	paramString	String
    //   17	244	2	localObject1	Object
    //   55	193	3	localCursor	Cursor
    //   64	126	4	bool	boolean
    //   88	117	5	localgd	gd
    //   207	1	5	localSQLiteException1	SQLiteException
    //   218	21	5	localSQLiteException2	SQLiteException
    //   106	64	6	m	int
    //   117	24	7	localObject2	Object
    //   151	24	7	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   121	131	151	java/io/IOException
    //   58	66	207	android/database/sqlite/SQLiteException
    //   85	90	207	android/database/sqlite/SQLiteException
    //   92	97	207	android/database/sqlite/SQLiteException
    //   99	108	207	android/database/sqlite/SQLiteException
    //   110	119	207	android/database/sqlite/SQLiteException
    //   121	131	207	android/database/sqlite/SQLiteException
    //   133	148	207	android/database/sqlite/SQLiteException
    //   155	179	207	android/database/sqlite/SQLiteException
    //   181	189	207	android/database/sqlite/SQLiteException
    //   18	56	212	finally
    //   18	56	218	android/database/sqlite/SQLiteException
    //   58	66	255	finally
    //   85	90	255	finally
    //   92	97	255	finally
    //   99	108	255	finally
    //   110	119	255	finally
    //   121	131	255	finally
    //   133	148	255	finally
    //   155	179	255	finally
    //   181	189	255	finally
    //   224	243	255	finally
  }
  
  public final int f(String paramString1, String paramString2)
  {
    com.google.android.gms.common.internal.t.b(paramString1);
    com.google.android.gms.common.internal.t.b(paramString2);
    j();
    r();
    try
    {
      int m = w().delete("conditional_properties", "app_id=? and name=?", new String[] { paramString1, paramString2 });
      return m;
    }
    catch (SQLiteException localSQLiteException)
    {
      c().s().a("Error deleting conditional property", v.a(paramString1), d().c(paramString2), localSQLiteException);
    }
    return 0;
  }
  
  public final long f(String paramString)
  {
    com.google.android.gms.common.internal.t.b(paramString);
    return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[] { paramString }, 0L);
  }
  
  /* Error */
  final java.util.Map<Integer, List<KG>> g(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   4: aload_0
    //   5: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   8: aload_1
    //   9: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_2
    //   14: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   17: pop
    //   18: new 1288	gd
    //   21: dup
    //   22: invokespecial 1289	gd:<init>	()V
    //   25: astore_3
    //   26: aload_0
    //   27: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   30: astore 4
    //   32: aload 4
    //   34: ldc_w 389
    //   37: iconst_2
    //   38: anewarray 19	java/lang/String
    //   41: dup
    //   42: iconst_0
    //   43: ldc_w 375
    //   46: aastore
    //   47: dup
    //   48: iconst_1
    //   49: ldc_w 384
    //   52: aastore
    //   53: ldc_w 1317
    //   56: iconst_2
    //   57: anewarray 19	java/lang/String
    //   60: dup
    //   61: iconst_0
    //   62: aload_1
    //   63: aastore
    //   64: dup
    //   65: iconst_1
    //   66: aload_2
    //   67: aastore
    //   68: aconst_null
    //   69: aconst_null
    //   70: aconst_null
    //   71: invokevirtual 640	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   74: astore 4
    //   76: aload 4
    //   78: astore_2
    //   79: aload 4
    //   81: invokeinterface 237 1 0
    //   86: ifne +26 -> 112
    //   89: aload 4
    //   91: astore_2
    //   92: invokestatic 1321	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   95: astore 5
    //   97: aload 4
    //   99: ifnull +10 -> 109
    //   102: aload 4
    //   104: invokeinterface 244 1 0
    //   109: aload 5
    //   111: areturn
    //   112: aload 4
    //   114: astore_2
    //   115: aload 4
    //   117: iconst_1
    //   118: invokeinterface 612 2 0
    //   123: astore 6
    //   125: aload 4
    //   127: astore_2
    //   128: new 338	KG
    //   131: astore 5
    //   133: aload 4
    //   135: astore_2
    //   136: aload 5
    //   138: invokespecial 1322	KG:<init>	()V
    //   141: aload 4
    //   143: astore_2
    //   144: aload 5
    //   146: aload 6
    //   148: invokestatic 1325	gK:a	(LgK;[B)LgK;
    //   151: pop
    //   152: aload 4
    //   154: astore_2
    //   155: aload 5
    //   157: checkcast 338	KG
    //   160: astore 7
    //   162: aload 4
    //   164: astore_2
    //   165: aload 4
    //   167: iconst_0
    //   168: invokeinterface 724 2 0
    //   173: istore 8
    //   175: aload 4
    //   177: astore_2
    //   178: aload_3
    //   179: iload 8
    //   181: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   184: invokeinterface 1327 2 0
    //   189: checkcast 448	java/util/List
    //   192: astore 6
    //   194: aload 6
    //   196: astore 5
    //   198: aload 6
    //   200: ifnonnull +36 -> 236
    //   203: aload 4
    //   205: astore_2
    //   206: new 445	java/util/ArrayList
    //   209: astore 5
    //   211: aload 4
    //   213: astore_2
    //   214: aload 5
    //   216: invokespecial 446	java/util/ArrayList:<init>	()V
    //   219: aload 4
    //   221: astore_2
    //   222: aload_3
    //   223: iload 8
    //   225: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   228: aload 5
    //   230: invokeinterface 1304 3 0
    //   235: pop
    //   236: aload 4
    //   238: astore_2
    //   239: aload 5
    //   241: aload 7
    //   243: invokeinterface 466 2 0
    //   248: pop
    //   249: goto +27 -> 276
    //   252: astore 5
    //   254: aload 4
    //   256: astore_2
    //   257: aload_0
    //   258: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   261: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   264: ldc_w 1329
    //   267: aload_1
    //   268: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   271: aload 5
    //   273: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   276: aload 4
    //   278: astore_2
    //   279: aload 4
    //   281: invokeinterface 694 1 0
    //   286: istore 9
    //   288: iload 9
    //   290: ifne -178 -> 112
    //   293: aload 4
    //   295: ifnull +10 -> 305
    //   298: aload 4
    //   300: invokeinterface 244 1 0
    //   305: aload_3
    //   306: areturn
    //   307: astore 5
    //   309: goto +14 -> 323
    //   312: astore_1
    //   313: aconst_null
    //   314: astore_2
    //   315: goto +45 -> 360
    //   318: astore 5
    //   320: aconst_null
    //   321: astore 4
    //   323: aload 4
    //   325: astore_2
    //   326: aload_0
    //   327: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   330: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   333: ldc_w 503
    //   336: aload_1
    //   337: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   340: aload 5
    //   342: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   345: aload 4
    //   347: ifnull +10 -> 357
    //   350: aload 4
    //   352: invokeinterface 244 1 0
    //   357: aconst_null
    //   358: areturn
    //   359: astore_1
    //   360: aload_2
    //   361: ifnull +9 -> 370
    //   364: aload_2
    //   365: invokeinterface 244 1 0
    //   370: aload_1
    //   371: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	372	0	this	zc
    //   0	372	1	paramString1	String
    //   0	372	2	paramString2	String
    //   25	281	3	localgd	gd
    //   30	321	4	localObject1	Object
    //   95	145	5	localObject2	Object
    //   252	20	5	localIOException	IOException
    //   307	1	5	localSQLiteException1	SQLiteException
    //   318	23	5	localSQLiteException2	SQLiteException
    //   123	76	6	localObject3	Object
    //   160	82	7	localKG	KG
    //   173	51	8	m	int
    //   286	3	9	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   128	133	252	java/io/IOException
    //   136	141	252	java/io/IOException
    //   144	152	252	java/io/IOException
    //   155	162	252	java/io/IOException
    //   79	89	307	android/database/sqlite/SQLiteException
    //   92	97	307	android/database/sqlite/SQLiteException
    //   115	125	307	android/database/sqlite/SQLiteException
    //   128	133	307	android/database/sqlite/SQLiteException
    //   136	141	307	android/database/sqlite/SQLiteException
    //   144	152	307	android/database/sqlite/SQLiteException
    //   155	162	307	android/database/sqlite/SQLiteException
    //   165	175	307	android/database/sqlite/SQLiteException
    //   178	194	307	android/database/sqlite/SQLiteException
    //   206	211	307	android/database/sqlite/SQLiteException
    //   214	219	307	android/database/sqlite/SQLiteException
    //   222	236	307	android/database/sqlite/SQLiteException
    //   239	249	307	android/database/sqlite/SQLiteException
    //   257	276	307	android/database/sqlite/SQLiteException
    //   279	288	307	android/database/sqlite/SQLiteException
    //   32	76	312	finally
    //   32	76	318	android/database/sqlite/SQLiteException
    //   79	89	359	finally
    //   92	97	359	finally
    //   115	125	359	finally
    //   128	133	359	finally
    //   136	141	359	finally
    //   144	152	359	finally
    //   155	162	359	finally
    //   165	175	359	finally
    //   178	194	359	finally
    //   206	211	359	finally
    //   214	219	359	finally
    //   222	236	359	finally
    //   239	249	359	finally
    //   257	276	359	finally
    //   279	288	359	finally
    //   326	345	359	finally
  }
  
  /* Error */
  final java.util.Map<Integer, List<OG>> h(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   4: aload_0
    //   5: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   8: aload_1
    //   9: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_2
    //   14: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   17: pop
    //   18: new 1288	gd
    //   21: dup
    //   22: invokespecial 1289	gd:<init>	()V
    //   25: astore_3
    //   26: aload_0
    //   27: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   30: astore 4
    //   32: aload 4
    //   34: ldc_w 410
    //   37: iconst_2
    //   38: anewarray 19	java/lang/String
    //   41: dup
    //   42: iconst_0
    //   43: ldc_w 375
    //   46: aastore
    //   47: dup
    //   48: iconst_1
    //   49: ldc_w 384
    //   52: aastore
    //   53: ldc_w 1332
    //   56: iconst_2
    //   57: anewarray 19	java/lang/String
    //   60: dup
    //   61: iconst_0
    //   62: aload_1
    //   63: aastore
    //   64: dup
    //   65: iconst_1
    //   66: aload_2
    //   67: aastore
    //   68: aconst_null
    //   69: aconst_null
    //   70: aconst_null
    //   71: invokevirtual 640	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   74: astore 4
    //   76: aload 4
    //   78: astore_2
    //   79: aload 4
    //   81: invokeinterface 237 1 0
    //   86: ifne +26 -> 112
    //   89: aload 4
    //   91: astore_2
    //   92: invokestatic 1321	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   95: astore 5
    //   97: aload 4
    //   99: ifnull +10 -> 109
    //   102: aload 4
    //   104: invokeinterface 244 1 0
    //   109: aload 5
    //   111: areturn
    //   112: aload 4
    //   114: astore_2
    //   115: aload 4
    //   117: iconst_1
    //   118: invokeinterface 612 2 0
    //   123: astore 5
    //   125: aload 4
    //   127: astore_2
    //   128: new 402	OG
    //   131: astore 6
    //   133: aload 4
    //   135: astore_2
    //   136: aload 6
    //   138: invokespecial 1333	OG:<init>	()V
    //   141: aload 4
    //   143: astore_2
    //   144: aload 6
    //   146: aload 5
    //   148: invokestatic 1325	gK:a	(LgK;[B)LgK;
    //   151: pop
    //   152: aload 4
    //   154: astore_2
    //   155: aload 6
    //   157: checkcast 402	OG
    //   160: astore 7
    //   162: aload 4
    //   164: astore_2
    //   165: aload 4
    //   167: iconst_0
    //   168: invokeinterface 724 2 0
    //   173: istore 8
    //   175: aload 4
    //   177: astore_2
    //   178: aload_3
    //   179: iload 8
    //   181: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   184: invokeinterface 1327 2 0
    //   189: checkcast 448	java/util/List
    //   192: astore 6
    //   194: aload 6
    //   196: astore 5
    //   198: aload 6
    //   200: ifnonnull +36 -> 236
    //   203: aload 4
    //   205: astore_2
    //   206: new 445	java/util/ArrayList
    //   209: astore 5
    //   211: aload 4
    //   213: astore_2
    //   214: aload 5
    //   216: invokespecial 446	java/util/ArrayList:<init>	()V
    //   219: aload 4
    //   221: astore_2
    //   222: aload_3
    //   223: iload 8
    //   225: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   228: aload 5
    //   230: invokeinterface 1304 3 0
    //   235: pop
    //   236: aload 4
    //   238: astore_2
    //   239: aload 5
    //   241: aload 7
    //   243: invokeinterface 466 2 0
    //   248: pop
    //   249: goto +27 -> 276
    //   252: astore 5
    //   254: aload 4
    //   256: astore_2
    //   257: aload_0
    //   258: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   261: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   264: ldc_w 1335
    //   267: aload_1
    //   268: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   271: aload 5
    //   273: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   276: aload 4
    //   278: astore_2
    //   279: aload 4
    //   281: invokeinterface 694 1 0
    //   286: istore 9
    //   288: iload 9
    //   290: ifne -178 -> 112
    //   293: aload 4
    //   295: ifnull +10 -> 305
    //   298: aload 4
    //   300: invokeinterface 244 1 0
    //   305: aload_3
    //   306: areturn
    //   307: astore 5
    //   309: goto +14 -> 323
    //   312: astore_1
    //   313: aconst_null
    //   314: astore_2
    //   315: goto +45 -> 360
    //   318: astore 5
    //   320: aconst_null
    //   321: astore 4
    //   323: aload 4
    //   325: astore_2
    //   326: aload_0
    //   327: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   330: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   333: ldc_w 503
    //   336: aload_1
    //   337: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   340: aload 5
    //   342: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   345: aload 4
    //   347: ifnull +10 -> 357
    //   350: aload 4
    //   352: invokeinterface 244 1 0
    //   357: aconst_null
    //   358: areturn
    //   359: astore_1
    //   360: aload_2
    //   361: ifnull +9 -> 370
    //   364: aload_2
    //   365: invokeinterface 244 1 0
    //   370: aload_1
    //   371: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	372	0	this	zc
    //   0	372	1	paramString1	String
    //   0	372	2	paramString2	String
    //   25	281	3	localgd	gd
    //   30	321	4	localObject1	Object
    //   95	145	5	localObject2	Object
    //   252	20	5	localIOException	IOException
    //   307	1	5	localSQLiteException1	SQLiteException
    //   318	23	5	localSQLiteException2	SQLiteException
    //   131	68	6	localObject3	Object
    //   160	82	7	localOG	OG
    //   173	51	8	m	int
    //   286	3	9	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   128	133	252	java/io/IOException
    //   136	141	252	java/io/IOException
    //   144	152	252	java/io/IOException
    //   155	162	252	java/io/IOException
    //   79	89	307	android/database/sqlite/SQLiteException
    //   92	97	307	android/database/sqlite/SQLiteException
    //   115	125	307	android/database/sqlite/SQLiteException
    //   128	133	307	android/database/sqlite/SQLiteException
    //   136	141	307	android/database/sqlite/SQLiteException
    //   144	152	307	android/database/sqlite/SQLiteException
    //   155	162	307	android/database/sqlite/SQLiteException
    //   165	175	307	android/database/sqlite/SQLiteException
    //   178	194	307	android/database/sqlite/SQLiteException
    //   206	211	307	android/database/sqlite/SQLiteException
    //   214	219	307	android/database/sqlite/SQLiteException
    //   222	236	307	android/database/sqlite/SQLiteException
    //   239	249	307	android/database/sqlite/SQLiteException
    //   257	276	307	android/database/sqlite/SQLiteException
    //   279	288	307	android/database/sqlite/SQLiteException
    //   32	76	312	finally
    //   32	76	318	android/database/sqlite/SQLiteException
    //   79	89	359	finally
    //   92	97	359	finally
    //   115	125	359	finally
    //   128	133	359	finally
    //   136	141	359	finally
    //   144	152	359	finally
    //   155	162	359	finally
    //   165	175	359	finally
    //   178	194	359	finally
    //   206	211	359	finally
    //   214	219	359	finally
    //   222	236	359	finally
    //   239	249	359	finally
    //   257	276	359	finally
    //   279	288	359	finally
    //   326	345	359	finally
  }
  
  /* Error */
  protected final long i(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_2
    //   6: invokestatic 309	com/google/android/gms/common/internal/t:b	(Ljava/lang/String;)Ljava/lang/String;
    //   9: pop
    //   10: aload_0
    //   11: invokevirtual 336	com/google/android/gms/measurement/internal/wa:j	()V
    //   14: aload_0
    //   15: invokevirtual 334	com/google/android/gms/measurement/internal/Wb:r	()V
    //   18: aload_0
    //   19: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   22: astore_3
    //   23: aload_3
    //   24: invokevirtual 937	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   27: aload_2
    //   28: invokestatic 361	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   31: invokevirtual 477	java/lang/String:length	()I
    //   34: istore 4
    //   36: new 474	java/lang/StringBuilder
    //   39: astore 5
    //   41: aload 5
    //   43: iload 4
    //   45: bipush 32
    //   47: iadd
    //   48: invokespecial 480	java/lang/StringBuilder:<init>	(I)V
    //   51: aload 5
    //   53: ldc_w 1339
    //   56: invokevirtual 486	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: aload 5
    //   62: aload_2
    //   63: invokevirtual 486	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: pop
    //   67: aload 5
    //   69: ldc_w 1341
    //   72: invokevirtual 486	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload 5
    //   78: invokevirtual 491	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   81: astore 5
    //   83: aload_0
    //   84: aload 5
    //   86: iconst_1
    //   87: anewarray 19	java/lang/String
    //   90: dup
    //   91: iconst_0
    //   92: aload_1
    //   93: aastore
    //   94: ldc2_w 394
    //   97: invokespecial 562	com/google/android/gms/measurement/internal/zc:a	(Ljava/lang/String;[Ljava/lang/String;J)J
    //   100: lstore 6
    //   102: lload 6
    //   104: lstore 8
    //   106: lload 6
    //   108: ldc2_w 394
    //   111: lcmp
    //   112: ifne +92 -> 204
    //   115: new 314	android/content/ContentValues
    //   118: astore 5
    //   120: aload 5
    //   122: invokespecial 371	android/content/ContentValues:<init>	()V
    //   125: aload 5
    //   127: ldc_w 373
    //   130: aload_1
    //   131: invokevirtual 318	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   134: aload 5
    //   136: ldc_w 1343
    //   139: iconst_0
    //   140: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   143: invokevirtual 378	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   146: aload 5
    //   148: ldc -93
    //   150: iconst_0
    //   151: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   154: invokevirtual 378	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   157: aload_3
    //   158: ldc_w 1345
    //   161: aconst_null
    //   162: aload 5
    //   164: iconst_5
    //   165: invokevirtual 393	android/database/sqlite/SQLiteDatabase:insertWithOnConflict	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   168: ldc2_w 394
    //   171: lcmp
    //   172: ifne +29 -> 201
    //   175: aload_0
    //   176: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   179: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   182: ldc_w 1347
    //   185: aload_1
    //   186: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   189: aload_2
    //   190: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   193: aload_3
    //   194: invokevirtual 966	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   197: ldc2_w 394
    //   200: lreturn
    //   201: lconst_0
    //   202: lstore 8
    //   204: new 314	android/content/ContentValues
    //   207: astore 5
    //   209: aload 5
    //   211: invokespecial 371	android/content/ContentValues:<init>	()V
    //   214: aload 5
    //   216: ldc_w 373
    //   219: aload_1
    //   220: invokevirtual 318	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   223: aload 5
    //   225: aload_2
    //   226: lconst_1
    //   227: lload 8
    //   229: ladd
    //   230: invokestatic 301	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   233: invokevirtual 321	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   236: aload_3
    //   237: ldc_w 1345
    //   240: aload 5
    //   242: ldc_w 892
    //   245: iconst_1
    //   246: anewarray 19	java/lang/String
    //   249: dup
    //   250: iconst_0
    //   251: aload_1
    //   252: aastore
    //   253: invokevirtual 656	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   256: i2l
    //   257: lconst_0
    //   258: lcmp
    //   259: ifne +29 -> 288
    //   262: aload_0
    //   263: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   266: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   269: ldc_w 1349
    //   272: aload_1
    //   273: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   276: aload_2
    //   277: invokevirtual 261	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   280: aload_3
    //   281: invokevirtual 966	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   284: ldc2_w 394
    //   287: lreturn
    //   288: aload_3
    //   289: invokevirtual 963	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   292: aload_3
    //   293: invokevirtual 966	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   296: goto +46 -> 342
    //   299: astore 5
    //   301: goto +17 -> 318
    //   304: astore 5
    //   306: goto +9 -> 315
    //   309: astore_1
    //   310: goto +36 -> 346
    //   313: astore 5
    //   315: lconst_0
    //   316: lstore 8
    //   318: aload_0
    //   319: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   322: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   325: ldc_w 1351
    //   328: aload_1
    //   329: invokestatic 355	com/google/android/gms/measurement/internal/v:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   332: aload_2
    //   333: aload 5
    //   335: invokevirtual 364	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   338: aload_3
    //   339: invokevirtual 966	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   342: lload 8
    //   344: lreturn
    //   345: astore_1
    //   346: aload_3
    //   347: invokevirtual 966	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   350: aload_1
    //   351: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	352	0	this	zc
    //   0	352	1	paramString1	String
    //   0	352	2	paramString2	String
    //   22	325	3	localSQLiteDatabase	SQLiteDatabase
    //   34	14	4	m	int
    //   39	202	5	localObject	Object
    //   299	1	5	localSQLiteException1	SQLiteException
    //   304	1	5	localSQLiteException2	SQLiteException
    //   313	21	5	localSQLiteException3	SQLiteException
    //   100	7	6	l1	long
    //   104	239	8	l2	long
    // Exception table:
    //   from	to	target	type
    //   204	280	299	android/database/sqlite/SQLiteException
    //   288	292	299	android/database/sqlite/SQLiteException
    //   83	102	304	android/database/sqlite/SQLiteException
    //   115	193	304	android/database/sqlite/SQLiteException
    //   27	83	309	finally
    //   27	83	313	android/database/sqlite/SQLiteException
    //   83	102	345	finally
    //   115	193	345	finally
    //   204	280	345	finally
    //   288	292	345	finally
    //   318	338	345	finally
  }
  
  protected final boolean t()
  {
    return false;
  }
  
  public final void u()
  {
    r();
    w().beginTransaction();
  }
  
  public final void v()
  {
    r();
    w().endTransaction();
  }
  
  final SQLiteDatabase w()
  {
    j();
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.j.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      c().v().a("Error opening database", localSQLiteException);
      throw localSQLiteException;
    }
  }
  
  public final void x()
  {
    r();
    w().setTransactionSuccessful();
  }
  
  /* Error */
  public final String y()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 226	com/google/android/gms/measurement/internal/zc:w	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore_1
    //   5: aload_1
    //   6: ldc_w 1359
    //   9: aconst_null
    //   10: invokevirtual 232	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   13: astore_2
    //   14: aload_2
    //   15: astore_1
    //   16: aload_2
    //   17: invokeinterface 237 1 0
    //   22: ifeq +25 -> 47
    //   25: aload_2
    //   26: astore_1
    //   27: aload_2
    //   28: iconst_0
    //   29: invokeinterface 287 2 0
    //   34: astore_3
    //   35: aload_2
    //   36: ifnull +9 -> 45
    //   39: aload_2
    //   40: invokeinterface 244 1 0
    //   45: aload_3
    //   46: areturn
    //   47: aload_2
    //   48: ifnull +9 -> 57
    //   51: aload_2
    //   52: invokeinterface 244 1 0
    //   57: aconst_null
    //   58: areturn
    //   59: astore_3
    //   60: goto +14 -> 74
    //   63: astore_1
    //   64: aconst_null
    //   65: astore_3
    //   66: aload_1
    //   67: astore_2
    //   68: goto +37 -> 105
    //   71: astore_3
    //   72: aconst_null
    //   73: astore_2
    //   74: aload_2
    //   75: astore_1
    //   76: aload_0
    //   77: invokevirtual 248	com/google/android/gms/measurement/internal/wa:c	()Lcom/google/android/gms/measurement/internal/v;
    //   80: invokevirtual 254	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   83: ldc_w 1361
    //   86: aload_3
    //   87: invokevirtual 278	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   90: aload_2
    //   91: ifnull +9 -> 100
    //   94: aload_2
    //   95: invokeinterface 244 1 0
    //   100: aconst_null
    //   101: areturn
    //   102: astore_2
    //   103: aload_1
    //   104: astore_3
    //   105: aload_3
    //   106: ifnull +9 -> 115
    //   109: aload_3
    //   110: invokeinterface 244 1 0
    //   115: aload_2
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	zc
    //   4	23	1	localObject1	Object
    //   63	4	1	localObject2	Object
    //   75	29	1	localObject3	Object
    //   13	82	2	localObject4	Object
    //   102	14	2	localObject5	Object
    //   34	12	3	str	String
    //   59	1	3	localSQLiteException1	SQLiteException
    //   65	1	3	localObject6	Object
    //   71	16	3	localSQLiteException2	SQLiteException
    //   104	6	3	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   16	25	59	android/database/sqlite/SQLiteException
    //   27	35	59	android/database/sqlite/SQLiteException
    //   5	14	63	finally
    //   5	14	71	android/database/sqlite/SQLiteException
    //   16	25	102	finally
    //   27	35	102	finally
    //   76	90	102	finally
  }
  
  public final boolean z()
  {
    return b("select count(1) > 0 from queue where has_realtime = 1", null) != 0L;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */