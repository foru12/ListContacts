package com.example.listcontacts.data.db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/listcontacts/data/db/AppDataBaseContacts;", "Landroidx/room/RoomDatabase;", "()V", "contactsDao", "Lcom/example/listcontacts/data/dao/DaoContacts;", "Companion", "ContactsDatabaseCallback", "app_debug"})
@androidx.room.Database(entities = {com.example.listcontacts.data.model.DataContacts.class}, version = 1)
@androidx.room.TypeConverters(value = {com.example.listcontacts.data.helper.Converter.class})
public abstract class AppDataBaseContacts extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.Nullable
    private static com.example.listcontacts.data.db.AppDataBaseContacts INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final com.example.listcontacts.data.db.AppDataBaseContacts.Companion Companion = null;
    
    public AppDataBaseContacts() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.listcontacts.data.dao.DaoContacts contactsDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/listcontacts/data/db/AppDataBaseContacts$Companion;", "", "()V", "INSTANCE", "Lcom/example/listcontacts/data/db/AppDataBaseContacts;", "destroyInstance", "", "getInstance", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.example.listcontacts.data.db.AppDataBaseContacts getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        kotlinx.coroutines.CoroutineScope scope) {
            return null;
        }
        
        public final void destroyInstance() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/listcontacts/data/db/AppDataBaseContacts$ContactsDatabaseCallback;", "Landroidx/room/RoomDatabase$Callback;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "onOpen", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "populateDatabaseContacts", "cantactsDao", "Lcom/example/listcontacts/data/dao/DaoContacts;", "app_debug"})
    static final class ContactsDatabaseCallback extends androidx.room.RoomDatabase.Callback {
        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.CoroutineScope scope = null;
        
        public ContactsDatabaseCallback(@org.jetbrains.annotations.NotNull
        kotlinx.coroutines.CoroutineScope scope) {
            super();
        }
        
        @java.lang.Override
        @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
        public void onOpen(@org.jetbrains.annotations.NotNull
        androidx.sqlite.db.SupportSQLiteDatabase db) {
        }
        
        public final void populateDatabaseContacts(@org.jetbrains.annotations.NotNull
        com.example.listcontacts.data.dao.DaoContacts cantactsDao) {
        }
    }
}