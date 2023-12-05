package com.example.listcontacts.data.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.listcontacts.data.model.DataContacts;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DaoContacts_Impl implements DaoContacts {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DataContacts> __insertionAdapterOfDataContacts;

  private final EntityDeletionOrUpdateAdapter<DataContacts> __deletionAdapterOfDataContacts;

  public DaoContacts_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDataContacts = new EntityInsertionAdapter<DataContacts>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `contacts` (`id`,`logoAvatar`,`name`,`number`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DataContacts entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getLogoAvatar() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getLogoAvatar());
        }
        if (entity.getName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getName());
        }
        if (entity.getNumber() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getNumber());
        }
      }
    };
    this.__deletionAdapterOfDataContacts = new EntityDeletionOrUpdateAdapter<DataContacts>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `contacts` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DataContacts entity) {
        statement.bindLong(1, entity.getId());
      }
    };
  }

  @Override
  public void insertContacts(final DataContacts dataContacts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDataContacts.insert(dataContacts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteContacts(final DataContacts dataContacts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfDataContacts.handle(dataContacts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<DataContacts>> gelAllContacts() {
    final String _sql = "Select * from contacts";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"contacts"}, false, new Callable<List<DataContacts>>() {
      @Override
      @Nullable
      public List<DataContacts> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfLogoAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "logoAvatar");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
          final List<DataContacts> _result = new ArrayList<DataContacts>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DataContacts _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpLogoAvatar;
            if (_cursor.isNull(_cursorIndexOfLogoAvatar)) {
              _tmpLogoAvatar = null;
            } else {
              _tmpLogoAvatar = _cursor.getString(_cursorIndexOfLogoAvatar);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpNumber;
            if (_cursor.isNull(_cursorIndexOfNumber)) {
              _tmpNumber = null;
            } else {
              _tmpNumber = _cursor.getString(_cursorIndexOfNumber);
            }
            _item = new DataContacts(_tmpId,_tmpLogoAvatar,_tmpName,_tmpNumber);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
