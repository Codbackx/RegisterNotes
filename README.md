# Archivos Importantes para usar Room

## Archivos importantes

### 1. [Modelo de la tabla](https://github.com/JeancaDeve/RegisterNotes/blob/master/app/src/main/java/com/codycod/notecod/data/models/MdNote.kt)

### 2. [Dao](https://github.com/JeancaDeve/RegisterNotes/blob/master/app/src/main/java/com/codycod/notecod/data/dao/NotaDao.kt)

### 3. [Database](https://github.com/JeancaDeve/RegisterNotes/blob/master/app/src/main/java/com/codycod/notecod/data/database/AppDatabase.kt)

### 4. [Repositorio](https://github.com/JeancaDeve/RegisterNotes/blob/master/app/src/main/java/com/codycod/notecod/data/repositories/NoteRepository.kt)

### 5. [ViewModel](https://github.com/JeancaDeve/RegisterNotes/blob/master/app/src/main/java/com/codycod/notecod/data/viewmodels/NotaViewModel.kt)

### 6. [ViewHolder](https://github.com/JeancaDeve/RegisterNotes/blob/master/app/src/main/java/com/codycod/notecod/ui/viewholders/NotesListViewHolder.kt)

### 7. [Adapter](https://github.com/JeancaDeve/RegisterNotes/blob/master/app/src/main/java/com/codycod/notecod/ui/adapters/NotesListAdapter.kt)

### 8. [Actividad de la Lista de registros](https://github.com/JeancaDeve/RegisterNotes/blob/master/app/src/main/java/com/codycod/notecod/ui/activities/NotesListActivity.kt)

### 9. [Actividad para agregar un nuevo registro](https://github.com/JeancaDeve/RegisterNotes/blob/master/app/src/main/java/com/codycod/notecod/ui/activities/AddNoteActivity.kt)

## Importaciones necesarias

### Agregar eso en Plugins id("kotlin-kapt")

### Room

implementation("androidx.room:room-runtime:2.6.1")

kapt("androidx.room:room-compiler:2.6.1")

implementation("androidx.room:room-ktx:2.6.1")

### Coroutines
    
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")

implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")

### Lifecycle

implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.2")

implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.2")


