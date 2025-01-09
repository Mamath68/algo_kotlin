package major

class VersionManager(initialVersion: String = "0.0.1") {
    private var history = mutableListOf<Triple<Int, Int, Int>>()
    private var major: Int = 0
    private var minor: Int = 0
    private var patch: Int = 0

    init {
        val parts = initialVersion.split(".")
        if (parts.size > 3) {
            parts.subList(0, 3)
        }
        try {
            major = parts[0].toInt()
            minor = if (parts.size > 1) parts[1].toInt() else 0
            patch = if (parts.size > 2) parts[2].toInt() else 0
        } catch (e: NumberFormatException) {
            throw Exception("Une erreur s'est produite lors de l'analyse de la version !")
        }
    }

    fun major(): VersionManager {
        return this
    }

    fun minor(): VersionManager {

        return this
    }

    fun patch(): VersionManager {

        return this
    }

    fun rollback(): VersionManager {

        return this
    }

    fun release(): String {
        return "$major.$minor.$patch"
    }
}
