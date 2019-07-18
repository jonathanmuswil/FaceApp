package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.io.File;

final class s
  extends SQLiteOpenHelper
{
  s(r paramr, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  public final SQLiteDatabase getWritableDatabase()
    throws SQLiteException
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase1 = super.getWritableDatabase();
      return localSQLiteDatabase1;
    }
    catch (SQLiteException localSQLiteException1)
    {
      this.a.c().s().a("Opening the local database failed, dropping and recreating it");
      if (!this.a.getContext().getDatabasePath("google_app_measurement_local.db").delete()) {
        this.a.c().s().a("Failed to delete corrupted local db file", "google_app_measurement_local.db");
      }
      try
      {
        SQLiteDatabase localSQLiteDatabase2 = super.getWritableDatabase();
        return localSQLiteDatabase2;
      }
      catch (SQLiteException localSQLiteException2)
      {
        this.a.c().s().a("Failed to open local database. Events will bypass local storage", localSQLiteException2);
        return null;
      }
    }
    catch (SQLiteDatabaseLockedException localSQLiteDatabaseLockedException)
    {
      throw localSQLiteDatabaseLockedException;
    }
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    b.a(this.a.c(), paramSQLiteDatabase);
  }
  
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
  
  public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    if (Build.VERSION.SDK_INT < 15)
    {
      Object localObject = null;
      try
      {
        Cursor localCursor = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
        localObject = localCursor;
        localCursor.moveToFirst();
        if (localCursor != null) {
          localCursor.close();
        }
      }
      finally
      {
        if (localObject != null) {
          ((Cursor)localObject).close();
        }
      }
    }
    b.a(this.a.c(), paramSQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */