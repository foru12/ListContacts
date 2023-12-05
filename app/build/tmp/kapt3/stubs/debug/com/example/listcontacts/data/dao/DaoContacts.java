package com.example.listcontacts.data.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/listcontacts/data/dao/DaoContacts;", "", "deleteContacts", "", "dataContacts", "Lcom/example/listcontacts/data/model/DataContacts;", "gelAllContacts", "Landroidx/lifecycle/LiveData;", "", "insertContacts", "app_debug"})
@androidx.room.Dao
public abstract interface DaoContacts {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertContacts(@org.jetbrains.annotations.NotNull
    com.example.listcontacts.data.model.DataContacts dataContacts);
    
    @androidx.room.Query(value = "Select * from contacts")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.listcontacts.data.model.DataContacts>> gelAllContacts();
    
    @androidx.room.Delete
    public abstract void deleteContacts(@org.jetbrains.annotations.NotNull
    com.example.listcontacts.data.model.DataContacts dataContacts);
}