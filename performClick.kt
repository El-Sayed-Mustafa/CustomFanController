override fun performClick(): Boolean {
   if (super.performClick()) return true

   fanSpeed = fanSpeed.next()
   contentDescription = resources.getString(fanSpeed.label)

   invalidate()
   return true
}