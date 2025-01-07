package moyen

class TimeCalc {

    fun formatDuration(seconds: Long): String {
        if (seconds.toInt() == 0) return "now"

        val years = seconds / (365 * 24 * 3600)
        val days = (seconds % (365 * 24 * 3600)) / (24 * 3600)
        val hours = (seconds % (24 * 3600)) / 3600
        val minutes = (seconds % 3600) / 60
        val secs = seconds % 60

        val parts = mutableListOf<String>()
        if (years > 0) parts.add("$years ${if (years > 1) "ans" else "an"}")
        if (days > 0) parts.add("$days ${if (days > 1) "jours" else "jours"}")
        if (hours > 0) parts.add("$hours ${if (hours > 1) "heures" else "heure"}")
        if (minutes > 0) parts.add("$minutes ${if (minutes > 1) "minutes" else "minute"}")
        if (secs > 0) parts.add("$secs ${if (secs > 1) "secondes" else "seconde"}")

        return parts.joinToString(", ").replace(", (?=[^,]+$)".toRegex(), " et ")
    }
}