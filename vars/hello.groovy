def call(String name) {
  echo "running this in vars by ${name}"
  echo "build no is: ${this.env.BUILD_NUMBER}"
}
