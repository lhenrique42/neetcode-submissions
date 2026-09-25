class MinStack {
    private values: number[] = [];
    private min: number[] = [];

    constructor() {
        this.values = [];
    }

    /**
     * @param {number} val
     * @return {void}
     */
    push(val: number): void {
        this.values.push(val);

        if (this.min.length === 0) {
            this.min.push(val);
        } else {
            this.min.push(Math.min(val, this.min.at(this.min.length - 1)));
        }
    }

    /**
     * @return {void}
     */
    pop(): void {
        this.values.pop();
        this.min.pop();
    }

    /**
     * @return {number}
     */
    top(): number {
        return this.values.at(this.values.length - 1);
    }

    /**
     * @return {number}
     */
    getMin(): number {
        return this.min.at(this.min.length - 1);
    }
}
