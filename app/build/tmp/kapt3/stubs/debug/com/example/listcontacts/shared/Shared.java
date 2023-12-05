package com.example.listcontacts.shared;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/listcontacts/shared/Shared;", "Lcom/example/listcontacts/shared/SharedService;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "getSharedContains", "Lcom/de/sertsa/nds/wqer/shared/GetSharedContains;", "getSharedData", "Lcom/de/sertsa/nds/wqer/shared/GetSharedData;", "getSharedSave", "Lcom/de/sertsa/nds/wqer/shared/GetSharedSave;", "contains", "", "key", "", "getData", "saveData", "", "value", "app_debug"})
public final class Shared implements com.example.listcontacts.shared.SharedService {
    @org.jetbrains.annotations.NotNull
    private final android.app.Activity activity = null;
    @org.jetbrains.annotations.NotNull
    private final com.de.sertsa.nds.wqer.shared.GetSharedSave getSharedSave = null;
    @org.jetbrains.annotations.NotNull
    private final com.de.sertsa.nds.wqer.shared.GetSharedData getSharedData = null;
    @org.jetbrains.annotations.NotNull
    private final com.de.sertsa.nds.wqer.shared.GetSharedContains getSharedContains = null;
    
    public Shared(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.Activity getActivity() {
        return null;
    }
    
    @java.lang.Override
    public void saveData(@org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    java.lang.String key) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.String getData(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
        return null;
    }
    
    @java.lang.Override
    public boolean contains(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
        return false;
    }
}