package com.example.listcontacts.ui.contacts;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0017J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/listcontacts/ui/contacts/AdapterContacts;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/listcontacts/ui/contacts/MyViewHolder;", "()V", "contactsList", "", "Lcom/example/listcontacts/data/model/DataContacts;", "onItemClickListener", "Lcom/example/listcontacts/ui/contacts/AdapterContacts$OnItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnContactsClickListener", "set\u0421ontacts", "listContacts", "", "OnItemClickListener", "app_debug"})
public final class AdapterContacts extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.listcontacts.ui.contacts.MyViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.listcontacts.data.model.DataContacts> contactsList;
    @org.jetbrains.annotations.Nullable
    private com.example.listcontacts.ui.contacts.AdapterContacts.OnItemClickListener onItemClickListener;
    
    public AdapterContacts() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setСontacts(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.listcontacts.data.model.DataContacts> listContacts) {
    }
    
    public final void setOnContactsClickListener(@org.jetbrains.annotations.NotNull
    com.example.listcontacts.ui.contacts.AdapterContacts.OnItemClickListener onItemClickListener) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.listcontacts.ui.contacts.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.listcontacts.ui.contacts.MyViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/listcontacts/ui/contacts/AdapterContacts$OnItemClickListener;", "", "onContactsClick", "", "contacts", "Lcom/example/listcontacts/data/model/DataContacts;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onContactsClick(@org.jetbrains.annotations.NotNull
        com.example.listcontacts.data.model.DataContacts contacts);
    }
}