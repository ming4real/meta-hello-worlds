fn main() {
    let mut buffer = itoa::Buffer::new();
    let answer = buffer.format(42);

    println!("hello-rust: built by BitBake with a locked crate dependency");
    println!("itoa formatted the answer as: {answer}");
}
